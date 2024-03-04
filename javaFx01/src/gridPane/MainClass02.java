package gridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClass02 extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		Button button = new Button("Button");
		
		Label label = new Label("Label");
		
		GridPane.setConstraints(button, 0, 0);
		GridPane.setConstraints(label, 1, 1);
		
		gridPane.getChildren().addAll(button, label);
		gridPane.add(new Button("B1, B0"), 1, 0);
		gridPane.add(new Label("L0, L1"), 0, 1);
		
		gridPane.setPadding(new Insets(20));	// 위, 우, 아래, 좌 모두 20씩 여백
		gridPane.setHgap(50);					// 세로 선 50만큼 띄우기
		gridPane.setVgap(50);					// 가로 선 50만큼 띄우기
		
		primaryStage.setScene(new Scene(gridPane, 300, 300));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
