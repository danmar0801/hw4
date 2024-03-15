public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[] {
                new Customer("Alice", "NoRestriction"),
                new Customer("Billy", "Paleo"),
                new Customer("Bronco", "NoRestriction"),
                new Customer("Bob", "Paleo"),
                new Customer("Charlie", "Vegan"),
                new Customer("Diana", "NutAllergy"),
                // Add more customers as needed
        };

        for (Customer customer : customers) {
            MacronutrientFactory carbsFactory = (MacronutrientFactory) SingletonFactory.getInstance("CarbsFactory");
            MacronutrientFactory proteinFactory = (MacronutrientFactory) SingletonFactory.getInstance("ProteinFactory");
            MacronutrientFactory fatsFactory = (MacronutrientFactory) SingletonFactory.getInstance("FatsFactory");

            String carb = carbsFactory.createCarb(customer.getDietPlan());
            String protein = proteinFactory.createProtein(customer.getDietPlan());
            String fat = fatsFactory.createFat(customer.getDietPlan());

            System.out.println("Meal for " + customer.getName() + " (" + customer.getDietPlan() + "):");
            System.out.println("Carb: " + carb);
            System.out.println("Protein: " + protein);
            System.out.println("Fat: " + fat);
            System.out.println();
        }
    }
}