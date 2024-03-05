import java.util.ArrayList;
import java.util.List;

public class CarProcessor {
    private final List<Car> cars;
    public CarProcessor(List<Car> cars){
        this.cars = cars;
    }
    public List<Car> addElement(Car element) {
        cars.add(element);
        return cars;
    }

    // Метод удаления элемента из коллекции
    public List<Car> removeElement(Car element) {
        cars.remove(element);
        return cars;
    }
    public List<Car> removeElement(int carId) {
        for(Car car : cars){
            if(car.getCarId() == carId){
                cars.remove(car);
            }
        }
        return cars;
    }

    // Метод изменения элемента в коллекции
    public List<Car> updateElement(Car oldElement, Car newElement) {
        if (cars.contains(oldElement)) {
            int index = cars.indexOf(oldElement);
            cars.set(index, newElement);
        }
        return cars;
    }
    public List<Car> updateElement(int carID, Car newElement) {
        if (cars.contains(new CarProcessor(cars).findElementForID(carID))) {
            int index = cars.indexOf(new CarProcessor(cars).findElementForID(carID));
            cars.set(index, newElement);
        }
        return cars;
    }
    public Car findElementForID(int ID){
        Car carFinded = null;
        for(Car car : cars){
            if(car.getCarId() == ID){
                carFinded = car;
            }
        }
        return carFinded;
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

    public List<Car> getCars() {
        return cars;
    }
}
