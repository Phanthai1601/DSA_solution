package Basic_class;
public abstract class Shape {
    protected String color="red";
    protected Boolean filled =true;
    public Shape() {
    }
    public Shape(String color,Boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return this.color+"\n"+this.filled+"\n";
    }
    
    
    
    
    
}
