

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
    public String validate(String s){
        return is_valid(s)
        ? "accepted"
        : "rejected";
    }

    public boolean is_valid(String s){
        string = s;
        token = string.charAt(pos++);
        try {
            E();
        }
        catch (Exception e){
            return false;
        }
        return token == '$';
    }

    private void E() throws Exception {
        T();
        X();
    }

    private void X() throws Exception {
        if(token == '+') {
            match('+');
            E();
        }
    }

    private void T() throws Exception{
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
            default: throw new Exception("Error: expected ( or int");
        }
    }

    private void Y() throws Exception {
        if(token == '*') {
            match('*');
            T();
        }
    }

    private void match(char tok){
        if(tok == token) {
            token=string.charAt(pos++);
        } /*else
            System.out.println("Error: token " + tok + " expected");*/
    }

}