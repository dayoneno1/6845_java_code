import java.util.Scanner;
public class W07_02_square_root {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a numder to find its saquare root");
    double x = (input.nextDouble());

    if(x > 0 ) {
        double squareRoot = Math.sqrt(x);
        System.out.println("Square root of "+x+"is"+squareRoot);
    }else {
        System.out.println ("Error: The number must be positive");}
    }
    
}
