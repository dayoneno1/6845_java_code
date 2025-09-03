package Loop;

public class W10_02_While_Even {
    public static void main(String[] args) {
        //loop while แสดงเลขคู่ 10 ตัวแรก โดยให้ค่าเริ่มต้นเท่ากับ 2

        int i = 2;
        int sun = 0;
        while (i <= 20) {  
            sun = sun +2 ;

            if (i<20) {
                System.out.print(i+" + ");

            }else{
                System.out.print(i+" = "+ sun);
            }
            sun += i;
            i = i +2;
            
        }
        
    }
    
}
