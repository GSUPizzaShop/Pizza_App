package template;

public class MeatPizza extends PizzaBuild {
	double price;
	
	void buildPizza() {
		System.out.println("Building meat pizza");
	}

	@Override
	public String getToppings() {
		return "Crust, Cheese, Sauce, Pepperoni, Italian Sauasage, Pork, Ham";
	}

	@Override
	public double getCost() {
		return 0.00;
	}

	@Override
	public String getSize() {
		return "medium";
	}


}
