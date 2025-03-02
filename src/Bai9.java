import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cạnh a : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cạnh b : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cạnh c : ");
        double c = Double.parseDouble(scanner.nextLine());

        double p = a +b +c;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Chu vi : "+p);
        System.out.println("Diện tích : "+S);
    }
}
