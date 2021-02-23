package devices;

import com.company.Human;
import com.company.Sellable;

public class Phone extends Device implements Sellable {

    private String number;
    private double value;


    public Phone(String number, String model,String producer){
        this.number = number;
        this.model = model;
        this.producer = producer;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPhone() != this) {
            System.out.println("Sprzedajacy nie ma tego urzadzenia");
            return;
        }
        if(buyer.getCash() < price){
            System.out.println("Kupujacy nie ma wystarczajaco gotowki");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        buyer.setPhone(seller.getPhone());
        seller.setPhone(null);

        System.out.println("Telefon został sprzedany za "+ price);

    }

    @Override
    public void turnOn() {
        System.out.println("Telefon sie właczył");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
