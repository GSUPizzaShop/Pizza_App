
public interface PizzaShop {
	//Method to add toppings to pizza
			String getToppings();
			//Method to get total cost of pizza
			double getCost(double price);
			//Method to get size of the pizza
			String getSize();
			//Method to cancel order
			void cancelOrder();
			//Method for changing the state of the app
			void update(int x);
			//Method to print out the order
			void printOrder(boolean p);
			//Method for adding and removing observers
			void registerObserver(StateObserver o);
			void removeObserver(StateObserver o);
			int getState();
}

interface StateObserver {
	void update();
}