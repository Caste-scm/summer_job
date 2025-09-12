//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Floor f1 = new Floor(12.0,10.0);
        Floor f2 = new Floor(-4.0,7.0);
        Carpet c1 = new Carpet(8.0);
        Carpet c2 = new Carpet(3.0);
        Calculator n1 = new Calculator(f1,c1);
        Calculator n2 = new Calculator(f2,c2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println("----------------------------");
        System.out.print("THE AREA:");
        System.out.println(f1.getArea());
        System.out.println("----------------------------");
        System.out.print("THE AREA2:");
        System.out.println(f2.getArea());
        System.out.println("----------------------------");
        System.out.print("THE COST:");
        System.out.println(c1.getCost());
        System.out.println("----------------------------");
        System.out.print("THE COST2:");
        System.out.println(c2.getCost());
        System.out.println("----------------------------");
        System.out.print("THE TOTAL COST:");
        System.out.println(n1.getTotalCost());
        System.out.println("----------------------------");
        System.out.print("THE TOTAL COST2:");
        System.out.println(n2.getTotalCost());
    }
}