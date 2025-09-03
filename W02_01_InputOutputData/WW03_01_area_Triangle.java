import java.util.Scanner;
public class WW03_01_area_Triangle {

    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);

        // Input base and height of triangle
        System.out.println("Enter height = "); // แสดงข้อความให้ผู้ใช้ป้อนฐานในรูแสี่เหลี่ยน
        int height = kd.nextInt(); // รับคเาฐานจากผู้ใช้ที่กรอกผ่านตีย์บอร์ดเป็นตัวเลขจำนวนเต็ม
        System.out.println("Enter base = ");
        int base = kd.nextInt();

        //Calculate area of triangir
        double area = 0.5*base*height; //หรือใส่ชนิดข้อมูลเป็น floot ก็ได้


        //Output area of triangle
        System.out.println("Area of triangle = " + area);
        kd.close(); // ปิดอ็อบเจกต์ Scannen เพิ่อป้องกันกานรั่วไหลของทรัพยากร
    }
}