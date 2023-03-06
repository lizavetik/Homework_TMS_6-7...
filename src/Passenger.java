final public class Passenger extends Ground{
    String bodyType;
    int numberOfPasssengers;


    public Passenger(int power, int maxSpeed, int weight, String carBrand) {
        super(power, maxSpeed, weight, carBrand);
    }

    public void generalInfornation(){
        double time = 0.0;
        double  distance = 0.0;
        double  liters = 0.0;
        System.out.println("За время " + time + ", автомобиль " + carBrand + ", двигаясь с максимальной скоростью, " + maxSpeed + " км/ч пройдёт " + distance + " км и израсходует " + liters + " литров топлива");
    }
}
