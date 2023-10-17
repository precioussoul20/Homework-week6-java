package javaprogrammes;
//Write a programme to convert the uppercase to lower case.

import java.util.Scanner;

public class Programme9_ConvertUpperToLower {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String in Uppercase:"); // accepts user input
        str =sc.nextLine();
        sc.close();

        str = (str.toLowerCase());
        System.out.println("String in Lower case=" + str);
    }

}
