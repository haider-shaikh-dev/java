
import java.util.Scanner;

class ExceptionTest {
    public static void main(String[] args) {
       
       try{

        Scanner sc=new Scanner(System.in);
         System.out.println("Enter 2 numbers");
           int a = sc.nextInt();
         int b =  sc.nextInt();

    //    int a=0;
    //    int b=20;
       int c = b/a;

       System.err.println("The value of c is: " + c);
       }
       catch(ArithmeticException err){
        System.err.println("Error Present!!! "+err);
       }
       finally {
        System.err.println("Finally block executed.");
       }

    }

    
}