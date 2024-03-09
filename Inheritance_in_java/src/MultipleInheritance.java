interface Walkable{
    void walk();
}
interface Swimmable{
    void swim();
}

class Amphibian implements Walkable,Swimmable{
    @Override
    public void walk(){
        System.out.println("The Amphibian is Walking");
    }
    @Override
    public void swim(){
        System.out.println("The Amphibian is Swimmimg");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
     Amphibian obj = new Amphibian();
     obj.swim();
     obj.walk();
    }
}
