package Basic_class;
public class Circle extends Shape {
    protected double radius=1.0;
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(String color,Boolean filled){
        super(color,filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return 2*3.14*radius;
    }

    @Override
    public double getPerimeter() {
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.radius+"\n";
    }
    
}
