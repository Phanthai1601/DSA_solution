package Basic_class;
public class Rectangle extends Shape {
    protected double width=1.0;
    protected double length =1.0;

    public Rectangle() {
    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,Boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+this.width+"\n"+this.length+"\n";
    }
    
}
