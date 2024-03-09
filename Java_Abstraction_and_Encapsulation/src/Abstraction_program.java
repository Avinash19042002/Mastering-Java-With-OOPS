abstract class Shape{
    public abstract void draw();
    protected abstract double calculateArea();
    public void displayArea(){
        System.out.println("Area of this shape is : "+calculateArea());
    }
}

class Circle extends Shape{
    double radius;
    public Circle(double r){
        radius=r;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a Circle");
    }
    @Override
    protected double calculateArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    double length,width;
    public Rectangle(double l,double w){
        length=l;
        width=w;
    }

    protected double calculateArea(){
        return length*width;
    }

    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
public class Abstraction_program {
    public static void main(String[] args) {
        Circle c= new Circle(2.4);
        c.draw();
        c.displayArea();

        Rectangle r= new Rectangle(2.4,3.2);
        r.draw();
        r.displayArea();

//        System.out.println(r.calculateArea());
//        System.out.println(c.calculateArea());


        // using abstract class references
        System.out.println("\n Using Abstract Class Reference\n");
        Shape s1=new Circle(3);
        Shape s2=new Rectangle(2,3);

        System.out.println(s1.calculateArea());
        s1.draw();
        s1.displayArea();

        System.out.println(s2.calculateArea());
        s2.draw();
        s2.displayArea();
    }
}
