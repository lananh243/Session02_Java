import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chiều dài HCN : ");
        float width = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập vào chiều rộng HCN : ");
        float height = Float.parseFloat(scanner.nextLine());

        float area =  width*height;
        float circumference = (width+height)*2;

        System.out.println("Diện tích hình chữ nhật : "+area);
        System.out.println("Chu vi hình chữ nhật : "+circumference);
    }
}
