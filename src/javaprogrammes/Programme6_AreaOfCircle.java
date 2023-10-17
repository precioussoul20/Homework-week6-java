package javaprogrammes;
/*Write a program to enter any radius value of the circle and find out the area.
    (Formula of Area A=PI*r*r).
     */
import java.util.Scanner;

import static java.lang.Math.PI;

public class Programme6_AreaOfCircle {

    public static void main(String[] args) {

        double radius, area ;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:"); // accepts user input
        radius = in.nextDouble();
        in.close();

        //formula to find Area of circle = PI*r*r
        area = PI * radius * radius;
        System.out.println("Area of the circle is " + area);
    }
}
