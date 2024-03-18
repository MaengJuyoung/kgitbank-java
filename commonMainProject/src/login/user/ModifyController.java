package login.user;

import java.net.URL;
import java.util.ResourceBundle;

import common.CommonService;
import commonMainProject.MainDTO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import myInfo.infoMain2;

public class ModifyController implements Initializable {
	@FXML public TextField modiName, modiEmail;
	@FXML public PasswordField modiPwd;
	MainDTO dto;
	Parent root;
	ModifyService ms;
	String id;
	public void SetRoot(Parent root, String id, MainDTO dto) {
		ms.setRoot(root);
		this.root = root;
		this.id = id;
		this.dto = dto;
	}
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new ModifyImpl();
	}
	public void btnModi() {
		ms.modiId(modiPwd.getText(),modiName.getText(),modiEmail.getText(), id, dto);
		
		int a = ms.modi();
		
		if( a== 1) {
			CommonService.myAlert("수정 되었습니다");
		}else {
			CommonService.myAlert("정보가 일치하지 않습니다.");
		}
	}
	public void backButton() {
		infoMain2 mc = new infoMain2();
		System.out.println(dto.getId());
		mc.viewFx(root, dto);
	}
	
}
