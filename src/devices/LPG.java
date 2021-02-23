package devices;

public class LPG extends Car{
    private String fuel;

    public LPG(String model,String producer,double maxSpeed, int horsepower,String yearOfProduction){
        super(model,producer,maxSpeed,horsepower,yearOfProduction);
        this.fuel = "LPG";
    }

    @Override
    public void refuel() {
        this.fuelLevel = 80;
    }
}
