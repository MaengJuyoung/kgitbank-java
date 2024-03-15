package login.user;

import java.net.URL;
import java.util.ResourceBundle;

import common.CommonService;
import commonMainProject.MainClass5;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import login.main.MainClass2;
import myInfo.infoMain2;

public class ModifyController implements Initializable {
	@FXML public TextField modiName, modiEmail;
	@FXML public PasswordField modiPwd;
	Parent root;
	ModifyService ms;
	String id;
	public void SetRoot(Parent root, String id) {
		ms.setRoot(root);
		this.root = root;
		this.id = id;
	}
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new ModifyImpl();
	}
	public void btnModi() {
		ms.modiId(modiPwd.getText(),modiName.getText(),modiEmail.getText(), id);
		
		int a = ms.modi();
		
		if( a== 1) {
			CommonService.myAlert("수정 되었습니다");
		}else {
			CommonService.myAlert("정보가 일치하지 않습니다.");
		}
	}
	public void backButton() {
		infoMain2 mc = new infoMain2();
		mc.viewFx(root);
	}
	
}