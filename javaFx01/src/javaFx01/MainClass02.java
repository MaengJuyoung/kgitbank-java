package javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainClass02 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		// Stage : 기본 공간
		// Scene : stage위에 올라가는 장판같은 개념. 이 공간에 label, button, input 등 기능 올라감
		FlowPane flowPane = new FlowPane();		// Pane 안의 객체를 가로로 정렬
		Label lb = new Label("라벨입니다.");
		Button btn01 = new Button("버튼01");
		Button btn02 = new Button();
		btn02.setText("버튼02");
		
		flowPane.getChildren().add(lb);		// javafx에서 사용하는 list
		flowPane.getChildren().add(btn01);
		flowPane.getChildren().add(btn02);
		
		Scene sc = new Scene(flowPane);	
		arg0.setScene(sc);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
		
	}

}
