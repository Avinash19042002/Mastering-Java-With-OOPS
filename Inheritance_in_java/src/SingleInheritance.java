class Animal{
    public void eat(){
        System.out.println("The Animal Eats Food");
    }
    public void sleep(){
        System.out.println("The Animal is Sleeping");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("The Dog is Barking");
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        System.out.println("Hello Avinash");
        Dog dog = new Dog();
        dog.sleep();
        dog.bark();
        dog.eat();
    }
}
