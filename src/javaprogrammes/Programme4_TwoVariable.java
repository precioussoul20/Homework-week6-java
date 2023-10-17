package javaprogrammes;
 /* Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
     * */
public class Programme4_TwoVariable {

    int a = 5; // Instance variable
    int b = 10; //Instance variable
    static int x = 15; // Static variable
    static int y = 20; // Static variable

    public void m1(){ //Instance method
        //call all instance and static variable directly into Instance method inside print statement
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
    public static void m2(){ // static method
        /*call all instance variable by declaring object of class and
         static variable directly into static method inside print statement*/
        Programme4_TwoVariable obj = new Programme4_TwoVariable();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) { // Main method
        //call instance method by declaring object of the class and static method directly into main method
        Programme4_TwoVariable obj1 = new Programme4_TwoVariable();
        obj1.m1();
        m2();
    }
}
