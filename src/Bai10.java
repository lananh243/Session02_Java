import java.math.BigInteger;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a : ");
        String a = scanner.nextLine();
        BigInteger c = new BigInteger(a);

        System.out.println("Nhập b : ");
        String b = scanner.nextLine();
        BigInteger d = new BigInteger(b);

        BigInteger add = c.add(d);
        BigInteger subtract = c.subtract(d);
        BigInteger multiply = c.multiply(d);
        BigInteger divide = c.divide(d);
        BigInteger mod = c.mod(d);
        BigInteger pow = c.pow(10);

        System.out.println("a + b = "+add);
        System.out.println("a - b = "+subtract);
        System.out.println("a * b = "+multiply);
        System.out.println("a / b = "+divide);
        System.out.println("a % b = "+mod);
        System.out.println("a ^ 10 = "+pow);
    }
}
