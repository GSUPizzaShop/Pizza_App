
public class PizzaShopController implements PizzaShopControllerInterface{
	PizzaShop model;
	PizzaShopView view;
	
	//setting the model and view in the controller
	public PizzaShopController(PizzaShop model) {
		this.model = model;
		view  = new PizzaShopView(this,model);
	}
	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		model.cancelOrder();
	}

	@Override
	public void update(int x) {
		// TODO Auto-generated method stub
		model.update(x);
	}

	@Override
	public void printOrder(boolean p) {
		// TODO Auto-generated method stub
		model.printOrder(p);
	}

	@Override
	public void getSize() {
		// TODO Auto-generated method stub
		model.getSize();
	}

	@Override
	public double getCost(double price) {
		// TODO Auto-generated method stub
		return model.getCost(price);
	}

	@Override
	public void getToppings() {
		// TODO Auto-generated method stub
		model.getToppings();
	}

	@Override
	public PizzaShopView getView() {
		// TODO Auto-generated method stub
		return view;
	}

}
