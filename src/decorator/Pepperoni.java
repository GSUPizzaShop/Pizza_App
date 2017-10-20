package decorator;

public class Pepperoni extends PizzaDecorator {
	Pepperoni(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription() {
		return tempPizza.getToppings() + ", Pepperoni";
	}
	
	public double getCost() {
		return tempPizza.getCost() + 0.25;
	}
}
