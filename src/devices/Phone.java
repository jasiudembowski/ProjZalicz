package devices;

import com.company.Human;
import com.company.Sellable;

import java.net.URL;

public class Phone extends Device implements Sellable {

    private String number;
    private double value;
    private static final String defaultServerAddress = "google.com";
    private static final String defaultProtocol = "http";
    private static final String defaultVersionName = "v.3.18.4";


    public Phone(String number, String model,String producer){
        this.number = number;
        this.model = model;
        this.producer = producer;
    }

    public void installAnnApp(String name){
        System.out.println("Instaluje aplikacje o nazwie " + name);
    }
    public void installAnnApp(String name,String version){
        System.out.println("Instaluje aplikacje o nazwie " + name + "w wersji" + version);
    }
    public void installAnnApp(String name,String version, String serverName){
        System.out.println("Instaluje aplikacje o nazwie " + name + "w wersji" + version + "z serwera" + serverName);

    }
    public void installAnnApp(String[] name){
        System.out.println("Instaluje liste aplikacji: ");
        for(String app : name){
            System.out.print(app+" ");
        }

    }

    public void installAnnApp(URL url){
        System.out.println("Instaluje aplikacje z linku" + url.toString());
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
