package com.example.car;

public class Engine {
    private int horsePower;
    public Engine(int hp){
        horsePower=hp;
    }
    public void start(){
        System.out.println("Engine Horse Power : "+horsePower);
    }
}
