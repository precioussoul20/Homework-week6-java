package javaprogrammes;
/* Write a program to insert any temperature value in degree Fahrenheit and
    convert to degree Celsius ((F − 32) × 5/9 = 0°C).
    * */

import java.util.Scanner;

public class Programme7_Temperature {

    public static void main(String[] args) {
        float temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature:"); // accept user input
        temp = sc.nextFloat();
        sc.close();

        // formula to convert Fahrenheit into celcius = ((F - 32) * 5/9)
        temp = ((temp -32) * 5/9);
        System.out.println("Celcius temp is" + temp);
    }
}
