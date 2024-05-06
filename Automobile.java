import java.util.Scanner;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;

    // Constructor
    public Automobile(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to remove vehicle
    public String removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        if (autoMake.equals(make) && autoModel.equals(model) && autoColor.equals(color) && autoYear == year) {
            make = "";
            model = "";
            color = "";
            year = 0;
            return "Vehicle information removed successfully";
        } else {
            return "Mismatch: Vehicle information not removed";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        Automobile myCar = new Automobile("Toyota", "Camry", "Blue", 2020);
        System.out.println(myCar.removeVehicle(make, model, color, year));

        scanner.close();
    }
}
