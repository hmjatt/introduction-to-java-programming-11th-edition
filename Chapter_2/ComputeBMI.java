
/**
 * Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight 
 * in kilograms and dividing, by the square of your height in meters. Write a program that prompts the user 
 * to enter a weight in pounds and height in inches and displays the BMI.
 * 
 * Author : Harmeet Matharoo
 * Date : May 06 2021
 */

import java.util.Scanner;

public class ComputeBMI {
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get weight input in pounds
        System.out.print("Enter weight in pounds: ");
        float weightInPounds = input.nextFloat();
        
        //convert weight into Kilograms
        double weightInKilograms = weightInPounds * 0.45359237 ;
        
        
        //get height input in inches
        System.out.print("Enter height in inches: ");
        float heightInInches = input.nextFloat();
        
        //convert height into meters
        double heightInMeters = heightInInches * 0.0254 ;
        
        //calculate BMI
        double BMI = weightInKilograms / Math.pow(heightInMeters, 2);
        
        //output the BMI
        System.out.println("BMI is " + BMI);
        
        input.close();
    }
}
