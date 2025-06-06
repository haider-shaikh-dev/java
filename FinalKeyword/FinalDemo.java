
class Test {
    

    void display() {
        System.out.println("Value of y: " + y);
    }
}


class Test2 extends Test {
    public void display() {
        System.out.println("This is a final method in Test2 class.");
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        final int x = 10; // x is a constant

        System.out.println("Value of x: " + x);
    }
}