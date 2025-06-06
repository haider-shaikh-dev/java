
class LowBalanceException extends Exception{
    public String toString(){
        return "Custome Low bance exception";
    }
}

class CheckedUncheckedException {

    public static void funct1() {

        try {throw new LowBalanceException();}
        catch(LowBalanceException e){
            System.err.println(e.toString());
        }
        // try{
        //     System.err.println(10/0);
        // }
        // catch(Exception e){
        //     String err = e.getMessage();
        //     System.err.println("Error!! : " + err);
        //     e.printStackTrace();
        // }
    }
    public static void funct2(){
        funct1();
    }
    public static void funct3(){
        funct2();
    }
    
    
    public static void main(String[] args) {
      funct3();
    }
}