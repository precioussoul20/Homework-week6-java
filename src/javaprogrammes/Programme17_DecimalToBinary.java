package javaprogrammes;

/* Write a Java program to convert a decimal number to binary number.
 Input Data:
 Input a Decimal Number : 5
 Expected Output
 Binary number is: 101
* */

public class Programme17_DecimalToBinary {
    public static void main(String[] args) {
        int a = 5;
        String binaryNumber = convertToBinary(a);
        System.out.println("Binary number is:" + binaryNumber);

    }
    public static String convertToBinary(int a){
        return  Integer.toBinaryString(a);

    }
}

