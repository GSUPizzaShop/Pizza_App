package template;

public class CheesePizza extends PizzaBuild {

	public void buildPizza() {
		System.out.println("Building cheese pizza");
	}
	
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
		return "medium";
	}

}
