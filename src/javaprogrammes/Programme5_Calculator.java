package javaprogrammes;

import java.util.Scanner;

/* Write a program for the calculator with addition, subtraction, multiplication and division methods
    all with parameters and use string concatenation methods. (Note: Two static and Two instance methods)
     */
public class Programme5_Calculator {
    //Static method
     public static double addition( double num1, double num2){
         return num1 + num2;
     }

     //Static method
     public static double subtraction(double num1, double num2){
         return num1 -num2;
     }
     //Instance method
     public double multiplication(double num1, double num2){
         return num1 * num2;
     }
     //Instance method
     public double division(double num1, double num2){
         return num1 / num2;
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the First number");
         double num1 = sc.nextDouble();
         System.out.println("Enter the Second number");
         double num2 = sc.nextDouble();
         System.out.println("");
         sc.close();

         System.out.println("addition of two numbers is:" + addition(num1, num2));
         System.out.println("subtraction of two numbers is:" + subtraction(num1, num2));

         Programme5_Calculator cal = new Programme5_Calculator(); // objet to call Instance method
         cal.multiplication(num1, num2);
         System.out.println("multiplication of two number is:" + cal.multiplication(num1, num2));

         cal.division(num1, num2);
         System.out.println("division of two number is:" + cal.division(num1, num2));

     }
}



