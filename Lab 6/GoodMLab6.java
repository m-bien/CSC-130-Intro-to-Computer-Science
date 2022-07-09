package GoodMLab6;

import java.util.Scanner;
/**
 * My words and actions will reflect Academic Integrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Madelyn Good     10/20/21
 */

// Lab Six

/*
   Madelyn Good
   CSC 130-01
**/
public class GoodMLab6 {
    public static void main(String[] args) {
        System.out.println("Lab Six");
        System.out.println("Madelyn Good");
        System.out.println("CSC 130-01");
        System.out.println();
        System.out.println("This program will use a while loop to accept integers from a user");
        System.out.println("  until the user enters a -1");
        System.out.println("The program will count the number of values entered, calculate the sum & average of the numbers,");
        System.out.println("  show how many of the numbers are even, and display the number in binary form");
        
        Scanner scanner = new Scanner(System.in);
        
        // prompt user first time
        System.out.println();
        System.out.print("Please enter a whole number. Enter a -1 (negative 1) to stop: ");
        
        // variables
        int number = scanner.nextInt();
        int sum = 0;
        int count = 0;
        int even = 0;
        double average = 0.0;
        
        // check if first number is even
        if (number % 2 == 0) {
            even++;  
        }
        
        // loop       
        while (number != -1) {
            // prompt user remaining times
            System.out.print("Please enter a whole number. Enter a -1 (negative 1) to stop: "); 
            sum = sum + number;
            number = scanner.nextInt();
            
            count++;
            average = (double)sum / count;
            
            // check if even
            if (number % 2 == 0) {
                even++;
            }
        }    
          
        // display results
        System.out.println();
        System.out.println("You entered " + count + " numbers");
        System.out.printf("The sum of all of the numbers entered is %,1d\n" , sum);
        System.out.printf("The average of all of the numbers entered is %.2f\n" , average);
        System.out.println("Of these numbers, " + even + " of them is/are even.");
        System.out.println("The sum in binary is " + Integer.toString(sum, 2));
    }
}