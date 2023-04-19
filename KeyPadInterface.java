/**
 * File: TestingFX/keypad/KeyPadPane.java
 * Package: keypad
 * @author Tiffany Fadgen
 * Created on: Apr 18, 2023
 * Last Modified:  Apr 18, 2023
 * Description:  User interface using keypad
 * Small change to trigger update
 */

package keypad;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KeyPadInterface extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.add(new Button("Num\nLock  "), 1,0);
		pane.add(new Button("/\n        "), 2, 0);
		pane.add(new Button("*\n        "), 3, 0);
		
		// create keypadType 
		KeypadType keyPane = new KeypadType(); // using custom version
		pane.add(keyPane, 1, 3);
		
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
