package helloWorld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloFX extends Application {
	private int nClicks = 0;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button();
		btn.setText("Saluda");
		Label lbl = new Label();
		lbl.setText("Encara no he saludat!");
		
		btn.setOnAction(event -> {
			nClicks++;
			lbl.setText("Has saludat " + nClicks + " vegades");
			
		});
		/*
		 * btn.setOnAction(new EventHandler<ActionEvent>() {
		 *     @Override
		 *     public void handle(ActionEvent event) {
		 *         ...
		 *     }
		 * });
		 */

		GridPane root = new GridPane();
		root.add(btn, 0, 1);
		root.add(lbl, 0, 2);

		Scene scene = new Scene(root, 300, 250);

		primaryStage.setTitle("Hola món!!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
