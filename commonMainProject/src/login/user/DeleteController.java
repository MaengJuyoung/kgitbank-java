package login.user;

import java.net.URL;
import java.util.ResourceBundle;

import common.CommonService;
import commonMainProject.MainDTO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import login.main.MainClass2;
import myInfo.infoMain2;

public class DeleteController implements Initializable{
	@FXML public TextField delId,delPwd,delEmail;
	Parent root;
	ModifyService ms;
	String path;
	MainDTO dto;
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void setRoot2(Parent root, MainDTO dto) {
		this.root = root;
		this.dto = dto;
		System.out.println(dto.getId());
	}
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new ModifyImpl();
	}
	public void btnDel() {
		
		ms.delId(delId.getText(), delPwd.getText(), delEmail.getText());
		
		int result = ms.del();
		
		if(result ==0) {
			ms.btnDel(result);
			MainClass2 mc = new MainClass2();
			mc.viewFx(root);
		}else {
			CommonService.myAlert("입력정보가 맞지 않습니다.");
		}
	}

	public void backButton() {
		infoMain2 mc = new infoMain2();
		System.out.println(dto.getId());
		mc.viewFx(root, dto);
	}
	
}
