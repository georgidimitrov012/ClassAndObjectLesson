public class Circle {
    private double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double theRadius) {
        this.radius = theRadius;
    }

    public double calculateArea() {
        return Math.PI * (radius * 2);
    }

    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }
}
