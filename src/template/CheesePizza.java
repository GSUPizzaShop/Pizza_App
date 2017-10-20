package template;

public class CheesePizza extends PizzaBuild {
	double price;
	
	public void buildPizza() {
		System.out.println("Building cheese pizza");
	}
	
	public void pizzaSize(String size) {
		
		if(size.equalsIgnoreCase("small")) {
			price = 4.25;
			calPrice(price);
		} else if(size.equalsIgnoreCase("medium")) {
			price = 5.21;
			calPrice(price);
		} else if(size.equalsIgnoreCase("large")) {
			price = 7.46;
			calPrice(price);
		}
	}
	
	public void addToppings() {
		System.out.println("Adding cheese");
		System.out.println("Adding marinara sauce");
	}
	
	public double calPrice(double price) {
		this.price = price;
		double tax = .07;
		price = price * tax;
		return price;
	}

}
