package devices;

public class Electric extends Car{
    private String fuel;

    public Electric(String model,String producer,double maxSpeed, int horsepower,String yearOfProduction){
        super(model,producer,maxSpeed,horsepower,yearOfProduction);
        this.fuel = "Electric";
    }


    @Override
    public void refuel() {
        this.fuelLevel = 70;
    }

}
