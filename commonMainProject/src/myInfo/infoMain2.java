package myInfo;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class infoMain2 {
	public void viewFx(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("infoFX.fxml"));
			root = loader.load();
			infoController ctrl = loader.getController();
			ctrl.setRoot(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("내 정보");
		stage.show();
	}
}
