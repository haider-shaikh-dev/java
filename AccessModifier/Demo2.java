package mypack1;

public class Demo2 {
    Demo1 d1 = new Demo1();

    public void show(){
        System.err.println(d1.a + d1.b + d1.c + d1.d); // This line will cause a compile-time error because 'a', 'c', and 'd' are not accessible here.
    }
}