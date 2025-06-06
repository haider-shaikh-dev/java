
class NestedCatch {

    public static void main(String[] args) {
        int A[] = {10, 20, 30, 40, 50, 0};

        try {
            int c = A[0] / A[2];
            System.out.println("The value of c is: " + c);

            try {
                System.err.println("A[7] = " + A[7]); // This will throw ArrayIndexOutOfBoundsException

            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Array Index Out Of Bounds Exception!!! " + e);
            }
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception!!! " + e);
        } catch (Exception e) {
            System.err.println("General Exception!!! " + e);
        } finally {
            System.err.println("Finally block executed.");
        }
    }
}
