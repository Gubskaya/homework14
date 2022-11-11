package Task1;

public class Rectangle extends Figure {
        private int a;
        private int b;


        public Rectangle() {
        }

        public Rectangle(int a, int b) {
                this.a = a;
                this.b = b;
        }

        public int getA() {
                return a;
        }

        public int getB() {
                return b;
        }

        public void setA(int a) {
                this.a = a;
        }

        public void setB(int b) {
                this.b = b;
        }

        @Override
        public void printArea() {
                int s = a*b;
                System.out.println("Area of the rectangle: "+s);
        }

        @Override
        public void printPerimeter() {
                int p = 2*(a+b);
                System.out.println("Perimeter of the rectangle: "+p);
        }
}
