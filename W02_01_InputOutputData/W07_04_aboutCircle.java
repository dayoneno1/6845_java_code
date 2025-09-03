import java.util.Scanner;
public class W07_04_aboutCircle {
    public static void main(String[] args) {
        // ต้องการให้ผู้ใชเลือกว่าต้องการคำนวนอะไรเกี่ยวกับวงกลม :คำนวน พื้นที่ หรือเส้นรอบวง
        //สื่งที่ต้องรับเข้ามาเกี่ยวกับวงกลมคือ รัสมี
        // เส้นรอบวง = 2 * pi * r
        // พื้นที่ = pi * r^2

        final double PI =3.14; //ค่าคงที่ของ pi

        Scanner kb =new Scanner (System.in);

        System.out.println("Enter the(radius):");
        double radius = kb.nextDouble();
        System.out.println("Choose a calculation related to a circle");
        System.out.println("1 Circumference");
        System.out.println("2 Area");
        System.out.println("Choose one (1or2)");
        int choice = kb.nextInt();

        if (choice == 1){
         System.out.println(PI*radius*radius);

        } else {
        System.out.println(2*PI*radius);
        }
    }
}