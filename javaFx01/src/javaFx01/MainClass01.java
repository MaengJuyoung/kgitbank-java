package javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{	// Fx 사용시 application 상속

	@Override
	public void start(Stage arg0) throws Exception {
		// 매개변수 Stage를 통해 그래픽을 만듦
		System.out.println("start 실행???");
		Label lb = new Label();
		lb.setFont(new Font(30));
		lb.setText("안녕하세요");
		
		Scene scene = new Scene(lb, 200, 300);		// ( ,가로, 세로) 크기 설정
		arg0.setScene(scene);
		
		arg0.setTitle("제목을 설정합니다.");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);	// application 에 의해 start 실행(호출)됨. 
		
	}
}
