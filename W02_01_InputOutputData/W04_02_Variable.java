public class W04_02_Variable {
    public static void main(String[] args) {
        // ประกาศตัวแปลและชนิดข้อมูล
        byte a;
        byte b;

        // เราสามารถรวมตัวแปลที่แระกาศไว้แล้วให้อยู่บรรทัดเดียวกันได้
        // ประกาศตัวแปล a และ b เป็นชนิดข้อมูล bvte
        // bvte a, b; // ประกาศตัวแปล a และ b เป็นชนิดข้อมูล bvte
        // bvte aa, bb; // ประกาศตัวแปล a และ b เป็นชนิดข้อมูล bvte
        // bvte aaa =0, bbb = 0; // ประกาศตัวแปล a และ b เป็นชนิดข้อมูล bvte และกำหนดค่าเริ่มต้นเป็น 0

        // กำหนดค่าให้กับตัวแปล
        a = 10; // กำหนดค่า 10 ให้กับตัวแปล a
        b = 20; // กำหนดค่า 20 ให้กับตัวแปล b


        // ประกาศตัวแปลและชนิดข้อมูล พร้อมกับการกำหนดค่า
        short c = 30; // กำหนดค่า 30 ให้กับตัวแปล c

        int ch = '\u0044' ; // กำหนดค่า 60 (ASCTT ของ '0')ให้กับตัวแปล ch

        System.out.println(ch);


         String ch1 = "\u0044" ; // กำหนดค่า 60 (ASCTT ของ '0')ให้กับตัวแปล ch
         System.out.println(ch1);

         char ch2 = '\u0044' ;
         System.out.println(ch2);

         int var1 = 014;
         System.out.println(var1);

         double var2 = 014f;
         System.out.println(var2);
         
         double var4 = 0E-0;
         System.out.println(var4);

         String var9 = null;
         System.out.println(var9);

         boolean var10 = true;
         System.out.println(var10);
         
         boolean var11 = 2>3;
         System.out.println(var11);

    }
        
    }
        
  