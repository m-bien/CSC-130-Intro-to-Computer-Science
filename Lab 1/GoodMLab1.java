package GoodMLab1;

import java.util.Scanner; 
/**
 * My words and actions will reflect Academic Inegrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Madelyn Good     08/23/2021
 */

// Lab One

/*
    Madelyn Good
    CSC 130, Sec 1
**/

public class GoodMLab1 {
    public static void main(String[] args) {
        
        System.out.println("Lab One");
        System.out.println("Madelyn Good");
        System.out.println("CSC 130-01");
        System.out.println();

        // ----- program information -----
        System.out.println("This program will define and initialize two numbers.");
        System.out.println("The user will be asked to enter two numbers.");
        System.out.println("The program will then do the calculations to show you");
        System.out.println("  the sum, product, and difference of the two numbers.");
        System.out.println();
        
        // ----- variables -----
        int Number_One = 0;
        int Number_Two = 0;
        int Sum = 0;
        int Difference = 0;
        int Product = 0;
        
        // ----- user input -----
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a whole number: ");
        Number_One = scanner.nextInt();

        System.out.print("Enter another whole number: ");
        Number_Two = scanner.nextInt();
        System.out.println();
        
        // ----- calculate -----
        Sum = Number_One + Number_Two;
        System.out.println("The sum of " + Number_One + " + " + Number_Two + " = " + Sum);
        
        Difference = Number_One - Number_Two;
        System.out.println("The difference of " + Number_One + " - " + Number_Two + " = " + Difference);
        
        Product = Number_One * Number_Two;
        System.out.println("The product of " + Number_One + " * " + Number_Two + " = " + Product);
        
    }
}