package javaprogrammes;
  /* Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme
   */
public class Programme3_OneVariable {

    int a = 5; //Instance variable
    static int b =10; // Static variable
    public void m1(){ //Instance method
        //call instance and static variable directly into Instance method inside print statement
        System.out.println(a);
        System.out.println(b);
    }
    public static void m2(){ // Static method
        /*call instance variable by declaring object of the class and
        static variable directlyinto static method inside print statement
         */
        Programme3_OneVariable obj2 = new Programme3_OneVariable();
        System.out.println(obj2.a);
        System.out.println(b);
    }

    public static void main(String[] args) { //Main method
        //call Instance method by declaring object of the class and static method directly into main method
        Programme3_OneVariable obj3 = new Programme3_OneVariable();
        obj3.m1();
        m2();
    }
}
