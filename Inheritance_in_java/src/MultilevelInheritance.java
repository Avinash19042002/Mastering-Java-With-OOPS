class Animal1{
    void eat(){
        System.out.println("This Animal eats food");
    }
}
class Mammal extends Animal1{
    void giveBerth(){
        System.out.println("Mammals gives birth to new offspring");
    }
}

class Dog1 extends Mammal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.eat();
        dog.bark();
        dog.giveBerth();
    }
}
