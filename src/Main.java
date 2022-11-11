import Task1.Circle;
import Task1.Rectangle;
import Task1.Triangle;
import Task2.Counter;
import Task3.Array;

public class Main {
    public static void main(String[] args) {
        //Task 1
        Rectangle rectangle = new Rectangle(5,4);
        rectangle.printArea();
        rectangle.printPerimeter();
        System.out.println();

        Circle circle = new Circle(3);
        circle.printArea();
        circle.printPerimeter();
        System.out.println();

        Triangle triangle = new Triangle(2,4,5,3);
        triangle.printArea();
        triangle.printPerimeter();
        System.out.println();


        //Task 2
        Counter counter = new Counter();
        Counter.setNumOfCalls(6);
        counter.calculateFactorial();
        Counter.increase();
        System.out.println();


        //Task3
        final int[] ARRAY = {1,2,3,4,5,6,7,8,9,10};
        ARRAY [0] = 10;
        ARRAY [1] = 9;
        ARRAY [2] = 8;
        ARRAY [3] = 7;
        ARRAY [4] = 6;
        ARRAY [5] = 5;
        ARRAY [6] = 4;
        ARRAY [7] = 3;
        ARRAY [8] = 2;
        ARRAY [9] = 1;
        Array.printArray(ARRAY);






    }

}
