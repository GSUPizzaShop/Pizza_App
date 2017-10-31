import java.util.ArrayList;

public class PizzaShopFactory implements PizzaShop{
	
	static PizzaShopFactory pizza;
	ArrayList<StateObserver> observers = new ArrayList<StateObserver>();
	private double price;
	private double delivFee;
	private double tax;
	private double totalprice;
	private int state = 0;
	
	PrintOrder orderPrint = new PrintOrder();
	PrintOrderCommand printCommand = new PrintOrderCommand(orderPrint);
	@Override
	public String getToppings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getCost(double price) {
		this.price = price;
		delivFee = price * .15;
		tax = price * .07;
		totalprice = price + delivFee + tax;
		return totalprice;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		
	}
	
	public int getState() {
		return state;
	}

	@Override
	public void registerObserver(StateObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(StateObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printOrder(boolean p) {
		// TODO Auto-generated method stub
		if(p) {
			
		}
	}

}
