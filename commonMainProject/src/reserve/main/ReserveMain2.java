package reserve.main;

import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import reserve.controller.Controller;


public class ReserveMain2{
	public void viewFx2(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow();

		try {
			URL url = new URL("file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/reserve/fxml/reservation.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();

			Controller ctrl = loader.getController();
			ctrl.setRoot(root);


		} catch (Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("영화 선택");
		stage.show();
	}
}
