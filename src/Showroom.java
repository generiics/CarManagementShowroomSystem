import java.util.ArrayList;
import java.util.Scanner;

public class Showroom {

    public static void main(String[] args) {
        VoiceAssistant.speak("Welcome to Sudhir Smart Car Showroom");

        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();


        int choice;

        do {

            System.out.println("\n===== SMART CAR SHOWROOM =====");
            System.out.println("1. Add Sedan");
            System.out.println("2. Add SUV");
            System.out.println("3. Add Hatchback");
            System.out.println("4. View Cars");
            System.out.println("5. Recommend Car");
            System.out.println("6. Delete Car");
            System.out.println("7. Search Car");
            System.out.println("8. Update Car");
            System.out.println("9. Exit");


            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Car sedan = new Sedan();
                    sedan.setData();
                    cars.add(sedan);
                    VoiceAssistant.speak("Sedan added successfully");
                    break;

                case 2:
                    Car suv = new SUV();
                    suv.setData();
                    cars.add(suv);
                    VoiceAssistant.speak("SUV added successfully");
                    break;

                case 3:
                    Car hatch = new HatchBack();
                    hatch.setData();
                    cars.add(hatch);
                    VoiceAssistant.speak("Hatchback added successfully");
                    break;

                case 4:
                    if (cars.isEmpty()) {
                        System.out.println("No Cars Available.");
                    } else {
                        for (Car car : cars) {
                            car.getData();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter Budget : ");
                    double budget = sc.nextDouble();

                    System.out.println("1. SUV");
                    System.out.println("2. Sedan");
                    System.out.println("3. Hatchback");

                    int type = sc.nextInt();

                    RecommendationSystem.recommendCar(budget, type);
                    VoiceAssistant.speak("AI recommendation generated");
                    break;

                case 6:
                    System.out.print("Enter Car ID to delete : ");
                    int id = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < cars.size(); i++) {
                        if (cars.get(i).getCarId() == id) {
                            cars.remove(i);
                            System.out.println("Car deleted successfully.");
                            VoiceAssistant.speak("Car deleted successfully");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Car not found.");
                    }
                    break;

                case 7:

                    System.out.print("Enter Car ID : ");
                    int searchId = sc.nextInt();

                    boolean searchfound = false;

                    for(Car car : cars) {

                        if(car.getCarId() == searchId) {

                            car.getData();
                            VoiceAssistant.speak("Car found");
                            searchfound = true;

                            break;
                        }
                    }

                    if(!searchfound) {

                        System.out.println("Car not found.");
                        VoiceAssistant.speak("Car not found");

                    }

                    break;
                case 8:

                    System.out.print("Enter Car ID : ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    boolean updated = false;

                    for(Car car : cars) {

                        if(car.getCarId() == updateId) {

                            System.out.print("Enter New Company : ");
                            String company = sc.nextLine();

                            System.out.print("Enter New Model : ");
                            String model = sc.nextLine();

                            System.out.print("Enter New Price : ");
                            double price = sc.nextDouble();

                            car.setCompany(company);
                            car.setModel(model);
                            car.setPrice(price);

                            System.out.println("Car Updated Successfully.");
                            VoiceAssistant.speak("Car details updated successfully");

                            updated = true;

                            break;
                        }
                    }

                    if(!updated) {

                        System.out.println("Car not found.");
                    }

                    break;
                case 9:

                    System.out.println("Thank You!");
                    VoiceAssistant.speak("Thank you for visiting Sudhir Smart Car Showroom");

                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 9);

        sc.close();
    }
}