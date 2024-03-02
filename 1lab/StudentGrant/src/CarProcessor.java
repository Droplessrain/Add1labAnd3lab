import java.util.ArrayList;
import java.util.List;

public class CarProcessor {
    private final List<Car> cars;
    public CarProcessor(List<Car> cars){
        this.cars = cars;
    }

    public List<Driver> ExpMoreXyears(double Exyears){
        List<Driver> drivers = new ArrayList<>();
        for(Car car : cars){
            if(car.getDriver().getDrivingExperience() > Exyears){
                drivers.add(car.getDriver());
            }
        }
        return drivers;
    }

    public List<Car> CarStampWith(String stamp){
        List<Car> carsSt = new ArrayList<>();
        for(Car car : cars){
            if(stamp.equals(car.getStamp())){
                carsSt.add(car);
            }
        }
        return carsSt;
    }
}
