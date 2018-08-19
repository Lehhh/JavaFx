package application;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Exemplo1 extends javafx.application.Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		
		//Layout
		FlowPane noRaiz = new FlowPane();
		
		
		
		//Cena
		Scene minhaCena = new Scene(noRaiz, 300,250);
		
		//Nó
		Label label = new Label();
		label.setText("Olá Mundo!");
		
		//Adicionar Elementos em cena
		noRaiz.getChildren().add(label);
		
		// Adicionar a cena no palco
		primaryStage.setScene(minhaCena);
		
		//Exibir o palco e e sua(s) cenas(s)
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	

}
