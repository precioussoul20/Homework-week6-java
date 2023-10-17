package javaprogrammes;
/* Write a Java program to print the area and perimeter of a rectangle.
 Test Data: Width = 5.5 Height = 8.5
 Expected Output:
  Area is 5.6 * 8.5 = 47.60
  Perimeter is 2 * (5.6 + 8.5) = 28.20
  */

import java.util.Scanner;

public class Programme14_Rectangle {
    public static void main(String[] args) {

        double area, perimeter, width, height;

        Scanner r = new Scanner(System.in);
        System.out.println("Enter the width of the Rectangle:");
        width = r.nextDouble();
        System.out.println("Enter the height of the Rectangle:");
        height = r.nextDouble();

        r.close();

        //formula for Area of Rectangle = width * height
        area= width * height;
        System.out.println("Area of Rectangle="  + width+ "*" + height+ "=" + area );

        // formula for Perimeter of Rectangle = 2 *(width + height)
        perimeter = 2 * ( width + height);
        System.out.println("Perimeter of rectangle= 2*("+ width + "+" + height + ") = " + perimeter);

    }
}
