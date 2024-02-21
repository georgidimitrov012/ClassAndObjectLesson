public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
        this.height = 3.5;
        this.width = 6.3;
    }

    public Rectangle(double theHeight, double theWidth) {
        this.height = theHeight;
        this.width = theWidth;
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return 2 * (height + width) ;

    }
}
