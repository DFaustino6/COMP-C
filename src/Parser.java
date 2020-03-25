/**
 * Parser
 */
public class Parser {

    public Parser(String s) throws Exception{
        if(s.charAt(s.length()-1) != '$')
            throw new Exception("Wrong input format, must end in '$'");
        
    }
}