package javaprogrammes;
/* Write a Java program that takes a number as input and prints its multiplication table up to 10.
 Test Data: Input a number: 8
 Expected Output : 8 x 1 = 8
 8 x 2 = 16
 8 x 3 = 24
 ...
 8 x 10 = 80
 */

import java.util.Scanner;

public class Programme10_Multiplication {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter any Number:"); //accepts user input
        Scanner m = new Scanner(System.in);
        num = m.nextInt();
        m.close();

        for(int i=1; i<=10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}
