import java.util.*;
public class Main {
    public static void main(String[] args) {
    Car car1 = new Car("Audi", "luks", 123.2,
            new Driver("Aleks", "Gavrilchenko", "Evgenevich", 2.3), new Engine(1.6, "Japan"));
    Car car2 = new Car("LADA", "luks", 133.2,
            new Driver("Aleksandr", "Laricshev", "Evgenevich", 3.3), new Engine(3.0, "China"));
    Car car3 = new Car("BMV", "luks", 143.2,
                new Driver("Nikita", "Kasparov", "Evgenevich", 4.3), new Engine(1.6, "Japan"));
    Car car4 = new Car("Audi", "luks", 153.2,
                new Driver("Egor", "Karlson", "Evgenevich", 5.3), new Engine(2.4, "Russia"));
    Car car5 = new Car("LADA", "luks", 163.2,
            new Driver("Anton", "Byrlakov", "Evgenevich", 6.3), new Engine(1.5, "Japan"));
    List<Car> cars = new ArrayList<>();
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);
    cars.add(car4);
    cars.add(car5);
    CarProcessor carProcessor = new CarProcessor(cars);
    List<Driver> drivers = carProcessor.ExpMoreXyears(5);
    for(Driver driver : drivers){
        System.out.println(driver.getName() + " " + driver.getSurname() + " " + driver.getPatronymic());
    }

    List<Car> carsWithStamp = carProcessor.CarStampWith("LADA");
    for(Car carWithStamp : carsWithStamp){
        System.out.println(carWithStamp.getStamp() + "-" + carWithStamp.getClassAvt() + "-" + carWithStamp.getWeight());
    }
    }
}