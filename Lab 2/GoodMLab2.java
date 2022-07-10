package GoodMLab2;

import java.util.Scanner;
/**
 * My words and actions will reflect Academic Inegrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Madelyn Good     08/30/2021
 */

// Lab Two

/*
    Madelyn Good
    CSC 130, Sec 1
**/
 
public class GoodMLab2 {
    public static void main(String[] args) {    
        System.out.println("Madelyn Good");
    	System.out.println("CSC 130-01");
	System.out.println("Lab Two");
    	System.out.println();

	// ----- Section 1 -----

	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of pints to be converted: ");
	double pints = scanner.nextDouble();
	System.out.println();

	// conversions
	double pintsToQuarts = pints * 0.5;
	double pintsToGallons = pints * 0.125;
	double pintsToLiters = pints * 0.4731749995149957;

	// calculate equivalencies
	System.out.println(pints + " pints is equal to: ");
	System.out.println(pintsToQuarts + " quarts ");
	System.out.println(pintsToGallons + " gallons ");
	System.out.println(pintsToLiters + " liters ");
	System.out.println();

        
	// ----- Section 2 -----

	// pre-increment operator
        double pints1 = ++pints;
        System.out.println("Now pints is equal to: " + pints1);
	System.out.println();

	// augmented operator
        double pints2 = pints1 *= 3;
	System.out.println("Now pints is equal to : " + pints2);
	System.out.println();

	// pow method
	double pints3 = Math.pow(pints2,3);
	System.out.println("Now pints is equal to : " + pints3);
	System.out.println();

	}
}