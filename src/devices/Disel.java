package devices;

public class Disel extends Car{

    private String fuel;

    public Disel(String model,String producer,double maxSpeed, int horsepower,String yearOfProduction){
        super(model,producer,maxSpeed,horsepower,yearOfProduction);
        this.fuel = "Disel";
    }

    @Override
    public void refuel() {
        this.fuelLevel = 100;
    }

}
