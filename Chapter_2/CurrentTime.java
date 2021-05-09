
/**
 * CurrentTime.java, gives a program that displays the current time in GMT.Revise the program so it prompts the user to 
 * enter the time zone offset to GMT and displays the time in the specified time zone.
 * 
 * Autor : Harmeet Matharoo
 * Date : 05 May 2021
*/
import java.util.Scanner;
public class CurrentTime {
    public static void main(String [] args) {
        
        
        // Obtain the total milliseconds since midnight, Jan 1, 1970 
        long totalMilliseconds = System.currentTimeMillis(); 
        
        // Obtain the total seconds since midnight, Jan 1, 1970 
        long totalSeconds = totalMilliseconds / 1000; 
        
        // Compute the current second in the minute in the hour 
        long currentSecond = totalSeconds % 60;
        
        // Obtain the total minutes 
        long totalMinutes = totalSeconds / 60; 
        
        // Compute the current minute in the hour 
        long currentMinute = totalMinutes % 60; 
        
        // Obtain the total hours 
        long totalHours = totalMinutes / 60; 
        
        // Compute the current hour 
        long currentHour = totalHours % 24;
            
        
        //Enter the timezone offset to GMT : "ask for input"
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the timezone offset to GMT : ");
        
        int offset = input.nextInt();
        
        long currentOffsetHour = (totalHours + offset) % 24; 
    
        
        // Display results 
        System.out.println("Current time is " + currentOffsetHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        
        input.close()
        
    }
}
