package lvn_5_2307.btvn.bai5;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape(){}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(){
        return filled;
    }

    public abstract double getArea();

    public abstract double Perimeter();

    public abstract String toString();
}
