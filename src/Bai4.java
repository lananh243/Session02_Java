import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a : ");
        boolean a = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập b : ");
        boolean b = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập c : ");
        boolean c = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(a && b ? "Cả 2 đều đúng" : "Hoặc a sai hoặc b sai");
        System.out.println(a || b ? "Trong a và b có ít nhất 1 giá trị đúng" : "Cả 2 giá trị a và b đều sai");
        System.out.println(!c ? "Phủ định c là đúng" : "Phủ định của c là sai");
    }
}
