package seat.controller;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import reserve.dto.ReserveDTO;
import seat.dto.SeatDTO;

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

	// 좌석 선택
	@FXML public CheckBox selA1; 
	@FXML public CheckBox selA2; 
	@FXML public CheckBox selA3; 
	@FXML public CheckBox selA4; 
	@FXML public CheckBox selA5; 
	@FXML public CheckBox selA6; 

	SeatDTO sdto = new SeatDTO(); 

	int num=0, c1_num=0, c2_num=0, c3_num=0, seatAble=74, count=0, ableNum, res;
	String result, index, aa = "";
	
	Parent root;
	ReserveDTO dto;
	String movie, place, path, newStr="";
	boolean setN = false;
	HashSet<String> str = new HashSet<>();
	ArrayList<String> arr = new ArrayList<>();
	HBox h;


	public void run() {		// 영화, 극장, 날짜, 시간 정보 초기화 
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

		// 선택 가능 좌석 수 초기화
		String seat = Integer.toString(seatAble);
		setSeatAble.setText(seat);
	}
	public void checkNum() {	// 인원 수 체크
		num = c1_num + c2_num + c3_num;
		//String setNum = Integer.toString(num);
		//movieNum.setText(setNum+"명");
		setNum();
		//seatNum.setText("");
		selA1.isDisable();
		sdto.setSnum(num);
	}
	public void setNum() {		// 인원 라벨 출력
		if (c1_num!=0) {
			if (c2_num!=0) {
				if  (c3_num!=0) {
					movieNum.setText(c1_.getText()+"  "+c1_num+"명 "+
							c2_.getText()+"  "+c2_num+"명\n"+
							c3_.getText()+"  "+c3_num+"명");
				}else {
					movieNum.setText(c1_.getText()+"  "+c1_num+"명 "+c2_.getText()+"  "+c2_num+"명");
				}
			}else {
				if  (c3_num!=0) {
					movieNum.setText(c1_.getText()+"  "+c1_num+"명 "+c3_.getText()+"  "+c3_num+"명");
				}else {
					movieNum.setText(c1_.getText()+"  "+c1_num+"명");
				}
			}
		}else {
			if (c2_num!=0) {
				if  (c3_num!=0) {
					movieNum.setText(c2_.getText()+"  "+c2_num+"명 "+c3_.getText()+"  "+c3_num+"명");
				}else {
					movieNum.setText(c2_.getText()+"  "+c2_num+"명");
				}
			}
		}
	}
	/*
	public int c1Ck() {			// '일반' 인원 선택
		if (c1_0.isSelected()) ;
		else if (c1_1.isSelected()) ;
		else if (c1_2.isSelected()) ;
		else if (c1_3.isSelected()) ;
		else if (c1_4.isSelected()) ;
		else if (c1_5.isSelected()) ;
		return c1_num;
	}
	public int c2Ck() {			// '청소년' 인원 선택
		if (c2_0.isSelected()) ;
		else if (c2_1.isSelected()) ;
		else if (c2_2.isSelected()) ;
		else if (c2_3.isSelected()) ;
		else if (c2_4.isSelected()) ;
		else if (c2_5.isSelected()) ;
		return c2_num;
	}
	public int c3Ck() {			// '우대' 인원 선택
		if (c3_0.isSelected()) ;
		else if (c3_1.isSelected()) ;
		else if (c3_2.isSelected()) ;
		else if (c3_3.isSelected()) ;
		else if (c3_4.isSelected()) ;
		else if (c3_5.isSelected()) ;
		return c3_num;
	}*/
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
	// '일반' 인원 클릭
	public void selC1_0() {
		c1_num=0; setN = true;
		checkNum();
	}
	public void selC1_1() {
		c1_num=1; setN = true;
		checkNum();
	}
	public void selC1_2() {
		c1_num=2; setN = true;
		checkNum();
	}
	public void selC1_3() {
		c1_num=3; setN = true;
		checkNum();
	}
	public void selC1_4() {
		c1_num=4; setN = true;
		checkNum();
	}
	public void selC1_5() {
		c1_num=5; setN = true;
		checkNum();
	}

	// '청소년' 인원 클릭
	public void selC2_0() {
		c2_num=0; setN = true;
		checkNum();
	}
	public void selC2_1() {
		c2_num=1; setN = true;
		checkNum();
	}
	public void selC2_2() {
		c2_num=2; setN = true;
		checkNum();
	}
	public void selC2_3() {
		c2_num=3; setN = true;
		checkNum();
	}
	public void selC2_4() {
		c2_num=4; setN = true;
		checkNum();
	}
	public void selC2_5() {
		c2_num=5; setN = true;
		checkNum();
	}

	// '우대' 인원 클릭
	public void selC3_0() {
		c3_num=0; setN = true;
		checkNum();
	}
	public void selC3_1() {
		c3_num=1; setN = true;
		checkNum();
	}
	public void selC3_2() {
		c3_num=2; setN = true;
		checkNum();
	}
	public void selC3_3() {
		c3_num=3; setN = true;
		checkNum();
	}
	public void selC3_4() {
		c3_num=4; setN = true;
		checkNum();
	}
	public void selC3_5() {
		c3_num=5; setN = true;
		checkNum();
	}

	// 좌석 선택
	// resultSeat : 총 예매 가능한 좌석 수
	// seatAble : 선택 가능한 좌석 수(인원 수 - 선택좌석 수)
	// count : 선택한 좌석 수 
	// snum : 인원 수

	// 남은 좌석 수 체크
	public void checkSeat() {
		if (sdto.getSnum()!=0) {

		}
	}
	// 선택 가능 좌석 +
	public void ableP() {	// 좌석 선택 시 
		count++;
		sdto.setCount(count);		
		sdto.setSeatAble(sdto.getSnum()-sdto.getCount());
		seatAble--;
		sdto.setresultSeat(seatAble);

		//		System.out.println("인원 수 : "+sdto.getSnum());
		//		System.out.println("선택 수 : "+sdto.getCount());
		//		System.out.println("선택해야할 좌석 수  : "+sdto.getSeatAble());
		//		System.out.println("남은 좌석 수 : "+sdto.getresultSeat());
		String res = Integer.toString(sdto.getresultSeat());
		setSeatAble.setText(res);
	}
	public void ableM() {	// 좌석 선택 해제 시 
		seatAble++;
		sdto.setresultSeat(seatAble);
		count--;
		sdto.setCount(count);
		sdto.setSeatAble(sdto.getSnum()-sdto.getCount());

		//		System.out.println("인원 수 : "+sdto.getSnum());
		//		System.out.println("선택 수 : "+sdto.getCount());
		//		System.out.println("선택해야할 좌석 수  : "+sdto.getSeatAble());
		//		System.out.println("남은 좌석 수 : "+sdto.getresultSeat());
		String res = Integer.toString(sdto.getresultSeat());
		setSeatAble.setText(res);
	}
	// 선택한 좌석 배열에 넣기 
	public void seatPrint() {
		Iterator<String> iter = str.iterator();	// Iterator 사용
		while (iter.hasNext()) {//값이 있으면 true 없으면 false
			newStr = iter.next();
			if (arr.contains(newStr)==false) {
				arr.add(newStr);
			}
		}
		System.out.println(arr);
		aaa(arr);
		
	}
	// 배열에 넣은 좌석 출력하기
	public void aaa(ArrayList<String> arr) {
		String bb="";
		for (int i=0; i<arr.size(); i++) {
			
			String aa = arr.get(i);
			bb += aa+" ";
			sdto.setStr(bb);
			
		}
		System.out.println(bb);
		seatNum.setText(bb);
	}
	public void seatDelete() {
		System.out.println("----");
		
		Iterator<String> iter = str.iterator();	// Iterator 사용
		while (iter.hasNext()) {//값이 있으면 true 없으면 false
			newStr = iter.next();
			if (arr.contains(newStr)==false) {
				arr.add(newStr);
			}
		}
		System.out.println(arr);
		aaa(arr);
		System.out.println("----");
	}
	/*
	public void addLabel() {	// 선택한 자리 라벨 추가
		h = new HBox();
		Label lb = new Label();
		lb.setFont(new Font(10));
		lb.setStyle("-fx-text-fill: yellow");
		lb.setText("A1");
	}*/
	// A열
	public void a1() {
		if(selA1.isSelected()) {	// 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				//seatNum.setText("인원 먼저 선택!!");
			}else {
				if (sdto.getSnum()!=0) {
					str.add("A1");
					//System.out.println(str);
					ableP();
					seatPrint();
				}
			}
		}else {					// 두 번 눌렀을 때(체크 해제 시)
			str.remove("A1");
			System.out.println(str);
			ableM();
			seatDelete();
		}
	}
	public void a2() {
		if(selA2.isSelected()) {	// 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				//seatNum.setText("인원 먼저 선택!!");
			}else {
				if (sdto.getSnum()!=0) {
					str.add("A2");
					System.out.println(str);
					ableP();
					seatPrint();
				}
			}
		}else {					// 두 번 눌렀을 때(체크 해제 시)
			str.remove("A2");
			ableM();
		}
	}
	public void a3() {
		if(selA3.isSelected()) {	// 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				//seatNum.setText("인원 먼저 선택!!");
			}else {
				if (sdto.getSnum()!=0) {
					str.add("A3");
					System.out.println(str);
					ableP();
					seatPrint();
				}
			}
		}else {					// 두 번 눌렀을 때(체크 해제 시)
			str.remove("A3");
			ableM();
		}
	}
	public void a4() {
	}
	public void a5() {
	}
	public void a6() {
	}
	public void a7() {
	}
	public void a8() {
	}
	public void a9() {
	}
	public void a10() {
	}
	public void a11() {
	}
	public void a12() {
	}
	// B열
	public void b1() {

	}
	public void b2() {

	}
	public void b3() {

	}
	public void b4() {

	}
	public void b5() {

	}
	public void b6() {

	}
	public void b7() {

	}
	public void b8() {

	}
	public void b9() {

	}
	public void b10() {

	}
	public void b11() {

	}
	public void b12() {

	}
	// C열
	public void c1() {

	}
	public void c2() {

	}
	public void c3() {

	}
	public void c4() {

	}
	public void c5() {

	}
	public void c6() {

	}
	public void c9() {

	}
	public void c10() {

	}
	public void c11() {

	}
	public void c12() {

	}
	// D열
	public void d3() {

	}
	public void d4() {

	}
	public void d9() {

	}
	public void d10() {

	}
	// E열
	public void e1() {

	}
	public void e2() {

	}
	public void e5() {

	}
	public void e6() {

	}
	public void e7() {

	}
	public void e8() {

	}
	public void e9() {

	}
	public void e10() {

	}
	public void e11() {

	}
	public void e12() {

	}
	// F열
	public void f1() {

	}
	public void f2() {

	}
	public void f3() {

	}
	public void f4() {

	}
	public void f5() {

	}
	public void f6() {

	}
	public void f9() {

	}
	public void f10() {

	}
	// G열
	public void g5() {

	}
	public void g6() {

	}
	public void g7() {

	}
	public void g8() {

	}
	public void g11() {

	}
	public void g12() {

	}
	// H열
	public void h3() {

	}
	public void h4() {

	}
	public void h7() {

	}
	public void h8() {

	}
	public void h9() {

	}
	public void h10() {

	}
	public void h11() {

	}
	public void h12() {

	}
	// I열
	public void i1() {

	}
	public void i2() {

	}
	public void i11() {

	}
	public void i12() {

	}
}
