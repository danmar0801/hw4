import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
    private List<String> toppings = new ArrayList<>();
    private String size;
    private String chain;
    private static final List<String> availableToppings = Arrays.asList(
            "Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese",
            "Peppers", "Chicken", "Olives", "Spinach", "Tomato and Basil", "Beef",
            "Ham", "Pesto", "Spicy Pork", "Ham and Pineapple"
    );

    public boolean addTopping(String topping) {
        if (availableToppings.contains(topping)) {
            toppings.add(topping);
            return true;
        } else {
            System.out.println("Topping " + topping + " is not available.");
            return false;
        }
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public void eat() {
        System.out.println("Eating a " + size + " pizza from " + chain + " with toppings: " + String.join(", ", toppings));
    }
}
