package template;

public class PepPizza extends PizzaBuild{
	double price;

	void buildPizza() {
		System.out.println("Building pep pizza");
	}

	void pizzaSize(String size) {
		if(size.equalsIgnoreCase("small")) {
			price = 4.29;
			calPrice(price);
		} else if(size.equalsIgnoreCase("medium")) {
			price = 5.25;
			calPrice(price);
		} else if(size.equalsIgnoreCase("large")) {
			price = 7.50;
			calPrice(price);
		}
	}

	void addToppings() {
		System.out.println("Adding marinara sauce");
		System.out.println("Adding cheese");
		System.out.println("Adding pep");
	}

	double calPrice(double price) {
		this.price = price;
		double tax = .07;
		price = price * tax;
		return price;
	}

}
