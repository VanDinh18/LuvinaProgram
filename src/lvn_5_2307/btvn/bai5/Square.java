package lvn_5_2307.btvn.bai5;

public class Square extends Rectangle{
    public Square(){}

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side){
        this.width = side;
    }

    public void setLength(double side){
        this.length = side;
    }

    public static void main(String[] args) {
        Square square = new Square(4);
        square.toString();
    }
}
