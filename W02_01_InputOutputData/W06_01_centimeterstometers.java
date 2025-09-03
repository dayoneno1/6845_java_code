import java.util.Scanner;
public class W06_01_centimeterstometers  {
    public static void main (String[] args){
     Scanner kb = new Scanner(System.in);
     System.out.print("Enter cm = ");
     int cm =  kb. nextInt();
     int m = cm/100;
     int sum = cm%100;
     System.out.print(cm +"cm = "+ m +" m "+ sum+" cm ");


    }   
}