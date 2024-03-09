import java.util.*;
public class Encapsulation {
    private int age;
    private String name;
    public Encapsulation(String name,int age){
        this.name = name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void Display(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }
    public static void main(String[] args) {
        Encapsulation obj= new Encapsulation("Avinash",22);
        obj.Display();
        obj.setAge(21);
        obj.setName("Avinash kr Sinha");
        obj.Display();
    }
}
