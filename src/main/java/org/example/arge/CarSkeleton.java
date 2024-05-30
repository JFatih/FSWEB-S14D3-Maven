package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){
    }

    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("engine start");
    }

    public void drive() {
        this.runEngine();
        System.out.println("engine drive.");
    }

    protected void runEngine(){
        System.out.println("engine run.");
    }
}
