package gridPane;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		Button button = new Button("Button");
		gridPane.setRowIndex(button, 0);	// 세로 0번째 배치
		GridPane.setColumnIndex(button, 0);	// 가로 0번째 배치
		
		Label label = new Label("id 입력 : ");
		Label label01 = new Label("label01");
		GridPane.setConstraints(label, 0, 2);	// 가로, 세로 한 번에 지정
		GridPane.setConstraints(label01, 1, 1);	// 가로, 세로 한 번에 지정
		
		TextField tf = new TextField();
		GridPane.setConstraints(tf, 1, 2);
		
		gridPane.getChildren().addAll(button, label, label01, tf);
		
		arg0.setScene(new Scene(gridPane));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
