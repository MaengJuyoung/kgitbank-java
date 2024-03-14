package reserve.main;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import reserve.controller.Controller;


public class ReserveMain extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(getClass().getResource(""));
		System.out.println(Paths.get("").toAbsolutePath().toString());	
		System.out.println(
				"file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/reserve/fxml/reservation.fxml");
		
		URL url = new URL("file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/reserve/fxml/reservation.fxml");
		
		FXMLLoader loader = new FXMLLoader(url);
		Parent root = loader.load();
		
		Controller ctrl = loader.getController();
		ctrl.setRoot(root);
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("영화 선택");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
