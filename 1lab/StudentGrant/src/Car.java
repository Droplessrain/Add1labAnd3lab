public class Car{
    private String stamp;
    private String classAvt;
    private double weight;
    private Driver driver;
    private Engine motor;
    private static int nextCarId = 0;
    private int carId;
    public Car(){
    }
    public Car(String stamp, String classAvt, double weight, Driver driver, Engine motor){
        this.stamp = stamp;
        this.classAvt = classAvt;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
        this.carId = nextCarId++;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getMotor() {
        return motor;
    }

    public String getClassAvt() {
        return classAvt;
    }

    public String getStamp() {
        return stamp;
    }

    public int getCarId() {
        return carId;
    }
}