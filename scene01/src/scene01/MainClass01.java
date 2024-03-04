package scene01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(getClass().getResource("testfx.fxml"));					// 파일 경로 출력
		FXMLLoader loader = new FXMLLoader(getClass().getResource("testfx.fxml"));	// 파일 불러오기
		
		Parent root = loader.load();			// 펜들의 부모
		// AnchorPane root = loader.load();		작성한 펜으로 써도 실행
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
