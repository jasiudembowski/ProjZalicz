package devices;

public class Phone extends Device{

    private String number;


    public Phone(String number, String model,String producer){
        this.number = number;
        this.model = model;
        this.producer = producer;
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
