public interface PizzaBuilder {
    void addTopping(String topping);
    void setSize(String size);
    void setChain(String chain);
    Pizza getPizza();
}
