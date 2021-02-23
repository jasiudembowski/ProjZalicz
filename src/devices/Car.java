package devices;

import com.company.Human;
import com.company.Sellable;

import java.util.Objects;

public class Car extends Device implements Sellable {

    private double maxSpeed;
    private int horsepower;
    private double value;


    public double getValue(){
        return this.value;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar() != this) {
            System.out.println("Sprzedajacy nie ma tego urzadzenia");
            return;
        }
        if(buyer.getCash() < price){
            System.out.println("Kupujacy nie ma wystarczajaco gotowki");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        buyer.setCar(seller.getCar());
        seller.setCar(null);

        System.out.println("Samochod został sprzedany za "+ price);

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
        System.out.println("Samochod odpalil");
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
