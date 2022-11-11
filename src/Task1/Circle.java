package Task1;

public class Circle extends Figure {
    private int r;
    private final double PI=3.14;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public void printArea() {
        double s = PI*r*r;
        System.out.println("Area of the circle: "+s);
    }

    @Override
    public void printPerimeter() {
        double p = 2*r*PI;
        System.out.println("Perimeter of the circle: "+p);
    }
}
