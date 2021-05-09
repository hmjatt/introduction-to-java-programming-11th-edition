
/**
 * (Multiply the digits in an integer) Write a program that reads an integer between 0 and 1000 and multiplies 
 * all the digits in the integer. For example, if an integer is 932, the multiplication of all its digits is 54.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. 
 * For instance, 932 % 10 = 2 and 932 / 10 = 93.
 *
 * Author : Harmeet Matharoo
 * Date : May 04 2021
 */
import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Enter a number between 0 and 1000: asks for input
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        
        //The multiplication of all digits in "input" is: calculate it first
        
        // extracts last digit of input
        int num1 = number % 10;
        // remove the extracted digit
        int rem1 = number / 10;
        //extract the last digit(with whats left)
        int num2 = rem1 % 10;
        //remove the extracted digit
        int rem2 = rem1 / 10;
        //calculate the multiplication
        int multiplication = num1 * num2 * rem2;
        
        //print it out
        System.out.println("The multiplication of all digits in " + number + " is : " + multiplication);
        
        input.close();
        
    }
}
