import java.util.ArrayList;
import java.util.List;

public class CarProcessor {
    private final List<Car> cars;
    public CarProcessor(List<Car> cars){
        this.cars = cars;
    }

    public void addElement(Car element) {
        cars.add(element);
    }

    // Метод удаления элемента из коллекции
    public void removeElement(Car element) {
        cars.remove(element);
    }

    // Метод изменения элемента в коллекции
    public void updateElement(Car oldElement, Car newElement) {
        if (cars.contains(oldElement)) {
            int index = cars.indexOf(oldElement);
            cars.set(index, newElement);
        }
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
