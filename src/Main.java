import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

        //test do zad 1
        Animal fish = new Animal("Fish");
        fish.takeForAWalk();
        fish.takeForAWalk();
        fish.feed();

        //test do zad 2
        Human human = new Human();
        Car car = new Car("CLA 45", "Mercedes",270,200);
        human.setCar(car);

        //test do zad 6
        Car anotherCar = new Car("CLA 45", "Mercedes",270,200);
        System.out.println("Czy auta sa takie same?" + car.equals(anotherCar) ); //tutaj juz sprawdzam z nadpisana metoda equals


        Phone phone = new Phone("8493749378","Nokia");
        System.out.println(fish.toString());
        System.out.println(car.toString());
        System.out.println(human.toString());
        System.out.println(phone.toString());










    }
}
