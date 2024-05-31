package org.example.arge;

import org.example.company.Car;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("tesla","tesla desc", 700,2000);
        CarSkeleton hybridCar = new HybridCar("toyota", "tyt desc", 40,4000,4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("Honda", "honda test", 30 , 4);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPoweredCar);

    }

    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());;
    }
}
