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
		stage.setTitle("GSU Pizza Shop");
		
		ok = new Button();
		ok.setText("OK");
		ok.setOnAction(this);
		
		small = new RadioButton("Small");
		medium = new RadioButton("Medium");
		large = new RadioButton("Large");
	
		
		pep = new CheckBox("Pepperoni");
		ham = new CheckBox("Ham");
		sausage = new CheckBox("Sausage");
		pork = new CheckBox("Pork");
		
		StackPane layout = new StackPane();
		BorderPane border = new BorderPane();
		layout.getChildren().add(ok);
		
		/*Rectangle topBar = new Rectangle(550,75);
		Rectangle bottomBar = new Rectangle(550,75);
		topBar.setStyle("-fx-background-color: lightblue");
		border.setTop(topBar);
		//border.setBottom(bottomBar);
		//border.setStyle("-fx-background-color: blue");
		layout.getChildren().add(border);*/
		
		Scene scene = new Scene(layout,400,550);
		stage.setScene(scene);
		stage.setResizable(false);
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

