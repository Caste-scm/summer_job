public class Circle extends Shape{
    private double n;
    public Circle(double n) {
        this.n = n;
    }
    public double calculateArea(){
        return 3.1416*n*n;
    }
}
