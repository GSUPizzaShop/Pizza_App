package template;

public abstract class PizzaBuild {
	abstract void buildPizza();
	abstract void pizzaSize(String size);
	abstract void addToppings();
	abstract double calPrice(double price);
}
