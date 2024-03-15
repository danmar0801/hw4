import java.util.List;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();
        PizzaBuilder builder = new GenericPizzaBuilder();

        // Building a pizza
        Pizza pizzaHutLarge = director.buildPizza(builder, List.of("Pepperoni", "Mushrooms", "Bacon"), "Large","Pizza Hut");
        Pizza pizzaHutMedium = director.buildPizza(builder, List.of("Pepperoni", "Mushrooms", "Bacon","Onions","Olives","Chicken"), "Medium","Pizza Hut");
        Pizza pizzaHutSmall = director.buildPizza(builder, List.of("Pepperoni", "Mushrooms", "Bacon","Peppers", "Olives", "Tomato and Basil","Beef", "Pesto", "Spicy Pork"), "Small","Pizza Hut");
        pizzaHutLarge.eat();
        pizzaHutMedium.eat();
        pizzaHutSmall.eat();



        // part 2:
        // Pizza Hut pizzas
        PizzaBuilder pizzaHutBuilder = new GenericPizzaBuilder();
        Pizza largePizzaHut = director.buildPizza(pizzaHutBuilder, List.of("Pepperoni", "Mushrooms", "Bacon"), "Large","Pizza Hut");
        largePizzaHut.eat();

        Pizza smallPizzaHut = director.buildPizza(pizzaHutBuilder, List.of("Onions", "Peppers"), "Small","Pizza Hut");
        smallPizzaHut.eat();

        // Little Caesars pizzas
        PizzaBuilder LittleCaesarsBuilder = new GenericPizzaBuilder();
        Pizza mediumLittleCaesars = director.buildPizza(LittleCaesarsBuilder, List.of("Pepperoni", "Mushrooms", "Bacon", "Onions", "Peppers", "Chicken", "Beef", "Extra Cheese"), "Medium","Little Ceasers");
        mediumLittleCaesars.eat();

        Pizza smallLittleCaesars = director.buildPizza(LittleCaesarsBuilder, List.of("Pepperoni", "Mushrooms", "Bacon", "Onions", "Peppers", "Chicken"), "Small","Little Ceasers");
        smallLittleCaesars.eat();

        // Dominos pizzas
        PizzaBuilder DominosBuilder = new GenericPizzaBuilder();
        Pizza smallDominos = director.buildPizza(DominosBuilder, List.of("Pepperoni"), "Small","Domino's");
        smallDominos.eat();

        Pizza largeDominos = director.buildPizza(DominosBuilder, List.of("Sausage", "Olives", "Extra Cheese"), "Large","Domino's");
        largeDominos.eat();
    }
}