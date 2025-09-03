import java.util.Scanner;
import java.time.Year;

public class W09_If_Eilse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 9-digit Student ID: ");
        int studentId = scanner.nextInt();

        // ดึงปีที่เข้าเรียน (2 หลักแรกของรหัส)
        int admissionYearShort = studentId / 10000000;   // เช่น 684230001 -> 68

        // แปลงเป็นปี พ.ศ. (4 หลัก)
        int admissionYearBE = 2500 + admissionYearShort; // เช่น 68 -> 2568

        // หาเวลาปัจจุบันเป็นปี พ.ศ.
        int currentYearBE = Year.now().getValue() + 543;

        // คำนวณชั้นปี (ปีปัจจุบัน - ปีที่เข้า + 1)
        int studyYearLevel = currentYearBE - admissionYearBE + 1;

        // แสดงผลลัพธ์ตามชั้นปี
        if (studyYearLevel == 1) {
            System.out.println("1 (Freshmen)");
        } else if (studyYearLevel == 2) {
            System.out.println("2 (Sophomore)");
        } else if (studyYearLevel == 3) {
            System.out.println("3 (Junior)");
        } else if (studyYearLevel == 4) {
            System.out.println("4 (Senior)");
        } else {
            System.out.println(studyYearLevel + " (Beyond 4 years)");
        }
    }
}
