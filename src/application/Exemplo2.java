package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Exemplo2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		FlowPane noRaiz = new FlowPane();
		Scene minhaCena = new Scene(noRaiz,300,200);
		Button btn = new Button();
		btn.setText("Olá Mundo");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {

				System.out.println("Olá Mundo");
				
			}
		});
		noRaiz.getChildren().add(btn);
		primaryStage.setScene(minhaCena);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
