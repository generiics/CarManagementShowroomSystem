import java.util.Scanner;

public class SUV extends Car {

    private boolean fourWheelDrive;

    @Override
    public void setData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car ID : ");
        carId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Company : ");
        company = sc.nextLine();

        System.out.print("Enter Model : ");
        model = sc.nextLine();

        System.out.print("Enter Price : ");
        price = sc.nextDouble();

        System.out.print("Four Wheel Drive(true/false) : ");
        fourWheelDrive = sc.nextBoolean();
    }

    @Override
    public void getData() {

        System.out.println("\nType : SUV");
        System.out.println("ID : " + carId);
        System.out.println("Company : " + company);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("4WD : " + fourWheelDrive);
    }
}