package login.main;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.controller.Controller;
import login.url.URLService;

public class MainClass extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(getClass().getResource(""));
		System.out.println(Paths.get("").toAbsolutePath().toString());		
		// Paths : 현재 프로젝트의 위치를 얻어옴
		// toAbsolutePath : 절대 경로 , toString : 문자열로 가져오기 
		System.out.println(
				"file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/login/fxml/Login.fxml");
		URL url = new URL(URLService.fxPath + "login/fxml/Login.fxml");
		FXMLLoader loader = new FXMLLoader(url);	// url 객체 형태로 넣어줘야 오류 미발생
		Parent root = loader.load();				// loader가 되면 controller 생성됨
		
		Controller ctrl = loader.getController();	// new 연산자가 아닌 loader로 꺼내와야 함
		ctrl.setRoot(root);
		
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("Login");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
