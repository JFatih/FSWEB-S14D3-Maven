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

    public String  startEngine() {
        return getName() + " starting engine.";
    }

    public String drive() {
        runEngine(this);
        return getName() + " is driving.";
    }

    protected void runEngine(CarSkeleton carSkeleton){
        if( carSkeleton instanceof ElectricCar){
            double avgKmPerCharge  = ((ElectricCar)carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar)carSkeleton).getBatterySize();
            System.out.println("The car engine is starting with electric. Per charge: " + avgKmPerCharge + " battery size: " + batterySize);
        } else if ( carSkeleton instanceof GasPoweredCar){
            double averageKmPerLiter  = ((GasPoweredCar)carSkeleton).getAverageKmPerLiter();
            int cylinders = ((GasPoweredCar)carSkeleton).getCylinders();
            System.out.println("The car engine is starting with gasPowered. Per avgKmPerLiter: " + averageKmPerLiter + " cylinders: " + cylinders);
        } else if (carSkeleton instanceof HybridCar) {
            double avgKmPerLiter  = ((HybridCar)carSkeleton).getAvgKmPerLiter();
            int cylinders = ((HybridCar)carSkeleton).getCylinders();
            int batterySize = ((HybridCar)carSkeleton).getBatterySize();
            System.out.println("The car engine is starting with Hybrid. Per avgKmPerLiter: " + avgKmPerLiter + " cylinders: " + cylinders + " battery size: " + batterySize);
        } else {

        }
    }
}
