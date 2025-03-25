public class Circle {

    int radius;

    Circle () {
        this(10);
        System.out.println("Radius set to 10");
    }

    Circle (int radius) {
        this.radius = radius;
        System.out.println("Radius set to " + radius);
    }

    void display() {
        double result = 0;
        result =  Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: \n" + radius);
        System.out.printf("Area of the circle: %.2f\n" , result);
    }

    public static void main (String[] Args) {
        System.out.println("Default Constructor:");
        Circle c1 = new Circle();
        c1.display();

        System.out.println("Parameterized Constructor:");
        Circle c2 = new Circle(100);
        c2.display();
    }
}
