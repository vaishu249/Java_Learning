package ProblemSolving.P38AbstractClass;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area=3.14*(getRadius()*getRadius());
        System.out.println("Area of Circle is "+area);
    }
}
