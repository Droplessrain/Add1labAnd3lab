public class Driver extends Car{
    private final String name;
    private final String surname;
    private final String patronymic;
    private double drivingExperience;

    public Driver(String name, String surname, String patronymic, double drivingExperience) {
        super();
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public double getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(double drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
