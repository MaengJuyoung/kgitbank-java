package javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class quiz01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane flowPane = new FlowPane();
		flowPane.setVgap(10);	// (위, 아래) 공간을 띄워주는 기능
		flowPane.setHgap(20);	// (오른쪽, 왼쪽) 간격을 띄워주는 기능
		for (int i=1; i<=10; i++) {
			Button btn = new Button("버튼"+i);
			flowPane.getChildren().add(btn);
		}
		/*
		Button btn01 = new Button("버튼01");
		Button btn02 = new Button("버튼02");
		Button btn03 = new Button("버튼03");
		Button btn04 = new Button("버튼04");
		Button btn05 = new Button("버튼05");
		Button btn06 = new Button("버튼06");
		Button btn07 = new Button("버튼07");
		Button btn08 = new Button("버튼08");
		Button btn09 = new Button("버튼09");
		Button btn10 = new Button("버튼10");
		flowPane.getChildren().add(btn01);
		flowPane.getChildren().add(btn02);
		flowPane.getChildren().add(btn03);
		flowPane.getChildren().add(btn04);
		flowPane.getChildren().add(btn05);
		flowPane.getChildren().add(btn06);
		flowPane.getChildren().add(btn07);
		flowPane.getChildren().add(btn08);
		flowPane.getChildren().add(btn09);
		flowPane.getChildren().add(btn10);
		*/
		
		Scene sc = new Scene(flowPane, 250, 80);
		arg0.setTitle("FlowPaneEx");
		arg0.setScene(sc);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
