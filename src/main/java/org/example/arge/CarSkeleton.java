package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    protected void runEngine(CarSkeleton carSkeleton){
    if(carSkeleton instanceof GasPoweredCar){
        int cylinders = ((GasPoweredCar) carSkeleton).getCylinders();
        double avgKmPerLitre = ((GasPoweredCar) carSkeleton).getAvgKmPerLitre();
    } else if (carSkeleton instanceof ElectricCar) {
        int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
        double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
    } else if (carSkeleton instanceof HybridCar) {
        int cylinders = ((HybridCar) carSkeleton).getCylinders();
        double avgKmPerLitre = ((HybridCar) carSkeleton).getAvgKmPerLitre();
        int batterySize = ((HybridCar) carSkeleton).getBatterySize();

    }else {
        System.out.println("geçersiz araba");
    }
    }
    public String startEngine(){
        System.out.println("ClassName: "+getClass().getSimpleName());
        return getName()+" starting engine";
    }
    public String drive(){
        runEngine(this);
        return getName()+" is driving...";
    }
}
