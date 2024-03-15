public class Customer {
    private final String name;
    private final String dietPlan;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }
}
