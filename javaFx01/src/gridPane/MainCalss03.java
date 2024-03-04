package gridPane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainCalss03 extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		GridPane gridPane = new GridPane();
		
		gridPane.add(new Button("button"), 0, 0);	// 가로 세로
		gridPane.add(new Button("B1, B0"), 1, 0);	// 가로 세로
		gridPane.add(new Label("L1, L2"), 0, 1);	// 가로 세로
		gridPane.add(new Label("Label"), 1, 1);		// 가로 세로
		
		FlowPane fp = new FlowPane();
		fp.getChildren().add(new Button("merge col(0), row(2)"));
		fp.setAlignment(Pos.CENTER);
		fp.setStyle("-fx-background-color:black;");
		gridPane.add(fp, 0, 2, 2, 1);	// 가로, 세로, 가로병합, 세로병합
		
		stage.setScene(new Scene(gridPane, 300, 300));
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
