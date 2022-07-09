package GoodMLab3;

import java.util.Scanner;
/**
 * My words and actions will reflect Academic Integrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Madelyn Good     9/14/2021
 */

// Lab Three

/*
   Madelyn Good 
   CSC 130-01
**/

public class GoodMLab3 {
    public static void main(String[] args) {
        System.out.println("Lab Three");
        System.out.println("Madelyn Good");
        System.out.println("CSC 130-01");
        System.out.println();
        System.out.println("This program will ask a user to enter 3 numbers in the range of 0 to 15.");
        System.out.println("The user will then be shown a menu that has 4 choices.");
        System.out.println("Choice 1 will add the three numbers together");
        System.out.println("Choice 2 will compare and sort the numbers");
        System.out.println("Choice 3 will generate 4 random numbers to create a 4-digit PIN");
        System.out.println("Choice 4 will test if numbers are above 2, 4, & 6 respectively");
        
        // ----- variables -----
        int choice = 0;
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        int randomNumber1 = 0;
        int randomNumber2 = 0;
        int randomNumber3 = 0;
        int randomNumber4 = 0;
        int temp = 0;
        int sum = 0;
        boolean testing = true;
        
        Scanner scanner = new Scanner(System.in);
        
        // ----- choice 1: add 3 numbers -----
        System.out.print("\nEnter a whole number in the range of 0 to 15: ");
        numberOne = scanner.nextInt();
        System.out.print("Enter another whole number in the range of 0 to 15: ");
        numberTwo = scanner.nextInt();
        System.out.print("Enter a third whole number in the range of 0 to 15: ");
        numberThree = scanner.nextInt();
          
        sum = numberOne + numberTwo + numberThree;
        System.out.println();
        
        // ----- menu -----
        System.out.println("******************** Menu Choices: ********************");
        System.out.println("1. Add the 3 numbers together");
        System.out.println("2. Compare and sort the numbers");
        System.out.println("3. Use generated random numbers to create a 4-digit PIN");
        System.out.println("4. Test if numbers are above 2, 4, & 6");
        System.out.println("*******************************************************");
        
        System.out.println();
        System.out.print("Enter your menu choice, 1, 2, 3, or 4: ");
        choice = scanner.nextInt();    
        
                 
        // ----- choice 2: compare and sort -----
        if (numberTwo < numberOne){
            temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }
        if (numberThree < numberTwo) {
            temp = numberTwo;
            numberTwo = numberThree;
            numberThree = temp;
        }
        if (numberTwo < numberOne) {
            temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }       
               
        
        // ----- choice 3: generate 4 digit PIN -----
        randomNumber1 = (int)(Math.random() * 10);
        randomNumber2 = (int)(Math.random() * 10);
        randomNumber3 = (int)(Math.random() * 10);
        randomNumber4 = (int)(Math.random() * 10);
            
        
        // ----- choice 4: test if above 2,4,6 -----
        if (numberOne > 2 && numberTwo > 4 && numberThree > 6) {
            testing = true;
        }
        else {
            testing = false;
        }
               
        
        // switch
        switch (choice){
            case 1: System.out.println("The sum of " + numberOne + " + " + numberTwo + " + " + numberThree + " = " + sum); break;
            case 2: System.out.println("In sorted order the numbers are: " + numberOne + " " + numberTwo + " " + numberThree); break;
            case 3: System.out.println("Generating a random 4-digit pin number. Numbers can be duplicated");
                    System.out.println("  Your pin number is: " + randomNumber1 + randomNumber2 + randomNumber3 + randomNumber4); break;
            case 4: System.out.println(testing ? "The numbers are above 2, 4, & 6." : "The numbers are not above 2, 4, & 6.");        
                    
        }
    }
}