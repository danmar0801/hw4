import java.util.List;

public class PizzaDirector {
    public Pizza buildPizza(PizzaBuilder builder, List<String> toppings, String size, String chain) {
        builder.setChain(chain);
        builder.setSize(size);
        toppings.forEach(builder::addTopping);
        return builder.getPizza();
    }
}
