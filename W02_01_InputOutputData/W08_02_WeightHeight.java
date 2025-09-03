import java.util.Scanner;
public class W08_02_WeightHeight {

  public static void main(String [] args) {
         System.out.println("Enter weight");
         Scanner kb = new Scanner(System.in);
         System.out.println("Enter your weight (kg): ");
         double weight = kb.nextDouble();
         System.out.println("Enter your heigt (m): ");
         double height = kb.nextDouble();

         double bmi = weight / (height * height);

         System.out.println("your BMT is: + bmi");

         kb.close();
    }
}