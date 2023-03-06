abstract public class Ground  extends Transport{
    int numberOfWheels;
    int fuelConsumption;


    public Ground(int power, int maxSpeed, int weight, String carBrand) {
        super(power, maxSpeed, weight, carBrand);
    }
}
