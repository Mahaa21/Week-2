import java.util.Random;

public class Circle {

    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public double Area (double radius) {
        return Math.PI * Math.pow(radius , 2);
    }

    public double Circumference (double radius){
        return 2 * Math.PI * radius;
    }

    public void DisplayResult(double radius) {
        System.out.printf("Circle Radius: %.2f\n" , radius);
        System.out.printf("Area of the Circle: %.2f\n" , Area(radius));
        System.out.printf("Circumference of the circle: %.2f" , Circumference(radius));
    }

    public static void main(String[] Args) {
        Random random = new Random();
        double radius = random.nextDouble(100);
        Circle circle = new Circle(radius);
        circle.DisplayResult(radius);
    }
}
