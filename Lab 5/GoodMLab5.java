package GoodMLab5;

import java.util.Scanner;
/**
 * My words and actions will reflect Academic Integrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Madelyn Good     10/5/21
 */

// Lab Five

/*
   Madelyn Good
   CSC 130-01
**/

public class GoodMLab5 {
    public static void main(String[] args) {
        System.out.println("Lab Five");
        System.out.println("Madelyn Good");
        System.out.println("CSC 130-01");
        System.out.println();
        System.out.println("This program will work with formatting.");
        
        // lab four variables 
        double realNumber1 = 5.5;
        double realNumber2 = 2.37;
        double realNumber3 = 5.0;
        double realNumber4 = 1.14;
        double realNumber5 = 0.0;
        int integerNumber = 0;
        // new variables
        int whereIs = 0;
        char myCharacter = '0';
        char letter = '0';
        boolean testing = true;
        String myWord = "Supercalifragilisticexpialidocious";
        
        Scanner scanner = new Scanner(System.in);
        
        // math randoms
        System.out.printf("\nThe ceiling is %.1f \t\tThe floor is %.1f " , Math.ceil(realNumber1) , Math.floor(realNumber2));
        System.out.printf("\nThe square root is %.4f \tThe cosine is %.2e " , Math.sqrt(realNumber3) , Math.cos(realNumber4));
        System.out.println();
        
        integerNumber = (int)(Math.random() * 50 + 1); 
        realNumber5 = 2.5 + Math.random() * 6.2;
        System.out.printf("integerNumber\'s value is %d \trealNumber5\'s value is %.2f " , integerNumber , realNumber5);
        System.out.println();
        
        
        // upper or lowercase
        System.out.println();
        System.out.print("Enter a character: ");
        myCharacter = scanner.next().charAt(0);
        
        testing = myCharacter >= 'A' && myCharacter <= 'Z';
        
        if (testing) {
            System.out.printf("That %c is an upper-case letter is %B " , myCharacter , testing); }
        else { 
            System.out.printf("That %c is an upper-case letter is %B " , myCharacter , testing); }
                
        
        // index       
        System.out.println();
        letter = myWord.charAt(21);
        whereIs = myWord.indexOf('x') + 1;
       
        System.out.println();
        System.out.printf("The %dnd letter in the word %s is an %c " , whereIs , myWord, letter);
        System.out.println();
      
        }
    } 