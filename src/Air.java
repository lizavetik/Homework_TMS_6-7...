abstract public class Air extends Transport {
    int windSpan;
    int runwayLength;

    public Air(int power, int maxSpeed, int weight, String carBrand) {
        super(power, maxSpeed, weight, carBrand);
    }
}
