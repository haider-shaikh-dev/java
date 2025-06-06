class MinBalException extends Exception{
    public String toString(){ //overriding the Exception.toString method here
        return "minimim balance should be 500 rupees";
    }
}