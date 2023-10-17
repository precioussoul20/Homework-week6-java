package javaprogrammes;
/** Write a Java programme using the following steps.
 2.1 Declare two static variables
 2.2 Declare one static method
 2.3 Call both static variables into the static method inside the print statement.
 2.4 Declare the Main method.
 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme2_Static {

static int a = 10;// static variable
static int b = 20;// static variable

public static void method(){ //static method
    // call both static variable into static method inside print statement
    System.out.println(a);
    System.out.println(b);
}
public static void main(String[] args) { //Main method
    // call the static method into main method directly
    method();
}
}
