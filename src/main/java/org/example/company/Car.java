package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        String className = getClass().getSimpleName();
        System.out.println("startEngine method is called in class: " + className);
        return "the car's engine is starting";
    }

    public String accelerate(){
        String className = getClass().getSimpleName();
        System.out.println("accelerate method is called in class: " + className);
        return "the car is accelerating";
    }

    public String brake() {
        String className = getClass().getSimpleName();
        System.out.println("brake method is called in class: " + className);
        return "the car is braking";
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public boolean equals(Object car) {
        return ((Car) car).name.equals(this.name) && ((Car) car).cylinders == this.cylinders;
    }
}
