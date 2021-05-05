/**(Financial application: calculate tips)
 * Write a program that reads the subtotal and the gratuity rate and then computes 
 * the gratuity and total. For example, 
 * if the user enters 10 for subtotal and 12% for gratuity rate,
 * the program displays $1.2 as gratuity and $11.2 as total.
 * 
 * Author : Harmeet Matharoo
 * Date : May 04 2021
 * 
*/
import java.util.Scanner;

public class CalculateTips {

    public static void main(String[] args) {
        
        // Enter the subtotal and gratuity rate: asks for input
        System.out.println("Enter the subtotal and gratuity rate: ");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = gratuityRate/100 * subtotal;
        double total = gratuity + subtotal;
        
        //The Gratuity is "amount" and the total is "amount"
        System.out.println("The gratuity is " + (gratuityRate/100 * subtotal) + 
        " and the total is " + total);
    }
}
