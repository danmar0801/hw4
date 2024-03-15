import java.util.Random;
public class FatsFactory implements MacronutrientFactory {
    private String[] noRestriction = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
    private String[] vegan = {"Avocado", "Peanuts"};
    private String[] paleo = {"Avocado", "Tuna", "Peanuts"};
    private String[] nutAllergy = {"Avocado", "Sour cream", "Tuna"}; // Exclude peanuts for nut allergy

    private Random random = new Random();
    @Override
    public String createCarb(String dietPlan) {
        // This factory does not produce carbs
        throw new UnsupportedOperationException("Carbs factory can't create Carbs");
    }

    @Override
    public String createProtein(String dietPlan) {
        // This factory does not produce protein
        throw new UnsupportedOperationException("Carbs factory can't create protein");
    }

    @Override
    public String createFat(String dietPlan) {
        switch (dietPlan) {
            case "NoRestriction":
                return noRestriction[random.nextInt(noRestriction.length)];
            case "Vegan":
                return vegan[random.nextInt(vegan.length)];
            case "Paleo":
                return paleo[random.nextInt(paleo.length)];
            case "NutAllergy":
                return nutAllergy[random.nextInt(nutAllergy.length)];
            default:
                throw new IllegalArgumentException("Diet plan not recognized");
        }
    }
}
