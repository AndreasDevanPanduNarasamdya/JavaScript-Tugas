import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        BigInteger T = scanner.nextBigInteger();

        if ((T.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) && (T.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0))
        {
            System.out.println( T +" can be fitted in:\r\n" + //
                                "* byte\r\n" + //
                                "* short\r\n" +
                                "* int\r\n" + //
                                "* long");
        }
        else if ((T.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) && (T.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0))
        {
            System.out.println( T +" can be fitted in:\r\n" + //
                                "* short\r\n" +
                                "* int\r\n" + //
                                "* long");
        }
        else if ((T.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) && (T.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0))
        {
            System.out.println( T +" can be fitted in:\r\n" +//
                                "* int\r\n" + //
                                "* long");
        }
        else if ((T.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) && (T.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0))
        {
            System.out.println( T +" can be fitted in: long");
        }
        else
        {
            System.out.println( T +" can't be fitted anywhere");
        }
    }
}