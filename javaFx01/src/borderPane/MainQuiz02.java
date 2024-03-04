package borderPane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainQuiz02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(getClass().getResource("quiz02.fxml"));					// 파일 경로 출력
		FXMLLoader loader = new FXMLLoader(getClass().getResource("quiz02.fxml"));	// 파일 불러오기
		
		Parent root = loader.load();	
		
		Scene scene = new Scene(root);
		arg0.setTitle("Quiz02");
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
