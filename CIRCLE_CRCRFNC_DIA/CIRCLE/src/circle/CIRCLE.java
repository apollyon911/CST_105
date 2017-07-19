
package circle;

import java.util.Scanner;

/**
 *
 * @author SWAMPDAWG
 */
public class CIRCLE {

    
    //Creates a Scanner which could read from
    //console
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in) ;
      double radius = 0.0;
      
      // prompt the user to enter the radius
      System.out.println("Enter the radius :");
      
      // nextDouble method reads user input and assigns to radius variable
      radius = scanner.nextDouble();
      
      // Area of Circle
      @SuppressWarnings("UnusedAssignment")
      double area = 0.0;
      // Circumference of Circle
      @SuppressWarnings("UnusedAssignment")
      double circumference = 0.0;
      
      System.out.println("Radius entered by user : " + radius);
      
      //Area of Circle = 22 / 7 * radius * radius
      area = Math.PI * radius * radius;
      
      System.out.println("Area of Circle is :" + area);
      
      //Circumference = 2 * 22 / 7 * radius
      circumference = 2 * Math.PI * radius;
      
      System.out.println("Circumference of Circle is :" + circumference);
      
      
      
      
    }
}