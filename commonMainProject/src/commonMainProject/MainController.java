package commonMainProject;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import login.dto.LoginDTO;
import login.main.MainClass2;
import myCGV.cgvMain;
import myInfo.infoMain;
import noticeBoard.noticeBoardMain;
import reserve.dto.ReserveDTO;
import reserve.main.ReserveMain;

public class MainController implements Initializable{
	Parent root;
	ReserveDTO rdto;
	String id;
	String name;
	MainDTO dto;
	
	// rdto, 


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				Platform.runLater(()->{
					
				});
			}
		};
		dto = new MainDTO();
		
	}
	public void setRoot2(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public void setRoot(Parent root) {
		this.root = root;

	}
	public void setRdto(ReserveDTO rdto) {
		this.rdto = rdto;
	}
	public void reserveFunc() {
		ReserveMain rm = new ReserveMain();
		System.out.println(root);
		rm.viewFx(root);
	}
	public void boardFunc() {
		noticeBoardMain nbm = new noticeBoardMain();
		nbm.viewFx(root);
	}
	public void logoutFunc() {
		MainClass2 mc = new MainClass2();
		mc.viewFx(root);
	}
	public void cgvFunc() {
		cgvMain cm = new cgvMain();

		cm.viewFx(root, rdto); 
	}
	public void myImformation() {
		infoMain im = new infoMain();
		im.viewFx(root, id, name);
	}
}
