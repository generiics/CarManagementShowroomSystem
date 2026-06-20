import java.util.Scanner;

public class Sedan extends Car {

    private int bootSpace;

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

        System.out.print("Enter Boot Space : ");
        bootSpace = sc.nextInt();
    }

    @Override
    public void getData() {

        System.out.println("\nType : Sedan");
        System.out.println("ID : " + carId);
        System.out.println("Company : " + company);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Boot Space : " + bootSpace);
    }
}