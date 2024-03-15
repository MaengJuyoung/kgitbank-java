package myCGV;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import reserve.dto.ReserveDTO;


public class cgvMain {
	public void viewFx(Parent root, ReserveDTO rdto) {
		System.out.println("바보");
		System.out.println("영화 이름 : " + rdto.getMovie());
		System.out.println(root);
		Stage stage = (Stage)root.getScene().getWindow();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("cgvFX.fxml"));
			root = loader.load();
			cgvController ctrl = loader.getController();
			System.out.println("영화 이름 : " + rdto.getMovie());
			ctrl.setRoot(root, rdto);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("MY CGV");
		stage.show();
	}
}
