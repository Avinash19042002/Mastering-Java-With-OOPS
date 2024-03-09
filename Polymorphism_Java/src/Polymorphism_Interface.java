interface sports{
    void play();
}

class Football implements sports{
    public void play() {
        System.out.println("Playing  Football...");
    }
}
class Cricket implements sports{
    public void play(){
        System.out.println("Playing Cricket...");
    }
}
public class Polymorphism_Interface {
    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();

        Cricket obj1= new Cricket();
        obj1.play();
    }
}
