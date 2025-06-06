//result it not as expected

class Test{
    private int waterQty;
    static private Test cm=null;

    private Test() {
        // Private constructor to prevent instantiation
        waterQty = 10;
    }

    static Test getInstance(){
        if(cm == null){
            cm= new Test();
        }

        return cm;
    }
}

class CofeeMachine {
    public static void main(String[] args) {
        Test cm1 = Test.getInstance();
        Test cm2 = Test.getInstance();

        // Both cm1 and cm2 should refer to the same instance
        System.out.println(cm1 +" -- "+cm2);
        System.out.println("Are both instances equal? " + (cm1 == cm2));
    }
}