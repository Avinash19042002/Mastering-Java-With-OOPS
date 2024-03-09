class Shape{
    void draw(){
        System.out.println("Drawing a Shape");
    }
}

class Circle extends Shape{
    void drawCircle(){
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape{
    void drawSquare(){
        System.out.println("Drawing a Square");
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.draw();
        c.drawCircle();

        Square s= new Square();
        s.draw();
        s.drawSquare();
    }
}
