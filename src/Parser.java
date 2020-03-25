

/**
 * Parser
 */
public class Parser {

    private String string;
    private char token;
    private int pos = 0;

    public Parser() {
        string = "";
    }

    public boolean is_valid(String s){
        string = s;
        token = string.charAt(pos++);
        E();
        return token == '$';
    }

    private void E() {
        T();
        X();
    }
    private void T(){
        switch (token) {
            case 'i':
                match('i');
                Y();
                break;
            case '(':
                match('(');
                E();
                match(')');
                break;
        }
    }

    private void X(){
        if(token == '+') {
            match('+');
            E();
        }
    }

    private void Y(){
        if(token == '*') {
            match('*');
            T();
        }
    }

    private void match(char tok){
        if(tok == token) {
            token=string.charAt(pos++);
        } else
            System.out.println("Error: token " + tok + " expected");
    }

}