public class Rectangle extends Shape{
    private double b;
    private double h;
    public Rectangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return b*h;
    }
}
