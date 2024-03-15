package seat.main;

import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import reserve.dto.ReserveDTO;
import seat.controller.Controller;

public class SeatMain {
	public void viewFx(ReserveDTO rdto, Parent root) {
		Stage memberStage = (Stage)root.getScene().getWindow();
		try {
			System.out.println(getClass().getResource(""));
			System.out.println(Paths.get("").toAbsolutePath().toString());	
			System.out.println(
					"file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/seat/fxml/Seat.fxml");
			URL url = new URL("file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/seat/fxml/Seat.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			Controller ctrl = loader.getController();
			ctrl.setDto(rdto, root);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		memberStage.setScene(scene);
		memberStage.setTitle("좌석 선택");
		memberStage.show();
	}
}
