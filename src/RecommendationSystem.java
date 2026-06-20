public class RecommendationSystem {

    public static void recommendCar(double budget, int type) {

        if (type == 1) {

            if (budget >= 1200000) {

                System.out.println("\nAI Recommendation");
                System.out.println("Company : Hyundai");
                System.out.println("Model : Creta");
                System.out.println("Price : 1200000");
            }

            else if (budget >= 900000) {

                System.out.println("\nAI Recommendation");
                System.out.println("Company : Tata");
                System.out.println("Model : Nexon");
                System.out.println("Price : 900000");
            }

            else {

                System.out.println("No SUV available.");
            }
        }

        else if (type == 2) {

            if (budget >= 1400000) {

                System.out.println("\nAI Recommendation");
                System.out.println("Company : Honda");
                System.out.println("Model : City");
                System.out.println("Price : 1400000");
            }

            else {

                System.out.println("No Sedan available.");
            }
        }

        else if (type == 3) {

            if (budget >= 700000) {

                System.out.println("\nAI Recommendation");
                System.out.println("Company : Maruti");
                System.out.println("Model : Swift");
                System.out.println("Price : 700000");
            }

            else {

                System.out.println("No Hatchback available.");
            }
        }
    }
}