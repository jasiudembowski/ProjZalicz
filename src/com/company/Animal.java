package com.company;

public class Animal implements Sellable{

    private final String species;
    private double weight;


    Animal(String species){
        this.species = species;
        if(species.equals("Mammal")) this.weight = 60;
        if(species.equals("Bird")) this.weight = 5;
        if(species.equals("Reptile")) this.weight = 10;
        if(species.equals("Fish")) this.weight = 3;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPet() != this) {
            System.out.println("Sprzedajacy nie ma tego zwierzaka");
            return;
        }
        if(buyer.getCash() < price){
            System.out.println("Kupujacy nie ma wystarczajaco gotowki");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        buyer.setPet(seller.getPet());
        seller.setPet(null);

        System.out.println("Zwierzak został sprzedany za "+ price);

    }

    void feed(){
        if(this.weight <=0){
            System.out.println("Zwierze nie żyje");
        }
        else {
            this.weight += 2;
        }
    }
    void takeForAWalk(){
        if(this.weight <= 0){
            System.out.println("Zwierze nie żyje");
        }else{
            this.weight -=2;
        }



    }

    @Override
    public String toString() {
        return "com.company.Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
}
