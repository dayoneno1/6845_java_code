import java.util.Scanner;
public class W09_02_BMI{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter weight (kg)");
        double weight = (kb.nextDouble());

        System.out.println("Enter hright (m)");
        double height = (kb.nextDouble());
        double bmi = weight / (height*height);

        System.out.println("Your BMI is:" + bmi);

        if (bmi > 40 ) {        
           System.out.println("Grade 3 obesity");
        }else if (bmi >= 35) {
            System.out.println("Grade 2 obesity");
        }else if (bmi >= 30) {
            System.out.println("Grade 1 obesity");
        }else if (bmi >= 25) {
            System.out.println("Overweight");
        }else if (bmi >= 18.5) {
            System.out.println("normal weight");
        }else {
             System.out.println("Underweight");
        }

        kb.close();

    }
}