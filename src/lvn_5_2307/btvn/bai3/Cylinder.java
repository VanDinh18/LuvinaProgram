package lvn_5_2307.btvn.bai3;

public class Cylinder extends Circle{
    private double height;

    Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        double v = Math.PI * Math.exp(radius) * height;
        return v;
    }
}
