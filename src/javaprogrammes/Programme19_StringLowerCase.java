package javaprogrammes;
/* Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog
* */

import java.util.Scanner;

public class Programme19_StringLowerCase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a String:");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        in.close();
    }
}
