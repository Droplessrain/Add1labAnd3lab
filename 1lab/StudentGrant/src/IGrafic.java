import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class IGrafic extends JFrame {
    private JTextArea outputArea;

    public IGrafic(List<Car> cars) {
        CarProcessor carProcessor = new CarProcessor(cars);

        setTitle("Car Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        outputArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane);

        displayInfo(carProcessor.getCars()); // Initially display the information

        JPanel buttonPanel = new JPanel();

        JButton addCarButton = new JButton("Add Car");
        addCarButton.addActionListener(e -> {
            String stamp = JOptionPane.showInputDialog("Enter car stamp:");
            String classAvt = JOptionPane.showInputDialog("Enter car class:");
            double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter car weight:"));

            String name = JOptionPane.showInputDialog("Enter driver name:");
            String surname = JOptionPane.showInputDialog("Enter driver surname:");
            String patronymic = JOptionPane.showInputDialog("Enter driver patronymic:");
            double experience = Double.parseDouble(JOptionPane.showInputDialog("Enter driver experience:"));
            Driver newDriver = new Driver(name, surname, patronymic, experience);

            Car newCar = new Car(stamp, classAvt, weight, newDriver, null); // Driver and Engine are set to null for simplicity
            carProcessor.addElement(newCar);
            displayInfo(carProcessor.getCars()); // Update the displayed information
        });
        buttonPanel.add(addCarButton);

        JButton updateElement = new JButton("Update element");
        updateElement.addActionListener(e -> {
            int carId = Integer.parseInt(JOptionPane.showInputDialog("Enter ID car for delete"));
            carProcessor.removeElement(carId);
            String stamp = JOptionPane.showInputDialog("Enter car stamp:");
            String classAvt = JOptionPane.showInputDialog("Enter car class:");
            double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter car weight:"));

            String name = JOptionPane.showInputDialog("Enter driver name:");
            String surname = JOptionPane.showInputDialog("Enter driver surname:");
            String patronymic = JOptionPane.showInputDialog("Enter driver patronymic:");
            double experience = Double.parseDouble(JOptionPane.showInputDialog("Enter driver experience:"));
            Driver newDriver = new Driver(name, surname, patronymic, experience);

            Car newCar = new Car(stamp, classAvt, weight, newDriver, null); // Driver and Engine are set to null for simplicity
            carProcessor.addElement(newCar);
            displayInfo(carProcessor.getCars()); // Update the displayed information
        });
        buttonPanel.add(updateElement);

        JButton deleteElement = new JButton("Delete element");
        deleteElement.addActionListener(e -> {
            int carId = Integer.parseInt(JOptionPane.showInputDialog("Enter ID car for delete"));
            carProcessor.removeElement(carId);
            displayInfo(carProcessor.getCars()); // Update the displayed information
        });
        buttonPanel.add(deleteElement);


        add(buttonPanel, BorderLayout.SOUTH); // Placing the button panel at the bottom
        setVisible(true);
    }

    // Method to display information about drivers and cars
    private void displayInfo(List<Car> cars) {
        outputArea.append("\nCars:\n");
        for (Car car : cars) {
            outputArea.append(car.getCarId() + "|" + car.getStamp() + " - " + car.getClassAvt() + " - Weight: " + car.getWeight() + "\n"
                        + car.getDriver().getName() + " - " + car.getDriver().getSurname() + " - Experience: " + car.getDriver().getDrivingExperience() + "\n");
        }
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        SwingUtilities.invokeLater(() -> new IGrafic(cars));
    }
}
