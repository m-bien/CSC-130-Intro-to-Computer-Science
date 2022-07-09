package GroupLab8;

import java.util.Scanner;
/**
 * My words and actions will reflect Academic Integrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Madelyn Good     11/3/21
 */

// Lab Eight

/* 
   Madelyn Good
   CSC 130-01
*/

public class GroupLab8 {
    public static void main(String[] args) {
        System.out.println("Lab Eight");
        System.out.println("Austin Gain");
        System.out.println("Kahlin Giddings");
        System.out.println("Madelyn Good");
        System.out.println("Bryan Ochs");
        System.out.println("CSC 130-01");
        
        System.out.println("\nThis program has 4 methods.");
        System.out.println("The 1st method is called getWholeNumber().");
        System.out.println("It gets an integer from a user and returns that value.");
        System.out.println("The 2nd method is called getRealNumber().");
        System.out.println("It gets a real number from a user and returns that value");
        System.out.println("The program has an example of overloading.");
        System.out.println("The 3rd method is called printCharacter().");
        System.out.println("It uses the value from the getWholeNumber() method and displays the number and its character equivalent.");
        System.out.println("The 4th method is also called printCharacter().");
        System.out.println("It uses the value from the getRealNumber() method and displays the number and its character equivalent.");
        System.out.println("In order to be able to print from the ASCII table, the program limits the values that the user can enter.");
        System.out.println("\n*** You will enter values in the range of 33-126 for whole numbers and 33.0-126.0 for real numbers ***");
        
        // variables
        int wholeNumber = getWholeNumber();
        double realNumber = getRealNumber();
        printCharacter(wholeNumber);
        printCharacter(realNumber);
        myMath(wholeNumber, realNumber);    
        
    }
        // ----- method 1 whole number -----
        public static int getWholeNumber() {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("\nEnter a whole number, one that does not have a decimal point: ");
            int wholeNumber = scanner.nextInt();
            
            return wholeNumber;
        }
        
        // ----- method 2 real number -----
        public static double getRealNumber() {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a real number, one that does have a decimal point: ");
            double realNumber = scanner.nextDouble();
            
            return realNumber; 
        }
        
        // ----- method 3 whole number to character -----
        public static void printCharacter(int wholeNumber) {
            
            int letter = (char)wholeNumber;
            System.out.println("The number is " + wholeNumber + " and the character for this is a(n) " + (char)letter);
            
        }
        
        // ----- method 4 real number to character -----
        public static void printCharacter(double realNumber) {
            
            double letter = Math.round(realNumber);
            System.out.println("The number is " + realNumber + " and the character for this is a(n) " + (char)letter);
            
        }
        
        // ----- method 5 math class methods -----
        public static void myMath(int wholeNumber, double realNumber) {
            
            // decrement
            System.out.println("\n\nThe argument of " + wholeNumber + " decremented by one is " + Math.decrementExact(wholeNumber));
            
            // minimum
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter a whole number, one that does not have a decimal point: ");
            int secondNumber = scanner.nextInt();
            System.out.print("The minimum of the two numbers " + wholeNumber + " and " + secondNumber + " is " + Math.min(wholeNumber, secondNumber));
            
            // log
            System.out.printf("\n\nThe logarithm of %.2f is %.3f " , realNumber , Math.log(realNumber));
            
            // floor
            System.out.printf("\nThe floor of %.2f is %.3f " , realNumber, Math.floor(realNumber));
            System.out.println();
        }
    }