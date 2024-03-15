public class GenericPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public GenericPizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void addTopping(String topping) {
        if (!pizza.addTopping(topping)) {
            System.out.println("Failed to add topping: " + topping);
        }
    }

    @Override
    public void setSize(String size) {
        pizza.setSize(size);
    }

    @Override
    public void setChain(String chain) {
        pizza.setChain(chain);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
