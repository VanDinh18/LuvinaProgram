package lvn_5_2307.btvn.bai3;

public class Circle {
    protected double radius;
    protected String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        double s = Math.PI * Math.exp(radius);
        return s;
    }

    public String toString(){
        return radius + " " + color;
    }
}
