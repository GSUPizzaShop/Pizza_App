
public interface PizzaShopControllerInterface {
	void cancelOrder();
	void update(int x);
	void printOrder(boolean p);
	void getSize();
	double getCost(double price);
	void getToppings();
	PizzaShopView getView();
}
