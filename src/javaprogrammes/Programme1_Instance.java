package javaprogrammes;
 /** Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and the Run the programme.
 */

public class Programme1_Instance {

    int a = 10; // Instance variable
    int b = 15; // instance variable

    public void instance(){ // Instance method
        // call both instance variable into instance method in print statement
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) { // Main method
        // call Instance method into main method, by declaring an object of class
        Programme1_Instance obj = new Programme1_Instance();
        obj.instance();
    }
}
