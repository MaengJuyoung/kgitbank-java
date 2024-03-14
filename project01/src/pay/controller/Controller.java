package pay.controller;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import pay.dto.PayDTO;
import reserve.dto.ReserveDTO;
import seat.dto.SeatDTO;
import seat.main.SeatMain;

public class Controller implements Initializable{
	// 하단
	@FXML public ImageView moviePoster;	@FXML public Label movieName;
	@FXML public Label moviePlace;		@FXML public Label movieDay;
	@FXML public Label movieTheater2;	@FXML public Label movieNum;
	@FXML public Label seatNum;			

	// 오른쪽 상단
	@FXML public Label sumPrice;		@FXML public Label selectedCard;

	// 중간 내용
	@FXML public ChoiceBox<String> selectCard;


	PayDTO pdto = new PayDTO();
	SeatDTO sdto;
	ReserveDTO rdto;
	Parent root;

	String path, index;
	
	// 초기화해주기
	public void initialize(URL arg0, ResourceBundle arg1) {
		String[] selecCardtxt = {"BC카드", "현대카드","하나카드","삼성카드","신한카드","KB국민카드","카카오뱅크카드",
				"NH카드","스탠다드차타드은행카드","씨티카드","롯데/아멕스카드","K뱅크","우리카드","코나카드","신세계카드",
				"광주은행카드","산은캐피탈","수협카드","KDB산업은행카드","전북은행카드","우체국카드","기업은행카드","SSG카드"};
		selectCard.getItems().addAll(selecCardtxt);

		//start();
		Thread thread = new Thread() {
			@Override
			public void run() {

				Platform.runLater(()->{
					for( ;rdto == null; );

					// 영화 포스터 경로 설정
					path = Paths.get("").toAbsolutePath().toString();
					System.out.println(path);
					path += "/src/info";
					switch (rdto.getIndex()) {
					case 0: index = "01"; break;
					case 1: index = "02"; break;
					case 2: index = "03"; break;
					case 3: index = "04"; break;
					case 4: index = "05"; break;
					case 5: index = "06"; break;
					case 6: index = "07"; break;
					case 7: index = "08"; break;
					case 8: index = "09"; break;
					case 9: index = "10"; break;
					}
					String str = "file:/"+path+"/"+index+".jpg";
					moviePoster.setImage(new Image(str));

					// 하단
					movieName.setText(rdto.getMovie());
					moviePlace.setText(rdto.getPlace());
					movieDay.setText(rdto.getDate()+"  "+rdto.getTime());
					movieTheater2.setText(rdto.getTheater());
					movieNum.setText(Integer.toString(sdto.getSnum()));
					seatNum.setText(sdto.getStr());

					// 오른쪽 상단
					selectCard.getSelectionModel().selectedIndexProperty().addListener(
							(new ChangeListener<Number>() {
								// if items of the list are changed
								public void changed(ObservableValue ov, Number value, Number new_value) {
									// text for the label to the selected item
									selectedCard.setText(selecCardtxt[new_value.intValue()]);
								}
							}));
					sumPrice.setText(Integer.toString(sdto.getSumPrice()) + "원");
				});
			}
		};
		thread.start();;
	}
	
	public void setRoot(ReserveDTO rdto, SeatDTO sdto, Parent root) {
		this.rdto = rdto;
		this.sdto = sdto;
		this.root = root;
	}
	// 좌석선택으로 이동
	public void selectSeat() {
		SeatMain seatMain = new SeatMain();
		seatMain.viewFx(rdto, root);
	}
	// 결제하기 버튼
	public void SPay() {
		if (selectCard.getValue()!=null) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText(selectCard.getValue()+"(으)로 결제합니다.\n예매가 완료되었습니다. 감사합니다!");
			alert.show();
			cancel(root);
		}else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("결제할 카드를 선택하세요!!!");
			alert.show();
		}
	}
	// 예매 창 종료
	public static void cancel(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}
}
