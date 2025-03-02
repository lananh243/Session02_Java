import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x : ");
        int x = scanner.nextInt();

        System.out.println("Nhập y : ");
        int y = scanner.nextInt();

        System.out.println("x == y: "+(x==y));
        System.out.println("x != y: " +(x!=y));
        System.out.println("x > y: " +(x>y));
        System.out.println("x < y: " +(x<y));
        System.out.println("x >= y: " +(x>=y));
        System.out.println("x <= y: " +(x<=y));
    }
}
