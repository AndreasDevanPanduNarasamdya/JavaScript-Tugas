import java.math.BigInteger;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B = scanner.nextLine();
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        int Lexicon = A.compareTo(B);
        System.out.println(A.length() + B.length());

        if (Lexicon == 0)
        {
            System.out.println("Equal");
        }
        else if (Lexicon < 0)
        {
            System.out.println("No");
        }
        else if (Lexicon > 0)
        {
            System.out.println("Yes");
        }
        System.out.println( A + " " + B);

        scanner.close();
    }
}
