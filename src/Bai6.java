import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Nhập thông tin sinh viên----------------------");
        System.out.println("Nhập tên học sinh : ");
        String studentName  = scanner.nextLine();

        System.out.println("Nhập điểm môn học 1 : ");
        float subject1 = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập điểm môn học 2 : ");
        float subject2 = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập điểm môn học 3 : ");
        float subject3 = Float.parseFloat(scanner.nextLine());

        float averageScore = (subject1+subject2+subject3)/3;

        System.out.println("------------Hiển thị thông tin sinh viên-------------------");
        System.out.println("Tên sinh viên : "+studentName);
        System.out.print("Điểm môn 1 : "+subject1);
        System.out.print(" | Điểm môn 2 : "+subject2);
        System.out.print(" | Điểm môn 3 : "+subject3);
        System.out.println("\n Điểm trung bình : "+averageScore);
        System.out.printf("Đánh giá : %s", averageScore > 5.0 ? "Lên lớp" : "Học lại");
    }
}
