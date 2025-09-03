import java.util.Scanner;
public class W09_01_CalculapeGrade {

    public static void main (String [] args){
        Scanner kd = new Scanner(System.in);
        System.out.println("How many points did you get?");
        byte score = kd.nextByte();

        if (score >= 0 && score >= 100) {
            if(score >= 80) {
            System.out.println("result : A");
        }else if (score >= 70) {
            System.out.println("result : B");
        }else if (score >= 60) {
            System.out.println("result : c");
        }else if (score >= 50) {
            System.out.println("result : D");
        }else {
            System.out.println("result : F");
        }   
            

    }
}
}