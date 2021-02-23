public class Car {
    private final String model;
    private final String producer;
    private double maxSpeed;
    private int horsepower;
    private double value;

    public double getValue(){
        return this.value;
    }

    Car(String model,String producer,double maxSpeed, int horsepower){
        this.model = model;
        this.producer = producer;
        this.maxSpeed = maxSpeed;
        this.horsepower = horsepower;

    }

}
