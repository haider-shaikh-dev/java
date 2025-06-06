package mypack2;
import mypack1.Demo1;

public class Demo4 extends Demo1 {
   
   public void show() {
       // Accessing inherited members
       System.err.println(a + b + c + d); // This line will cause a compile-time error because 'a' and 'c' are not accessible here.
   }
}