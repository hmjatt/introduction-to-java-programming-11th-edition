
/**
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by Christian Zeller to calculate
 * the day of the week. The formula is 26(m + 1) k j h = aq + + k + + + 5jb ,7 10 4 4 where ■■ h is the day 
 * of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, and 6: Friday). 
 * ■■ q is the day of the month. ■■ m is the month (3: March, 4: April, . . ., 12: December). 
 * January and February are counted as months 13 and 14 of the previous year. year ■■ j is . 
 * 100 ■■ k is the year of the century (i.e., year % 100). Note all divisions in this exercise perform 
 * an integer division. Write a program that prompts the user to enter a year, month, and day of the month,
 * and displays the name of the day of the week. Here are some sample runs:
 * Enter year: (e.g., 2012): 2015 
 * Enter month: 1-12: 1 Enter the day of the month: 1-31: 25 Day of the week is Sunday
 *
 * Author : Harmeet Matharoo
 * Date : 09 May 2021
 */

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // get input from user
        System.out.printf("Enter year: (e.g., 2021): ");
        int year = input.nextInt();

        System.out.printf("Enter month: 1-12: ");
        int month = input.nextInt();

        System.out.printf("Enter the day of the month: 1-31: ");
        int dayOfTheMonth = input.nextInt();
        
        //to account for January and February counted as 13 and 14 of previous year
        if (month == 1 || month == 2)
        {
            month = (month == 1) ? 13 : 14;
            year--;
        }

        //Using Zeller's algorithm
        int day = (dayOfTheMonth + ((13 * (month + 1)) / 5) + (year % 100) + 
                ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7;

        //print the day of the week
        switch (day) {
            case 0: System.out.println("Day of the week is Saturday"); break;
            case 1: System.out.println("Day of the week is Sunday"); break;
            case 2: System.out.println("Day of the week is Monday"); break;
            case 3: System.out.println("Day of the week is Tuesday"); break;
            case 4: System.out.println("Day of the week is Wednesday"); break;
            case 5: System.out.println("Day of the week is Thursday"); break;
            case 6: System.out.println("Day of the week is Friday");
        }

        input.close();
    }
}
