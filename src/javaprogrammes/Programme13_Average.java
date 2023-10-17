package javaprogrammes;
/* Write a java program that takes three numbers as input to calculate
   and print the average of the numbers
   formula = average=sum of the number/total number of numbers
 */

import java.util.Scanner;

public class Programme13_Average {
    public static void main(String[] args) {
        int num1, num2, num3, Avg;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:"); // accept user input
        num1 = in.nextInt();
        System.out.println("Enter second number:"); // accept user input
        num2 = in.nextInt();
        System.out.println("Enter third number:"); // accept user input
        num3 =  in.nextInt();
        in.close();

        //formula= Average of numbers = sum of the numbers / Total number
        Avg = (num1 + num2 + num3) /3;
        System.out.println("Average of number=" + Avg);
    }
}

