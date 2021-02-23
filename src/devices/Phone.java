package devices;

public class Phone {

    private String number;
    private String model;

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }


    @Override
    public String toString() {
        return "devices.Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
