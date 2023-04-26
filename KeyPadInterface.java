/**
 * File: TestingFX/keypad/KeyPadPane.java
 * Package: keypad
 * @author Tiffany Fadgen
 * Created on: Apr 26, 2023
 * Last Modified:  Apr 26, 2023
 * Description:  User interface using keypad
 * https://github.com/TerrieKnight/hello-world
 */

package keypad;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KeyPadInterface extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		Button btnNum = new Button("Num\nLock  ");
		Button btnSla = new Button("/\n         ");
		Button btnAs = new Button("*\n         ");
		Button btnMin = new Button("-\n        ");
		Button btnBlank = new Button("\n      ");
		Button btnPlus = new Button("+\n \n     ");
		Button btnEnt = new Button("Enter\n\n\n  ");
		HBox hbox = new HBox();
		hbox.getChildren().addAll(btnNum, btnSla, btnAs, btnMin);
		VBox vbox = new VBox();
		vbox.getChildren().addAll(btnBlank, btnPlus, btnEnt);
		
		// set extra events 
		Button[] newArr = {btnNum, btnSla, btnAs, btnMin, btnBlank, btnPlus, btnEnt};
		ArrayList<Button> newBut = new ArrayList<>(Arrays.asList(newArr));
		for (int i = 0; i < newBut.size(); i++) {
			newBut.get(i).setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					System.out.println("Button was clicked: " + ((Button)e.getSource()).getText());
				}
			});
		}
		
		// create keypadType 
		KeypadType keyPane = new KeypadType();
		pane.add(hbox, 0, 0);
		pane.add(keyPane, 0, 1);
		pane.add(vbox, 1, 1);
		
		// add KeyPane to BorderPane
		pane.setAlignment(Pos.CENTER);
		
		
		// create your scene (400 x 400 to clearly show KeyPadPane)
		Scene scene = new Scene(pane, 400, 400);
		
		primaryStage.setTitle("Test KeyPadPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) { 
		launch(args);
	}
}
