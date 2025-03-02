import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------Nhập thông tin sinh viên-----------------");
        System.out.println("Nhập mã sinh viên : ");
        String studentId = scanner.nextLine();
        System.out.println("Nhập tên sinh viên : ");
        String studentName = scanner.nextLine();
        System.out.println("Nhập số điện thoại sinh viên : ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập ngày sinh sinh viên (dd/mm/yyyy) : ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính sinh viên (1: Nam, 0: Nữ) : ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());


        System.out.println("----------------Nhập điểm sinh viên----------------");
        System.out.println("Nhập điểm Toán : ");
        float Math = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập điểm Lý : ");
        float Physics = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập điểm Hóa : ");
        float Chemistry = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập điểm sinh học : ");
        float Biology = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập điểm ngoại ngữ : ");
        float English = Float.parseFloat(scanner.nextLine());

        float averageScore = (Math + Physics + Chemistry + Biology + English) / 5;
        System.out.println("-----------------Hiển thị thông tin sinh viên-------------------");
        System.out.println("Mã sinh viên : "+studentId);
        System.out.print(" |   Tên sinh viên : "+studentName);
        System.out.printf(" |   Giới tính : %s", gender ? "Nam" : "Nữ");
        System.out.print(" |   Ngày sinh : "+dateOfBirth);
        System.out.print(" |   Số điện thoại : "+phoneNumber);
        System.out.println("\n Điểm Toán : "+Math);
        System.out.print(" |   Điểm vật lý : "+Physics);
        System.out.print(" |   Điểm hóa học : "+Chemistry);
        System.out.print(" |   Điểm sinh học : "+Biology);
        System.out.print(" |   Điểm ngoại ngữ : "+English);
        System.out.println("\n Điểm trung bình : "+averageScore);

    }
}
