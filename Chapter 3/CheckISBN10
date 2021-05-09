
/**
 * convention. Write a program that prompts the user to enter the first 9 digits and displays the 10-digit
 * ISBN (including leading zeros). Your program should read the input as an integer. Here are sample runs:
 *
 * Author : Harmeet Matharoo
 * Date : 09 May 2021
 */

import java.util.Scanner;

public class CheckISBN10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");

        int isbn = input.nextInt();

        // Extract the digits from the input
        int d1 = isbn / 100000000;
        
        int remainingDigits = isbn % 100000000;
        
        int d2 = remainingDigits / 10000000;
        remainingDigits %= 10000000;
        
        int d3 = remainingDigits / 1000000;
        remainingDigits %= 1000000;
        
        int d4 = remainingDigits / 100000;
        remainingDigits %= 100000;
        
        int d5 = remainingDigits / 10000;
        remainingDigits %= 10000;
        
        int d6 = remainingDigits / 1000;
        remainingDigits %= 1000;
        
        int d7 = remainingDigits / 100;
        remainingDigits %= 100;
        
        int d8 = remainingDigits / 10;
        remainingDigits %= 10;
        
        int d9 = remainingDigits;

        //calculate d10
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        // Display the 10-digit ISBN
        if (d10 == 10)
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 
                + d6 + d7 + d8 + d9 + "X");
        else
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 
                + d6 + d7 + d8 + d9 + d10);
        
        input.close();
    }
}
