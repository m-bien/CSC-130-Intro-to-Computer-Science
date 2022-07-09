package GoodMLab7;

import java.util.Scanner;
/**
 * My words and actions will reflect Academic Integrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Madelyn Good     10/27/21
 */

// Lab Seven

/*
   Madelyn Good
   CSC 130-01
*/

public class GoodMLab7 {
    
    static final double PI = 3.14159;
    
    public static void main(String[] args) {
        System.out.println("Lab Seven");
        System.out.println("Madelyn Good");
        System.out.println("CSC 130-01");
        
        System.out.println("\nThis program will show the user a menu that allows him to have");
        System.out.println(" the program calculate the area of a square, rectangle, or circle.");
        System.out.println("The menu is in a loop so the user may use it as often as he wishes.");
        System.out.println("The code for the calculations is in the methods called by main.");
        
        // variable
        int choice = 0;
    
        Scanner scanner = new Scanner(System.in);
        
        // ----- menu -----
        do {
            System.out.println("\n*****************************************************************");
            System.out.println("\t    Menu");
            System.out.println("\t1 - Square");
            System.out.println("\t2 - Rectangle");
            System.out.println("\t3 - Circle");
            System.out.println("\t4 - Quit the program");
            System.out.println("*****************************************************************");
            
            System.out.print("Please make your choice from the menu: ");
            choice = scanner.nextInt();
        
        // ----- check user input -----
        while ((choice < 1 || choice > 4)) {
            System.out.print("Invalid choice. Please select 1, 2, 3, or 4. ");    
            choice = scanner.nextInt();
        }
        
        if(choice == 1) {
            System.out.printf("The area of the square is %,.2f\n" , squareArea());
        }
        else if (choice == 2) {
            System.out.printf("The area of the rectangle is %,.2f\n" , rectangleArea());
        }
        else if (choice == 3) {
            System.out.printf("The area of the circle is %,.2f\n" , circleArea());
        }
        else if (choice == 4) {
            System.out.print("\nThank you for using my program!\n");
        }     
                
        } while (choice != 4); 
    }
                
        // ----- method for squareArea ----- 
        static double squareArea() {
            
            double area, getSide;
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("What is the length of one side of the square? ");
            getSide = scanner.nextDouble();
            area = getSide * getSide;
        
        return area;
    }
        
        // ----- method for rectangleArea -----
        static double rectangleArea() {
            
            double area, getLength, getWidth;
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("What is the length of the rectangle? ");
            getLength = scanner.nextDouble();
            System.out.print("What is the width of the rectangle? ");
            getWidth = scanner.nextDouble();
            area = getLength * getWidth;
            
        return area;
    }
        
        // ----- method for circleArea -----
        static double circleArea() {
            
            double area, getRadius;
            final double PI = 3.14159;
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("What is the radius of the circle? ");
            getRadius = scanner.nextDouble();
            area = PI * getRadius * getRadius;
          
        return area;   
    }
}