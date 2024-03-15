package reserve.controller;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import reserve.dto.ReserveDTO;
import seat.main.SeatMain;

public class Controller implements Initializable{
	// 초기세팅
	@FXML public ListView<String> movielist;
	@FXML public ImageView moviePoster;
	@FXML public ListView<String> theaterlist;
	@FXML public DatePicker cal;
	@FXML public Label movieTheater1;	// 극장 선택 시 시간선택 위에 상영관 보여주기
	@FXML public ToggleGroup movieTime;
	
	//하단
	@FXML public Label movieName;
	@FXML public Label moviePlace;
	@FXML public Label movieDay;
	@FXML public RadioButton time1, time2, time3, time4, time5;
	@FXML public Label movieTheater2;
	@FXML public Button nextSeat;

	ReserveDTO rdto = new ReserveDTO();
	ObservableList<String> imageArr;

	Parent root;
	String path, today=null;
	LocalDate day=null;
	boolean setM, setT, setD = false, ck;

	public void setRoot(Parent root) {
		this.root = root;
	}

	//초기 세팅
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String[] mlist = {"듄 - 파트2", "파묘", "밥 말리 - 원 러브", "태양은 없다", "패스트 라이브즈", "메이 디셈버", "(라이브뷰잉) 앙상블 스타즈!! 드림하이브 8th 투어",
				"극장판 스카이 패밀리 코드 - 화이트", "가여운 것들", "로봇 드림"};
		movielist.getItems().addAll(mlist);

		String[] tlist = {"피카디리1958", "대학로", "명동", "동대문", "성신여대입구", "왕십리", "용산아이파크몰"};
		theaterlist.getItems().addAll(tlist);

		// 영화 선택하여 인덱스 불러오기 
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/info";
		File fileList = new File(path);
		imageArr = FXCollections.observableArrayList();

		for (String p : fileList.list()) {
			imageArr.add(p);
		}

		movielist.getSelectionModel().selectedIndexProperty().addListener((a,b,c)->{
			setImageView((int)c);	// 인덱스에 맞는 영화 포스터 출력
			rdto.setIndex((int)c);
		});

	}
	//목록에서 영화 선택 시 영화정보 출력
	public void selectMovie() {	
		timeReset();
		DateReset();
		theaterReset();
		int index = movielist.getSelectionModel().getSelectedIndex();

		switch(index) {
		case 0: movieName.setText("듄 - 파트2"); break;
		case 1: movieName.setText("파묘"); break;
		case 2: movieName.setText("밥 말리 - 원 러브"); break;
		case 3: movieName.setText("태양은 없다"); break;
		case 4: movieName.setText("패스트 라이브즈"); break;
		case 5: movieName.setText("메이 디셈버"); break;
		case 6: movieName.setText("(라이브뷰잉) 앙상\n블 스타즈!! 드림하\n이브 8th 투어"); break;
		case 7: movieName.setText("극장판 스카이 패\n밀리 코드 - 화이트"); break;
		case 8: movieName.setText("가여운 것들"); break;
		case 9: movieName.setText("로봇 드림"); break;
		}

		switch(index) {	// 시간 선택 시 상영관 정보 노출
		case 0: movieTheater1.setText("1관"); movieTheater2.setText("1관"); rdto.setTheater("1관"); break;
		case 1: movieTheater1.setText("2관"); movieTheater2.setText("2관"); rdto.setTheater("2관"); break;
		case 2: movieTheater1.setText("3관"); movieTheater2.setText("3관"); rdto.setTheater("3관"); break;
		case 3: movieTheater1.setText("4관"); movieTheater2.setText("4관"); rdto.setTheater("4관"); break;
		case 4: movieTheater1.setText("5관"); movieTheater2.setText("5관"); rdto.setTheater("5관"); break;
		case 5: movieTheater1.setText("6관"); movieTheater2.setText("6관"); rdto.setTheater("6관"); break;
		case 6: movieTheater1.setText("7관"); movieTheater2.setText("7관"); rdto.setTheater("7관"); break;
		case 7: movieTheater1.setText("8관"); movieTheater2.setText("8관"); rdto.setTheater("8관"); break;
		case 8: movieTheater1.setText("9관"); movieTheater2.setText("9관"); rdto.setTheater("9관"); break;
		case 9: movieTheater1.setText("10관"); movieTheater2.setText("10관"); rdto.setTheater("10관"); break;
		}
		setM = true;
		rdto.setMovie(movieName.getText());
	}
	// 포스터 보여주기
	private void setImageView(int index) {	
		File file = new File(path+"/"+imageArr.get(index));

		Image img = new Image("file:/"+path+"/"+imageArr.get(index));
		moviePoster.setImage(img);
	}
	// 극장 선택 시 
	public void selectTheater() {	
		if (setM) {
			timeReset();
			DateReset();
			int index = theaterlist.getSelectionModel().getSelectedIndex();

			switch(index) {
			case 0: moviePlace.setText("피카디리1958"); break;
			case 1: moviePlace.setText("대학로"); break;
			case 2: moviePlace.setText("명동"); break;
			case 3: moviePlace.setText("동대문"); break;
			case 4: moviePlace.setText("성신여대입구"); break;
			case 5: moviePlace.setText("왕십리"); break;
			case 6: moviePlace.setText("용산아이파크몰"); break;
			}
			setT = true;
			rdto.setPlace(moviePlace.getText());
		}else {
			movieDay.setText("영화 먼저 선택!!");
			movieFirst();
		}

	}
	// 달력 실행 시(날짜 선택 시)
	public void selCal() {		
		if (setM==true && setT==true) {
			timeReset();
			LocalDate day = cal.getValue();
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			today = day.format(dateTimeFormatter);
			movieDay.setText(today);
			setD = true;
			rdto.setDate(today);
		}else {
			if (setM==false) {
				movieFirst();
				DateReset();
			}else {
				theaterFirst();
				DateReset();
			}
		}
	}

	// 시간 선택
	public void selT1() {	
		ck = check();
		if (ck) {
			movieDay.setText(today+"  "+time1.getText()); rdto.setTime(time1.getText());
		}else check();
	}
	public void selT2() {
		ck = check();
		if (ck) {
			movieDay.setText(today+"  "+time2.getText()); rdto.setTime(time2.getText());
		}else check();
	}
	public void selT3() {
		ck = check();
		if (ck) {
			movieDay.setText(today+"  "+time3.getText()); rdto.setTime(time3.getText());
		}else check();
	}
	public void selT4() {
		ck = check();
		if (ck) {
			movieDay.setText(today+"  "+time4.getText()); rdto.setTime(time4.getText());
		}else check();
	}
	public void selT5() {
		ck = check();
		if (ck) {
			movieDay.setText(today+"  "+time5.getText()); rdto.setTime(time5.getText());
		}else check();
	}
	// 좌석 선택 버튼 누를 시
	public void nextSeat() {	
		if (rdto.getMovie()!=null && rdto.getPlace()!=null &&
				rdto.getDate()!=null && rdto.getTime()!=null) {
			SeatMain seatMain = new SeatMain();
			seatMain.viewFx(rdto, root);
		}else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("모든 항목을 선택하세요!!!");
			alert.show();
		}
	}
	// 극장 초기화 기능
	public void theaterReset() {
		rdto.setTheater(null);
		moviePlace.setText("");
		theaterlist.getSelectionModel().clearSelection();
		setT=false;
	}
	// 날짜 초기화 기능
	public void DateReset() {
		rdto.setDate(null);
		movieDay.setText("");
		cal.setValue(null);
		rdto.setDate(null);
		setD=false;
	}
	// 시간 초기화 기능
	public void timeReset() {		
		rdto.setTime(null);
		movieDay.setText("");
		time1.setSelected(false);	
		time2.setSelected(false);
		time3.setSelected(false);
		time4.setSelected(false);
		time5.setSelected(false);
	}
	// 영화 먼저 선택
	public void movieFirst() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText("영화를 먼저 선택하세요!!!");
		alert.show();
		theaterReset();
	}
	// 극장 먼저 선택
	public void theaterFirst() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText("극장을 선택하세요!!!");
		alert.show();
	}
	// 날짜 먼저 선택
	public void dateFirst() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText("날짜를 선택하세요!!!");
		alert.show();
	}
	// 순서 확인
	public boolean check() {
		if (setM == false) {
			movieFirst();
			timeReset();
			return false;
		}else if (setT == false){
			theaterFirst();
			timeReset();
			return false;
		}else if (setD == false) {
			dateFirst();
			timeReset();
			movieDay.setText("날짜 먼저 선택!!");
			return false;
		}
		return true;
	}
}
