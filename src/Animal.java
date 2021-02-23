public class Animal {

    private final String species;
    private double weight;


    Animal(String species){
        this.species = species;
        if(species.equals("Mammal")) this.weight = 60;
        if(species.equals("Bird")) this.weight = 5;
        if(species.equals("Reptile")) this.weight = 10;
        if(species.equals("Fish")) this.weight = 3;
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
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
}
