class Phone{
    void call(){
        System.out.println("calling ...");
    }
    void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    @Override
    void on(){
        System.out.println("Turning on SmartPhone...");
    }
    void playMusic(){
        System.out.println("Playing Music On SmartPhone...");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();// Agar tum apne dost ko phone On karne bol rhe ho aur
        // hai wo smartphone , to smartphone hi On hoga n
        obj.call();
        obj.on();
    }
}
