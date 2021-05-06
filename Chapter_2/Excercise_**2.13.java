
/**
 * Write a program that prompts the user to enter a monthly saving amount and displays the account value after 
 * the sixth month. (In Exercise 5.30, you will use a loop to simplify the code and display the account value for any month.)
 *
 * Author : Harmeet Matharoo
 * Date : 06 May 2021
 */

import java.util.Scanner;

public class CompoundValue {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //asks for input("amount to save monthly")
        System.out.print("Enter the monthly saving amount: ");
        double saving = input.nextDouble();
        
        // annual interest rate("3.75%")
        double interest = (0.0375 / 12) + 1;
        
        
        double firstMonth = saving * interest;
        double secondMonth = (saving + firstMonth) * interest;
        double thirdMonth = (saving + secondMonth) * interest;
        double fourthMonth = (saving + thirdMonth) * interest;
        double fifthMonth = (saving + fourthMonth) * interest;
        double sixthMonth = (saving + fifthMonth) * interest;
        
        // first month
        System.out.println("After the first month, the account value is " + firstMonth);
        
        // second Month
        System.out.println("After the second month, the account value is " + secondMonth);
        
        // third Month
        System.out.println("After the third month, the account value is " + thirdMonth);
        
        // sixth Month
        System.out.println("After the sixth month, the account value is " + sixthMonth);
        
        input.close();
    }
}
