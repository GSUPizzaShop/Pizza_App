import java.util.ArrayList;

public class PizzaShopFactory implements PizzaShop{
	
	static PizzaShopFactory pizza;
	ArrayList<StateObserver> observers = new ArrayList<StateObserver>();
	private double price = 0;
	private double delivFee;
	private double tax;
	private double totalprice;
	private int state = 0;
	
	PrintOrder orderPrint = new PrintOrder();
	PrintOrderCommand printCommand = new PrintOrderCommand(orderPrint);
	private String orderReciept = "Your order";
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
	public void cancelOrder(){
		// TODO Auto-generated method stub
		if(state==1 || state==2 || state==9) {
			try {
				
			}
		}
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
			printCommand.execute(orderReciept);
		}
		orderReciept = "Your order";
		state = 9;
		notifyStateObservers();
	}

	private void notifyStateObservers() {
		// TODO Auto-generated method stub
		for(int i=0; i<observers.size();i++) {
			StateObserver observer = (StateObserver)observers.get(i);
			observer.update();
		}
	}
	
	public synchronized static PizzaShopFactory getInstance() {
		if(pizza == null) {
			pizza = new PizzaShopFactory();
		}
		return pizza;
	}

}
