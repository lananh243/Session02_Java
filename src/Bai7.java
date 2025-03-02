import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giờ ban đầu : ");
        int hour =  Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập phút ban đầu : ");
        int minute =  Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giây ban đầu : ");
        int second =  Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giờ thêm : ");
        int extrahour = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập phút thêm : ");
        int extraminute = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giây thêm : ");
        int extrasecond = Integer.parseInt(scanner.nextLine());

        int time = (hour * 3600) + (minute * 60) + second;
        int extratime = (extrahour * 3600) +  (extraminute * 60) + extrasecond;
        int result = time + extratime;

        int convertHour  = result / 3600;
        int convertMinute = (result % 3600) / 60;
        int convertSecond = result % 60;

        System.out.println("Tổng thời gian : "+convertHour+" giờ "+convertMinute+" phút "+convertSecond+" giây");
    }
}
