package seat.controller;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import reserve.dto.ReserveDTO;

public class Controller extends Thread implements Initializable{
	// 상단
	@FXML public Label setPlace;
	@FXML public Label setTheater;
	@FXML public Label setSeatAble;
	@FXML public Label setDate;

	// 하단
	@FXML public ImageView moviePoster;
	@FXML public Label movieName;
	@FXML public Label moviePlace;
	@FXML public Label movieDay;
	@FXML public Label movieTheater2;
	@FXML public Label movieNum;
	@FXML public Label seatNum;

	// 인원 선택
	@FXML public Label c1_;
	@FXML public Label c2_;
	@FXML public Label c3_;
	@FXML public RadioButton c1_0;
	@FXML public RadioButton c1_1;
	@FXML public RadioButton c1_2;
	@FXML public RadioButton c1_3;
	@FXML public RadioButton c1_4;
	@FXML public RadioButton c1_5;
	@FXML public RadioButton c2_0;
	@FXML public RadioButton c2_1;
	@FXML public RadioButton c2_2;
	@FXML public RadioButton c2_3;
	@FXML public RadioButton c2_4;
	@FXML public RadioButton c2_5;
	@FXML public RadioButton c3_0;
	@FXML public RadioButton c3_1;
	@FXML public RadioButton c3_2;
	@FXML public RadioButton c3_3;
	@FXML public RadioButton c3_4;
	@FXML public RadioButton c3_5;

	int num=0, c1_num=0, c2_num=0, c3_num=0;
	String result, index;

	Parent root;
	ReserveDTO dto;
	String movie, place, path;

	public void run() {
		for( ;dto == null; );
		// 상단
		setPlace.setText(dto.getPlace());
		setTheater.setText(dto.getTheater());
		setSeatAble.setText(result);
		setDate.setText(dto.getDate()+"   "+dto.getTime());

		// 영화 포스터 경로 설정
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/info";
		switch (dto.getIndex()) {
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
		movieName.setText(dto.getMovie());
		moviePlace.setText(dto.getPlace());
		movieDay.setText(dto.getDate()+"  "+dto.getTime());
		movieTheater2.setText(dto.getTheater());
		movieNum.setText(null);
	}
	public void checkNum() {	// 인원 수 체크

		c1Ck();
		c2Ck();
		c3Ck();
	}
	public void setNum() {		// 인원 라벨 출력
		movieNum.setText(c1_.getText()+"  "+c1Ck()+"명");
	}
	public int c1Ck() {
		if (c1_0.isSelected()) c1_num=0;
		else if (c1_1.isSelected()) c1_num=1;
		else if (c1_2.isSelected()) c1_num=2;
		else if (c1_3.isSelected()) c1_num=3;
		else if (c1_4.isSelected()) c1_num=4;
		else if (c1_5.isSelected()) c1_num=5;
		return c1_num;
	}
	public int c2Ck() {
		if (c2_1.isSelected()) c2_num=1;
		else if (c2_2.isSelected()) c2_num=2;
		else if (c2_3.isSelected()) c2_num=3;
		else if (c2_4.isSelected()) c2_num=4;
		else if (c2_5.isSelected()) c2_num=5;
		return c2_num;
	}
	public int c3Ck() {
		if (c1_3.isSelected()) c3_num=1;
		else if (c3_2.isSelected()) c3_num=2;
		else if (c3_3.isSelected()) c3_num=3;
		else if (c3_4.isSelected()) c3_num=4;
		else if (c3_5.isSelected()) c3_num=5;
		return c3_num;
	}
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void setDto(ReserveDTO rdto) {
		this.dto = rdto;

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		start();
	}

	public void selC1_0() {

	}
	public void selC1_1() {

	}
	public void selC1_2() {

	}
	public void selC1_3() {

	}
	public void selC1_4() {

	}
	public void selC1_5() {

	}
	public void selC2_0() {

	}
	public void selC2_1() {

	}
	public void selC2_2() {

	}
	public void selC2_3() {

	}
	public void selC2_4() {

	}
	public void selC2_5() {

	}
	public void selC3_0() {

	}
	public void selC3_1() {

	}
	public void selC3_2() {

	}
	public void selC3_3() {

	}
	public void selC3_4() {

	}
	public void selC3_5() {

	}

}
