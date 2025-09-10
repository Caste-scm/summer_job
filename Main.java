//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea() );
        Shape shapePtr = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + shapePtr.calculateArea());
        double totalArea = circle.calculateArea() + shapePtr.calculateArea();
        System.out.println("Total Area (Circle + Rectangle): " + totalArea);
    }
}