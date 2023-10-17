package javaprogrammes;
/*Write a program to calculate the area of a traingle
    formula for area of triangle = (1/2) *( Base * Height)
     */
import java.util.Scanner;

public class Programme8_AreaOfTriangle {


    public static void main(String[] args) {
        double area, height, base;

        Scanner t = new Scanner(System.in);

        System.out.println("Enter the height of the Triangle:"); // accept user input
        height = t.nextDouble();
        System.out.println("Enter the base of the Triangle:"); //accept user input
        base = t.nextDouble();

        t.close();

        // formula for the Area of traingle = ( base * height )/2
        area = (base * height) /2;
        System.out.println("Area of triangle=" + area);
    }

}
