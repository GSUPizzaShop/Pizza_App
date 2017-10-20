package application;

public class BasicPizza implements Pizza {

	@Override
	public String getToppings() {
		return "Crust, Cheese, Sauce";
	}

	@Override
	public double getCost() {
		return 5.21;
	}

	@Override
	public String getSize() {
		return "Medium";
	}
	
}
