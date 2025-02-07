package task6;


public class Circle {
    // Data member for radius
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter for radius (optional)
    public double getRadius() {
        return radius;
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Circle circle = new Circle(5.0);
        
        // Calculate and print the circumference
        double circumference = circle.calculateCircumference();
        System.out.println("Circumference of the circle: " + circumference);
    }
}
