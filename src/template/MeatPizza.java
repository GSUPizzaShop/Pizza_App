package template;

public class MeatPizza {
	double price;
	
	void buildPizza() {
		System.out.println("Building meat pizza");
	}

	void pizzaSize(String size) {
		if(size.equalsIgnoreCase("small")) {
			price = 5.00;
			calPrice(price);
		} else if(size.equalsIgnoreCase("medium")) {
			price = 6.00;
			calPrice(price);
		} else if(size.equalsIgnoreCase("large")) {
			price = 8.05;
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
