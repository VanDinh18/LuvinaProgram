package lvn_5_2307.btvn.bai5;

public class Circle extends Shape{
    private double radius;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double Perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
