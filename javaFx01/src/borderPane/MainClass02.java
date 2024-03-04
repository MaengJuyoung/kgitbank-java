package borderPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClass02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		Button[] btns = new Button[3];
		for (int i=0; i<btns.length; i++) {
			btns[i] = new Button("btn_"+i);
		}
		hbox.getChildren().addAll(btns);
		hbox.setStyle("-fx-background-color:pink;");
		hbox.setPrefSize(10, 50);		// 가로, 세로(기본 border 맞춰진다.)
		BorderPane bp = new BorderPane();
		bp.setTop(hbox);
		
		VBox vbox = new VBox();
		vbox.getChildren().addAll(new Label("라벨 추가"));
		vbox.getChildren().add(new Button("버튼 추가"));
		vbox.setStyle("-fx-background-color:yellow;");
		bp.setLeft(vbox);
		
		arg0.setResizable(false);		// 창 사이즈 조절 불가
		
		//arg0.setScene(new Scene(hbox, 200, 100));
		arg0.setScene(new Scene(bp, 200, 100));
		// arg0.setScene(new Scene(vbox, 200, 100));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
