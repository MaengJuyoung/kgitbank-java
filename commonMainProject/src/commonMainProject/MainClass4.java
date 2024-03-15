package commonMainProject;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass4 {
	public void viewFx(Parent root, String id, String name) {
		Stage stage = (Stage)root.getScene().getWindow(); 
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("mainFX.fxml"));
			root = loader.load();
			
			MainController ctrl = loader.getController();
			ctrl.setRoot(root);
			ctrl.setRoot2(id, name);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.setTitle("메인");
		stage.show();
	}
}
