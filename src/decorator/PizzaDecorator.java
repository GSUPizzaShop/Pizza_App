package decorator;

public class PizzaDecorator implements Pizza {
	protected Pizza tempPizza;
	
	PizzaDecorator(Pizza newPizza) {
		tempPizza = newPizza;
	}
	
	@Override
	public String getToppings() {
		return tempPizza.getToppings();
	}

	@Override
	public double getCost() {
		return tempPizza.getCost();
	}

	@Override
	public String getSize() {
		return tempPizza.getSize();
	}

}
