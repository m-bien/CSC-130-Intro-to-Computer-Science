package temp;

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
 
public class temp {
    
    // constants (pint equivalencies)
    public static final double QUARTS = 2;
    public static final double GALLONS = 8;
    public static final double LITERS = 2.113383;
    
    public static void main(String[] args) { 
        System.out.println("Madelyn Good");
    	System.out.println("CSC 130-01");
	System.out.println("Lab Two");
    	System.out.println();

	// ----- Section 1 -----
        
        // user input
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of pints to be converted: ");
	double pints = scanner.nextDouble();
	System.out.println();

	// calculate equivalencies
	System.out.println(pints + " pints is equal to: ");
	System.out.println(pints / QUARTS + " quarts ");
	System.out.println(pints / GALLONS + " gallons ");
	System.out.println(pints / LITERS + " liters ");
	System.out.println();

        
	// ----- Section 2 -----

	// increment operator
        pints++;
        System.out.println("Now pints is equal to: " + pints);
	System.out.println();

	// augmented operator
        pints *= 3;
	System.out.println("Now pints is equal to : " + pints);
	System.out.println();

	// pow method
	pints = Math.pow(pints,3);
	System.out.println("Now pints is equal to : " + pints);
	System.out.println();

	}
}
