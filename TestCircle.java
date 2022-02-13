public class TestCircle {
    public static void main(String[] args) {
        Circle cir1 = new Circle(10);
        Circle cir2 = new Circle();
        double radius = cir1.getRadius();
        double area = cir1.getArea();
        System.out.printf("Radius: %f  Area: %f",radius,area);
    }
}
