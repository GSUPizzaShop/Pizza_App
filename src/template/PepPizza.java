package template;

public class PepPizza extends PizzaBuild{

	void buildPizza() {
		System.out.println("Building pep pizza");
	}

	@Override
	public String getToppings() {
		return "Crust, Cheese, Sauce, Pepperoni";
	}

	@Override
	public double getCost() {
		return 5.25;
	}

	@Override
	public String getSize() {
		return "medium";
	}


}
