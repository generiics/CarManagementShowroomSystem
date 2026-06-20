import java.util.Scanner;

public class HatchBack extends Car {

    private int mileage;

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

        System.out.print("Enter Mileage : ");
        mileage = sc.nextInt();
    }

    @Override
    public void getData() {

        System.out.println("\nType : Hatchback");
        System.out.println("ID : " + carId);
        System.out.println("Company : " + company);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Mileage : " + mileage);
    }
}