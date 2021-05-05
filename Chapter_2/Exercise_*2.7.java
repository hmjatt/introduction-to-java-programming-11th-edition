/**  (Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
* and displays the number of years and remaining days for the minutes. For simplicity, assume that a year has 365 days. 
* Here is a sample run:
* 
* Author : Harmeet Matharoo
* Date : May 04 2021
*/

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        // minutes in a day( 24 * 60 )
        long hoursInDay = 1440;
        //minutes in a year( 60 * 24 * 365 )
        long minutesInYear = 525_600;
        
        
        //Enter the number of minutes : asks for input
        System.out.print("Enter the number of minutes : ");
        long minutes = input.nextLong();
        
       
        //calculte number of years in input
        long years = minutes / minutesInYear;
        //calculate number of days in input
        long days  = (minutes % minutesInYear) / hoursInDay;
       
        //"input" is approximately in " number of years" and "number of days"
        System.out.println(minutes + " is approximately " + years + " years and " + days + " days");
        
        
    
    }
}
