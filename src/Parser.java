import java.util.Hashtable;

/**
 * Parser
 */
public class Parser {

    private Hashtable<String,Hashtable<String,String>> lookup;
    private String string;
    private char token;
    private int pos = 0;

    public Parser() {
        string = "";
        token = ' ';
    }

    public boolean is_valid(String s){
        string = s;
        token = string.charAt(pos);
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
                break;
        }
    }

    private void X(){
        switch (token) {
            case '+':
                match('+');
                E();
                break;
        }
    }

    private void Y(){
        switch (token) {
            case '*':
                match('*');
                T();
                break;
        }
    }

    private boolean match(char tok){
        if(tok == token) {
            token=string.charAt(pos++);
            return true;
        }
        System.out.println("Error: token " + tok + " expected");
        return false;
    }

    /*private void tableInitialize(){
        lookup = new Hashtable<String,Hashtable<String,String>>();
        Hashtable<String,String> temp = new Hashtable<String,String>();
    }*/
}