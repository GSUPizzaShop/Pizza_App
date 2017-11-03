import javafx.util.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.application.*;

public class GSUPizzaShop extends Application implements EventHandler<ActionEvent>{
	PizzaShop model = new PizzaShop.getInstance();
	PizzaShopControllerInterface controller = new PizzaShopController(model);
	Button ok;
	RadioButton small, medium, large;
	CheckBox pep, ham, sausage, pork;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		PizzaShopView shopview = controller.getView();
		shopview.createView();
		stage.setScene(shopview.scene);
		stage.setResizable(false);
		stage.sizeToScene();
		stage.setTitle("GSU Pizza Shop");
		stage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource()==ok) {
			String tops = "";
			String order = "Your order of a ";
			
			if(pep.isSelected()) {
				tops += "Pepperoni \n";
			}
			if(ham.isSelected()) {
				tops += "Ham \n";
			}
			if(sausage.isSelected()) {
				tops += "Sausage \n";
			}
			if(pork.isSelected()) {
				tops += "Pork \n";
			}
			
			if(small.isSelected()) {
				order += "small pizza with ";
			}
			if(medium.isSelected()) {
				order += "medium pizza with ";
			}
			if(large.isSelected()) {
				order += "larger pizza with ";
			}
			
			if(tops.equals("")) {
				order += "no toppings.";
			}
			else order += "toppings: \n" + tops;
			System.out.println(order);
			//JOptionPane.showMessageDialog(ok, order, "Your Order", JOptionPane.INFORMATION_MESSAGE);
		}
		pep.setSelected(false);
		ham.setSelected(false);
		sausage.setSelected(false);
		pork.setSelected(false);
		small.setSelected(true);
		
	}

}

