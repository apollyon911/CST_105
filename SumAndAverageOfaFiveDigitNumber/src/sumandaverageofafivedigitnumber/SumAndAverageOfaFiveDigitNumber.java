/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumandaverageofafivedigitnumber;

/**
 *
 * @author SWAMPDAWG
 */
// Import Scanner class
import java.util.Scanner;
public class SumAndAverageOfaFiveDigitNumber {
    public static void main(String[] args) {
        // Scanner class utilied
        Scanner input = new Scanner(System.in); 
        //Purpose
        System.out.println("Calculating the sum and average of a five digit number");
       
        
        System.out.println("Enter a positive one digit number: ");
        double number1 = input.nextDouble();
        System.out.println("Enter a positive one digit number: ");
        double number2 = input.nextDouble();
        System.out.println("Enter a positive one digit number: ");
        double number3 = input.nextDouble();
        System.out.println("Enter a positive one digit number: ");
        double number4 = input.nextDouble();
        System.out.println("Enter a positive one digit number: ");
        double number5 = input.nextDouble();
        
        //Calculations of average and sum
        double average = (number1 + number2 + number3 + number4 + number5) / 5;
        double sum = (number1 + number2 + number3 + number4 + number5);
        
        //Response 1
        System.out.println("The average of " + number1 + " , " + number2 + " , "
                + number3 + " , " + number4 + " and " + number5 + " is " + average);
        //Response 2
        System.out.println("The sum of " + number1 + " , " + number2 + " , " +
                number3 + " , " + number4 + " and " + number5 + " is " + sum);
        
        
        
       
    }
    
}
