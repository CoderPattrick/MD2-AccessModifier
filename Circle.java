public class Circle {
    private double r;
    private String color;

    public Circle(){}
    public Circle(double r){
        this.r=r;
    }
    public double getRadius(){
        return r;
    }
    public double getArea(){
        double area = 2*Math.PI*r*r;
        return area;
    }
}
