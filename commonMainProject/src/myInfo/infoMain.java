package myInfo;

import java.io.IOException;

import commonMainProject.MainDTO;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class infoMain {
	public void viewFx(Parent root, MainDTO dto) {
		System.out.println(dto.getId());
		Stage stage = (Stage)root.getScene().getWindow();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("infoFX.fxml"));
			root = loader.load();
			infoController ctrl = loader.getController();
			ctrl.setRoot(root);
			ctrl.setInfo(dto);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("내 정보");
		stage.show();
	}
}

