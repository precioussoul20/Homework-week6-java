package javaprogrammes;
// Write a java program to swap two variables


import java.util.Scanner;

public class Programme15_Swap {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter any two number:");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Before Swapping " +a+" "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping " +a+" "+b);
        s.close();




    }





}
