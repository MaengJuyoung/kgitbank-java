package noticeBoard;

import java.io.IOException;

import commonMainProject.MainDTO;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class noticeBoardMain {
	public void viewFx(Parent root, MainDTO dto) {
		Stage stage = (Stage)root.getScene().getWindow();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("boardFX.fxml"));
			root = loader.load();
			Controller ctrl = loader.getController();
			ctrl.setRoot(root);
			ctrl.setRoot2(root, dto);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("게시판");
		stage.show();
	}
}
