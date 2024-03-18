package login.user;

import java.net.URL;

import commonMainProject.MainDTO;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.url.URLService;

public class LoginModifyMain {
	
	public void loginmodifymain(Parent root, String id, MainDTO dto) {
		Stage mostage = (Stage)root.getScene().getWindow();
		try {
			URL url = new URL(URLService.fxPath+"modify/fxml/modifyFx.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			ModifyController ctrl = loader.getController();
			
			ctrl.SetRoot(root, id, dto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		mostage.setScene(scene);
		mostage.show();
	}
}
