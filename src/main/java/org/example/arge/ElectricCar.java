package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerLitre, int batterySize){
        super(name, description);
        this.avgKmPerCharge = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerCharge = avgKmPerLitre;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(" motor running.");
    }
}
