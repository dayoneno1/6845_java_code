
 import java.util.Scanner;
 public class W05_01_InputOutputData {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Value a: ");
        int a = kb.nextInt();
        System.out.println("Enter Value b: ");
        int b = kb.nextInt();
        

        System.out.println("Bafore : Output of Value a = " + b);
        System.out.println("Bafore : Output of Value b = " + a);

        int temp = a;
        a = b;
        b = temp;
    
        System.out.println("Bafore : Output of Value a = " + b);
        System.out.println("Bafore : Output of Value b = " + a);

        int x = 6;
        System.out.println(x-- + ++x - --x - x-- + x++ + x);

        int d = 21, f = 0; 
        System.out.println("a" + (a - b) );

        double p = 1.0, y = 1.000;
        System.out.println(p > y);


        double u = 1.6; u += 5.1;
        System.out.println (u % 4);
    }
 }

 



