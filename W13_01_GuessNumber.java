package Loop;
import java.util.Scanner;
import java.util.Random;

public class W13_01_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random ran = new Random();
        
        int answer = ran.nextInt(10) + 1;
        int countGuess = 0;
         
        while (countGuess < 3) {
               System.out.println("I want you to enter numbers (1-10)."); 
               int Guess = kb.nextInt();  

               if (answer==Guess) {
                System.out.println("The numbers you entered are correct."); 
                
               }else{
                System.out.println("Please enter a new number.");

               }
               countGuess++;
        }
        }
    }

