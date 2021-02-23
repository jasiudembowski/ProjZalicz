package devices;

import java.util.Objects;

public class Car {
    private final String model;
    private final String producer;
    private double maxSpeed;
    private int horsepower;
    private double value;

    public double getValue(){
        return this.value;
    }

    public Car(String model,String producer,double maxSpeed, int horsepower){
        this.model = model;
        this.producer = producer;
        this.maxSpeed = maxSpeed;
        this.horsepower = horsepower;
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
    public String toString() {
        return "devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", horsepower=" + horsepower +
                ", value=" + value +
                '}';
    }
}
