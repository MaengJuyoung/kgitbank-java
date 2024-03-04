package borderPane;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

// 강사님 코드 참고!
class PaneClass{
	public FlowPane getFlowTop() {
		FlowPane flowTop = new FlowPane();
		flowTop.setPadding(new Insets(10,10,10,250));
		flowTop.setHgap(10);
		flowTop.setStyle("-fx-background-color:pink;");
		ArrayList<Label> lb = new ArrayList<>();
		lb.add(new Label("메뉴"));
		lb.add(new Label("홈"));
		lb.add(new Label("로그인"));
		flowTop.getChildren().addAll(lb);
		return flowTop;
	}
	public FlowPane getFlowLeft() {
		FlowPane flowLeft = new FlowPane(new Button("메뉴 나열"));
		flowLeft.setPrefWidth(100);
		flowLeft.setStyle("-fx-background-color:skyblue;");
		return flowLeft;
	}
	public FlowPane getFlowCenter() {
		FlowPane flowCenter = new FlowPane(new Button("내용 들어가는 곳"));
		flowCenter.setStyle("-fx-background-color:#BCE55C;");
		return flowCenter;
	}
	public FlowPane getFlowBottom() {
		FlowPane flowBottom = new FlowPane(new Button("바닥글 들어가는 곳"));
		flowBottom.setPrefWidth(400);
		flowBottom.setAlignment(Pos.CENTER);
		flowBottom.setStyle("-fx-background-color:#D2916C;");
		return flowBottom;
	}
	public ArrayList<Button> getButton(){
		ArrayList<Button> arrBtn = new ArrayList<Button>();
		Button bt01 = new Button("아이디 입력");
		bt01.setPrefSize(100, 25);
		Button bt02 = new Button("비밀번호 입력");
		bt02.setPrefSize(100, 25);
		Button bt03 = new Button("로그인");
		bt03.setPrefSize(60, 50);
		arrBtn.add(bt01);arrBtn.add(bt02);arrBtn.add(bt03);
		return arrBtn;
	}
	public GridPane getGrid() {
		GridPane grid = new GridPane();
		grid.setStyle("-fx-background-color:#FAF4C0;");
		grid.setPadding(new Insets(20));
		ArrayList<Button> arrBtn = getButton();
		grid.add(arrBtn.get(0),0,0);
		grid.add(arrBtn.get(1),0,1);
		grid.add(arrBtn.get(2), 1,0,1,2);//로그인
		return grid;
	}
}
public class quiz02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane = new BorderPane();
		PaneClass pc = new PaneClass();

		borderPane.setTop(pc.getFlowTop());
		borderPane.setCenter(pc.getFlowCenter());
		borderPane.setBottom(pc.getFlowBottom());
		borderPane.setLeft(pc.getFlowLeft());
		borderPane.setRight(pc.getGrid());

		primaryStage.setTitle("Quiz");
		primaryStage.setScene(new Scene(borderPane,400,200)); //배경 크기 설정
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

