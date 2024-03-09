interface shape{
    double area();
    void display();
}

class Circle implements shape{
    double radius;
    public Circle(double r){
        radius=r;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public void display(){
        System.out.println("Area of this Circle is : "+area());
    }
}
public class Interface_Program {
    public static void main(String[] args) {
        Circle c= new Circle(3);
        c.display();
    }
}
