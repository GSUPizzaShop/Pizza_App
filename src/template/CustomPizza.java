package template;

public class CustomPizza extends PizzaBuild {
	double price;
	
	void buildPizza() {
		System.out.println("Building custom pizza");
	}

	void pizzaSize(String size) {
		if(size.equalsIgnoreCase("small")) {
			price = 5.25;
			calPrice(price);
		} else if(size.equalsIgnoreCase("medium")) {
			price = 6.25;
			calPrice(price);
		} else if(size.equalsIgnoreCase("large")) {
			price = 8.25;
			calPrice(price);
		}
	}

	void addToppings() {
		
	}

	double calPrice(double price) {
		this.price = price;
		double tax = .07;
		price = price * tax;
		return price;
	}

}
