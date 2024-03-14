package pay.main;

import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pay.controller.Controller;
import reserve.dto.ReserveDTO;
import seat.dto.SeatDTO;

public class PayMain {
	public void viewFx2(ReserveDTO rdto, SeatDTO sdto, Parent root) {
		Stage payStage = (Stage)root.getScene().getWindow();
		
		try {
			URL url = new URL("file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/pay/fxml/Pay.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			Controller ctrl = loader.getController();
			ctrl.setRoot(rdto, sdto, root);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		payStage.setScene(scene);
		payStage.setTitle("결제");
		payStage.show();
	}
}

