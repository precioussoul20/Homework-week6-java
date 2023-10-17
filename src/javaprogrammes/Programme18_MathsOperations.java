package javaprogrammes;
/*
* Write a Java program to print the sum (addition), multiply, subtract, divide and
* remainder of two numbers.
*  Test Data:
* Input first number: 125
* Input second number: 24
* Expected Output :
* 125 + 24 = 149
* 125 - 24 = 101
* 125 x 24 = 3000
* 125 / 24 = 5
* 125 mod 24 = 5*/

import java.util.Scanner;

public class Programme18_MathsOperations {
    public void operations(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 =sc.nextInt();
        System.out.println("");

        sc.close();

        System.out.println("Addition of " + num1 + "+" + num2 + "=" +(num1+num2));
        System.out.println("Subtraction of " + num1 + "-" + num2 + "=" +(num1-num2));
        System.out.println("Multiplication of " + num1 + "*" + num2 + "=" +(num1*num2));
        System.out.println("Division of " + num1 + "/" + num2 + "=" +(num1/num1));
        System.out.println("Remainder of " + num1 + "%" + num2 + "=" +(num1%num2));
    }

    public static void main(String[] args) {
        Programme18_MathsOperations obj = new Programme18_MathsOperations(); // object to call instance method
        obj.operations();
    }
}
