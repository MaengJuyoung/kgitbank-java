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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable{
	@FXML public ListView<String> movielist;
	@FXML public ImageView moviePoster;
	@FXML public Label movieName;

	@FXML public ListView<String> theaterlist;
	@FXML public Label moviePlace;

	@FXML public DatePicker cal;
	@FXML public Label movieTheater1;
	@FXML public Label movieTheater2;
	@FXML public Label movieDay;
	@FXML public ToggleGroup movieTime;
	@FXML public RadioButton time1, time2, time3, time4, time5;
	


	ObservableList<String> imageArr;
	Parent root;
	String path, today=null;
	LocalDate day=null;
	
	public void setRoot(Parent root) {
		this.root = root;
	}

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
		});

	}

	public void selectMovie() {	// 목록에서 영화 선택 시 영화정보 출력

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
		case 0: movieTheater1.setText("1관"); movieTheater2.setText("1관"); break;
		case 1: movieTheater1.setText("2관"); movieTheater2.setText("2관"); break;
		case 2: movieTheater1.setText("3관"); movieTheater2.setText("3관"); break;
		case 3: movieTheater1.setText("4관"); movieTheater2.setText("4관"); break;
		case 4: movieTheater1.setText("5관"); movieTheater2.setText("5관"); break;
		case 5: movieTheater1.setText("6관"); movieTheater2.setText("6관"); break;
		case 6: movieTheater1.setText("7관"); movieTheater2.setText("7관"); break;
		case 7: movieTheater1.setText("8관"); movieTheater2.setText("8관"); break;
		case 8: movieTheater1.setText("9관"); movieTheater2.setText("9관"); break;
		case 9: movieTheater1.setText("10관"); movieTheater2.setText("10관"); break;
		}
	}
	private void setImageView(int index) {	// 포스터 보여주기
		File file = new File(path+"/"+imageArr.get(index));

		Image img = new Image("file:/"+path+"/"+imageArr.get(index));
		moviePoster.setImage(img);
	}
	public void selectTheater() {	// 극장 선택 시 
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
	}
	public void selCal() {		// 달력 실행 시(날짜 선택 시)
		time1.setSelected(false);
		time2.setSelected(false);
		time3.setSelected(false);
		time4.setSelected(false);
		time5.setSelected(false);
		
		LocalDate day = cal.getValue();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		today = day.format(dateTimeFormatter);
		movieDay.setText(today);
		
	}
	public void selDate() {
		if (day==null) {
			movieDay.setText("날짜 먼저 선택!");
			
		}else {
			movieDay.setText(today+"  "+time1.getText());
			
		}
		
	}
	public void selT1() {
		selDate();
		//movieDay.setText(today+"  "+time1.getText());
	}
	public void selT2() {
		movieDay.setText(today+"  "+time2.getText());
	}
	public void selT3() {
		movieDay.setText(today+"  "+time3.getText());
	}
	public void selT4() {
		movieDay.setText(today+"  "+time4.getText());
	}
	public void selT5() {
		movieDay.setText(today+"  "+time5.getText());
	}
}
