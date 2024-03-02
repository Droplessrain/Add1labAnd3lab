public class Engine extends Car{
    private final double power;
    private final String manufacturer;
    public Engine(double power, String manufacturer){
        super();
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public double getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
