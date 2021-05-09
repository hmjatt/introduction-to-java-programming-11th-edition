
/**
 * (Algebra: solve 2 * 2 linear equations) A linear equation can be solved usin Cramer’s rule. Write a program that prompt the
 * user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report that “The equation has no solution.”
 *
 * Author : Harmeet Matharoo
 * Date : 08 May 2021
 */

import java.util.Scanner;

public class LinearEquations {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a, b, c, d, e, f: ");
        
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float d = input.nextFloat();
        float e = input.nextFloat();
        float f = input.nextFloat();
        
        float denominator = (a * d) - (b * c);
        
        float x = ((e * d) - (b * f)) / denominator; 
        float y = ((a * f) - (e * c)) / denominator;
        
        
        if (denominator == 0) {
            System.out.println("The equation has no solution");
        }
        else {
            System.out.println("x is " + x + "and y is " + y);
        }
            
        input.close();
    }
}
