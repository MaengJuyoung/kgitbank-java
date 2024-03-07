package login.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import login.service.LoginService;
import login.service.LoginServiceImpl;

// onenote - 정리 및 기록 시 참고 ~~~~

public class Controller implements Initializable {	// Initializable : 초기화해주는 메소드 적용해줌
	@FXML public TextField fxId;
	@FXML public TextField fxPwd;
	Parent root;
	LoginService ls;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls = new LoginServiceImpl();	// 객체화 
		System.out.println("초기화 메소드");
	}
	public void loginFunc(){
		ls.loginFunc(fxId, fxPwd);
		
		System.out.println("확인 버튼 클릭");
		
	}
	public void cancelFunc() {
		System.out.println("취소 버튼 클릭");
		ls.cancelFunc(root);
	}
	public void registerFunc() {
		System.out.println("회원가입 버튼 클릭");
		//ls.registerFunc();
		ls.registerFunc(root);
		
	}
	
}
