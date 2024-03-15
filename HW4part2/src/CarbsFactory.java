import java.util.Random;

public class CarbsFactory implements MacronutrientFactory {
    private String[] noRestriction = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private String[] paleo = {"pistachio"};
    private String[] vegan = {"Bread", "Lentils", "Pistachio"};
    private String[] nutAllergy = {"Cheese", "Bread", "Lentils"};

    private Random random = new Random();

    @Override
    public String createCarb(String dietPlan) {
        switch (dietPlan) {
            case "NoRestriction":
                return noRestriction[random.nextInt(noRestriction.length)];
            case "Paleo":
                return paleo[random.nextInt(paleo.length)];
            case "Vegan":
                return vegan[random.nextInt(vegan.length)];
            case "NutAllergy":
                return nutAllergy[random.nextInt(nutAllergy.length)];
            default:
                throw new IllegalArgumentException("Diet plan not recognized");
        }
    }

    @Override
    public String createProtein(String dietPlan) {
        throw new UnsupportedOperationException("Carbs factory can't create protein");
    }

    @Override
    public String createFat(String dietPlan) {
        throw new UnsupportedOperationException("Carbs factory can't create fats");
    }
}

