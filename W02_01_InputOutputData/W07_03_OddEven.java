import java.util.Scanner;
public class W07_03_OddEven {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //input : รับค่าจำนวนเต็มจากผู้ใช้
        System.out.println("Enter a number"); //ข้อความบอกให้ผู้ใข้ป้อนตัวเลข
        int n = kb.nextInt();//ตัวแปรสำหรับเก็บค่าจำนวนเต็มที่ป้อนเข้ามา
        //Process : สูตรคำนวนเลขคู่และเลขตี่
        int remnants = n % 2;// เอาตัวแปรที่รับเข้ามาไปหารด้วย 2
        // Output : แสดงผลลัพธ์    
        if(remnants == 0){
            System.out.println("Number " + n +" is Even");
            //ถ้าเศษที่ได้จากการหารเป็น 0 แสดงว่าเป็นเลขคู่
        }else {
            System.out.println("Number" + n + " is Odd");
            //ถ้าเศษที่ได้จากการหารเป็น 0 แสดงว่าเป็นเลขคี่
        }

        

    }
    
}