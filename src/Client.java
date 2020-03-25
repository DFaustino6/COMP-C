import java.util.Scanner;

/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()) {
            Parser p = new Parser();
            System.out.println(p.is_valid(sc.next()));
        }
        sc.close();
    }
    
}