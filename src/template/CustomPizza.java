package template;

public class CustomPizza extends PizzaBuild {

	@Override
	public String getToppings() {
		return "Figure out the custom toppings here";
	}

	@Override
	public double getCost() {
		return 0.00;
	}

	@Override
	public String getSize() {
		return "Size of pizza";
	}

	@Override
	void buildPizza() {
		// TODO Auto-generated method stub
		
	}
	

}
