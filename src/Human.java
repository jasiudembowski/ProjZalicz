import java.util.Date;

public class Human {

    private Animal pet;
    private String name;
    private String age;
    private Car car;
    private double salary;
    private Date getSalaryLastDate;


    public double getSalary(){
        System.out.println("Ostatnio dane o wyplacie byly pobierane " + this.getSalaryLastDate);
        this.getSalaryLastDate = new Date(System.currentTimeMillis()); // traktuje wykonanie gettera jako pobranie informacji o wyplacie
        return this.salary;
    }

    public Car getCar(){
        return this.car;
    }

    public void setSalary(double salary){
        if(salary < 0 ) return;
        System.out.println("Nowe dane zostały wyslane do systemu ksiegowego");
        System.out.println("Koniecznosc odebrania aneksu do umowy od Pani Hani z kadr");
        System.out.println("ZUS i US juz wiedza o zmianie dochodu i nie ma sensu ukrywac dochodu");
        this.salary = salary;

    }


    public void setCar(Car car){
        this.car = car;
    }



}
