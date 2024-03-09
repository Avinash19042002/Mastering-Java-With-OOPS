interface  flyer{
    void fly();
}

class Bird{
    void chirp(){
        System.out.println("The bird id chirrping");
    }
}

class Sparrow extends Bird implements flyer{
    @Override
    public void fly(){
        System.out.println("Sparrow is Flying");
    }
}
public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Sparrow obj = new Sparrow();
        obj.fly();
        obj.chirp();
    }
}
