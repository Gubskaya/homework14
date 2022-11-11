package Task1;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;
    private int h;

    public Triangle() {
    }

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getH() {
        return h;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void printArea() {
        double s = a/2*h;
        System.out.println("Area of the triangle: "+s);
    }

    @Override
    public void printPerimeter() {
        int p = a+b+c;
        System.out.println("Perimeter of the triangle: "+p);

    }
}
