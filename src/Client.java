import java.util.Scanner;

/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()) {
            String s=sc.next();
            System.out.println(s);
        }
        sc.close();
    }
    
}