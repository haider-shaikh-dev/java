import mypack1.Demo1;
class Test {
    public static void main(String[] args) {
        Demo1 dem= new Demo1();
        dem.display();

        System.out.println(dem.a+dem.b+dem.c+dem.d); // This line will cause a compile-time error because 'a', 'c', and 'd' are not accessible here.
        // System.out.println(d.a); // default access modifier, not accessible outside the package
    }
}