package commonMainProject;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import reserve.dto.ReserveDTO;


public class MainClass {
	public void viewFx(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow(); 
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("mainFX.fxml"));
			root = loader.load();
			
			MainController ctrl = loader.getController();
			ctrl.setRoot(root);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.setTitle("메인");
		stage.show();
	}

//	@Override
//	public void start(Stage arg0) throws Exception {
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("mainFX.fxml"));
//		Parent root = loader.load();
//		
//		MainController ctrl = loader.getController();
//		ctrl.setRoot(root);
//		
//		Scene scene = new Scene(root);
//		arg0.setScene(scene);
//		arg0.setTitle("메인");
//		arg0.show();
//	}
//	public static void main(String[] args) {
//		launch(args);
//	}
}
