
/**
 * Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant.
 * If the discriminant is positive, display two roots. If the discriminant is 0, display one root.
 * Otherwise, display “The equation has no real roots.”
 *
 * Author : Harmeet Matharoo
 * Date : 08 May 2021
 * 
 */

import java.util.Scanner;

public class SolveQuadraticEquation
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
                
        System.out.print("Enter a, b, c: ");
        //Enter a, b, c: 1.0 3 1 "asks for input"
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        
        double discriminant = (Math.pow(b, 2)) - (4 * a * c) ;
        double root1 = (-b + (Math.pow(discriminant , 0.5))) / (2 * a) ;
        double root2 = (-b - (Math.pow(discriminant , 0.5))) / (2 * a) ;

        
        if ( discriminant > 0) {
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        }
        else if (discriminant == 0) {
            System.out.println("The equation has one root" + root1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
        
        input.close();
    }
}
