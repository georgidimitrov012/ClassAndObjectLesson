public class Main {
    public static void main(String[] args) {
        Persons unknown = new Persons();
        Persons maria = new Persons("Maria", 21);

        unknown.printInfo();
        maria.printInfo();

        System.out.println(maria.ageCategory());
        //System.out.println(Persons.ageCategory(188));

        System.out.println("____________________________");

        int sum = Calculator.add(4, 2);
        int substract = Calculator.subtract(4, 2);
        int multiplie = Calculator.multiplie(4, 2);
        int devide = Calculator.devide(4, 2);
        System.out.println(sum);
        System.out.println(substract);
        System.out.println(multiplie);
        System.out.println(devide);
        System.out.println("_____________CIRCLE_______________");

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4.5);
        System.out.println(circle2.calculateArea());

        System.out.println("_____________RECTANGLE_______________");

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4.5,8.2);

        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());

        System.out.println(rectangle1.calculateArea());
    }
}
