package javaprogrammes;
/* Write a Java program to add two binary numbers.
 Input Data:
 Input first binary number: 10
 Input second binary number: 11
  Expected Output:
  Sum of two binary numbers: 101
* */

import java.util.Scanner;

public class Programme16_AddBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Binary number:");
        String binary1 = sc.next();
        System.out.println("Enter the 2nd Binary number:");
        String binary2 = sc.next();
        int b1 = Integer.parseInt(binary1, 2);
        int b2 = Integer.parseInt(binary2, 2);

        int sum = b1 + b2;
        System.out.println("\n Sum of two binary numbers:");;
        System.out.println(Integer.toBinaryString(sum));
        sc.close();
    }
}
