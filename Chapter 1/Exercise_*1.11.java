/**
 * Write a program to display the population for each of the next five years.
 *
 * @Harmeet Matharoo
 * @May 02 2021
 */
public class PopulationProjection {

    public static void main(String [] args) {

        
        double seconds = 31536000; // 60 * 60 * 24 * 365(seconds in a year)
        double birth  = seconds / 7;
        double death = seconds / 13;
        double newImmigrant = seconds / 45;

        //current populaton(assume)
        double population = 312032486;
        
        // growth every year 
        
        double growth = birth + death + newImmigrant;
         
        //population increase each year
        double year1 = population + growth;
        double year2 = year1 + growth;
        double year3 = year2 + growth;
        double year4 = year3 + growth;
        double year5 = year4 + growth;
      
        
        
        //printing out population in scientific notation as per author asked.
        System.out.println("Population for year one is :  " + year1);
        System.out.println("Population for year two is :  " + year2);
        System.out.println("Population for year three is :  " + year3);
        System.out.println("Population for year four is :  " + year4);
        System.out.println("Population for year five is :  " + year5 );
    
    }
}
