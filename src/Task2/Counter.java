package Task2;

public class Counter {
    private static int numOfCalls;

    public Counter() {
    }

    public static int getNumOfCalls() {
        return numOfCalls;
    }

    public static void setNumOfCalls(int numOfCalls) {
        Counter.numOfCalls = numOfCalls;
    }

    public static void increase(){
        System.out.println(numOfCalls+1);
    }
    public void calculateFactorial(){
        int factorial = 1;
        for (int i = 1; i <=numOfCalls; i++) {
            factorial*=i;
        }

        System.out.println("Factorial of the number "+numOfCalls+" is "+factorial);
    }

}
