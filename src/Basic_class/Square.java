package Basic_class;
public class Square extends Shape {
    protected double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, Boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
        this.side=side;
    }
    public void setLength(double side){
        this.side=side;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+this.side+"\n";
    }
    
}
