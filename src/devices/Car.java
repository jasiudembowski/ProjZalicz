package devices;

import java.util.Objects;

public class Car extends Device{

    private double maxSpeed;
    private int horsepower;
    private double value;

    public double getValue(){
        return this.value;
    }

    public Car(String model,String producer,double maxSpeed, int horsepower,String yearOfProduction){
        this.model = model;
        this.producer = producer;
        this.maxSpeed = maxSpeed;
        this.horsepower = horsepower;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return this.model.equals(car.model) && this.producer.equals(car.producer) && this.maxSpeed == car.maxSpeed
                && this.horsepower == car.horsepower && this.value == car.value;

    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer);
    }

    @Override
    public void turnOn() {
        System.out.println("Samochod odaplil");
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", horsepower=" + horsepower +
                ", value=" + value +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }
}
