package Creatures;

public class FarmAnimal extends Animal implements Edbile{

    public FarmAnimal(String species){
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("To zwierze zostalo zjedzone");
    }

}
