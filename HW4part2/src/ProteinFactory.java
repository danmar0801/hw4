import java.util.Random;
public class ProteinFactory implements MacronutrientFactory {
    private String[] noRestriction = {"Fish", "Chicken", "Beef", "Tofu"};
    private String[] vegan = {"Tofu"};
    private String[] nutAllergy = noRestriction; // Nut allergy does not affect protein choices here

    private Random random = new Random();
    @Override
    public String createCarb(String dietPlan) {
        // This factory does not produce carbs
        throw new UnsupportedOperationException("Carbs factory can't create Carbs");
    }

    @Override
    public String createProtein(String dietPlan) {
        switch (dietPlan) {
            case "NoRestriction":
                return noRestriction[random.nextInt(noRestriction.length)];
            case "Vegan":
                return vegan[random.nextInt(vegan.length)];
            case "NutAllergy":
                return nutAllergy[random.nextInt(nutAllergy.length)];
            case "Paleo":
                return noRestriction[random.nextInt(noRestriction.length - 1)]; // Exclude the last item (Tofu)
            default:
                throw new IllegalArgumentException("Diet plan not recognized");
        }
    }

    @Override
    public String createFat(String dietPlan) {
        // This factory does not produce fats
        throw new UnsupportedOperationException("Carbs factory can't create fats");
    }
}

