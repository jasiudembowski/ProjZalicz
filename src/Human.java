public class Human {

    private Animal pet;
    private String name;
    private String age;
    private Car car;
    private double salary;


    public double getSalary(){
        return this.salary;
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
