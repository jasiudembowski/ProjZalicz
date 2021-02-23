package com.company;

import Creatures.Animal;
import Creatures.FarmAnimal;
import Creatures.Pet;
import devices.Car;
import devices.Phone;



public class Main {

    public static void main(String[] args) {

        //test do zad 1
        Pet fish = new Pet("Fish");
        fish.takeForAWalk();
        fish.takeForAWalk();
        fish.feed();

        //test do zad 2
        Human human = new Human();
        Car car = new Car("CLA 45", "Mercedes",270,200,"2005");
        human.setCar(car);

        //test do zad 6
        Car anotherCar = new Car("CLA 45", "Mercedes",270,200,"2005");
        System.out.println("Czy auta sa takie same?" + car.equals(anotherCar) ); //tutaj juz sprawdzam z nadpisana metoda equals


        Phone phone = new Phone("8493749378","3310","Nokia");
        Phone anotherPhone = new Phone("38574937","S6","Iphone");
        System.out.println(fish.toString());
        System.out.println(car.toString());
        System.out.println(human.toString());
        System.out.println(phone.toString());

        //test do zad 7
        phone.turnOn();
        car.turnOn();

        //test do zad 8

        Human buyer = new Human(null,"John","19",car,1000000,null,100000,phone);
        Human seller = new Human(fish,"Marc","20",anotherCar,100000,null,100000,anotherPhone);
        fish.sell(seller,buyer,100.0);
        //handel ludzmi jest niemozliwy poniewaz klasa human nie implementuje interfejsu salleable

        //test do zad 9
        Pet pet = new Pet("Mammal");
        pet.feed(3);
        FarmAnimal farmPet = new FarmAnimal("Mammal");
        farmPet.feed();












    }
}
