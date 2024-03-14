package seat.controller;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import pay.main.PayMain;
import reserve.dto.ReserveDTO;
import reserve.main.ReserveMain2;
import seat.dto.SeatDTO;

public class Controller implements Initializable{
	// 상단
	@FXML public Label setPlace;	@FXML public Label setTheater;
	@FXML public Label setSeatAble;	@FXML public Label setDate;

	// 하단
	@FXML public ImageView moviePoster;	@FXML public Label movieName;
	@FXML public Label moviePlace;		@FXML public Label movieDay;
	@FXML public Label movieTheater2;	@FXML public Label movieNum;
	@FXML public Label seatNum;			@FXML public Label moviePrice;
	@FXML public Label selPerson;		@FXML public Label sumPrice;

	// 인원 선택
	@FXML public Label c1_;	@FXML public Label c2_;	@FXML public Label c3_;
	@FXML public RadioButton c1_0;	@FXML public RadioButton c1_1;	@FXML public RadioButton c1_2;
	@FXML public RadioButton c1_3;	@FXML public RadioButton c1_4;	@FXML public RadioButton c1_5;
	@FXML public RadioButton c2_0;	@FXML public RadioButton c2_1;	@FXML public RadioButton c2_2;
	@FXML public RadioButton c2_3;	@FXML public RadioButton c2_4;	@FXML public RadioButton c2_5;
	@FXML public RadioButton c3_0;	@FXML public RadioButton c3_1;	@FXML public RadioButton c3_2;
	@FXML public RadioButton c3_3;	@FXML public RadioButton c3_4;	@FXML public RadioButton c3_5;

	// 좌석 선택
	@FXML public CheckBox selA1; 	@FXML public CheckBox selA2; 	@FXML public CheckBox selA3; 
	@FXML public CheckBox selA4; 	@FXML public CheckBox selA5; 	@FXML public CheckBox selA6; 
	@FXML public CheckBox selA7; 	@FXML public CheckBox selA8; 	@FXML public CheckBox selA9; 
	@FXML public CheckBox selA10; 	@FXML public CheckBox selA11; 	@FXML public CheckBox selA12; 
	@FXML public CheckBox selB1; 	@FXML public CheckBox selB2; 	@FXML public CheckBox selB3; 
	@FXML public CheckBox selB4; 	@FXML public CheckBox selB5; 	@FXML public CheckBox selB6; 
	@FXML public CheckBox selB7; 	@FXML public CheckBox selB8; 	@FXML public CheckBox selB9; 
	@FXML public CheckBox selB10; 	@FXML public CheckBox selB11; 	@FXML public CheckBox selB12; 
	@FXML public CheckBox selC1; 	@FXML public CheckBox selC2; 	@FXML public CheckBox selC3; 
	@FXML public CheckBox selC4; 	@FXML public CheckBox selC5; 	@FXML public CheckBox selC6; 
	@FXML public CheckBox selC9; 	@FXML public CheckBox selC10; 	@FXML public CheckBox selC11; 	
	@FXML public CheckBox selC12; 									@FXML public CheckBox selD3; 	@FXML public CheckBox selD4; 	@FXML public CheckBox selD9; 
	@FXML public CheckBox selD10; 	@FXML public CheckBox selE1; 	@FXML public CheckBox selE2; 	@FXML public CheckBox selE5; 
	@FXML public CheckBox selE6; 	@FXML public CheckBox selE7; 	@FXML public CheckBox selE8; 
	@FXML public CheckBox selE9; 	@FXML public CheckBox selE10; 	@FXML public CheckBox selE11; 
	@FXML public CheckBox selE12; 
	@FXML public CheckBox selF1; 	@FXML public CheckBox selF2; 	@FXML public CheckBox selF3; 
	@FXML public CheckBox selF4; 	@FXML public CheckBox selF5; 	@FXML public CheckBox selF6; 
	@FXML public CheckBox selF9; 	@FXML public CheckBox selF10; 
	@FXML public CheckBox selG5; 	@FXML public CheckBox selG6; 	@FXML public CheckBox selG7; 
	@FXML public CheckBox selG8; 	@FXML public CheckBox selG11; 	@FXML public CheckBox selG12; 
	@FXML public CheckBox selH3; 	@FXML public CheckBox selH4; 	@FXML public CheckBox selH7; 
	@FXML public CheckBox selH8; 	@FXML public CheckBox selH9; 	@FXML public CheckBox selH10; 
	@FXML public CheckBox selH11; 	@FXML public CheckBox selH12; 
	@FXML public CheckBox selI1; 	@FXML public CheckBox selI2; 	
	@FXML public CheckBox selI11; 	@FXML public CheckBox selI12; 


	int num=0, c1_num=0, c2_num=0, c3_num=0, 
			c1_price=0, c2_price=0, c3_price=0,
			seatAble=74, count=0, ableNum, res;
	String result, index, aa = "", seat;

	Parent root;
	SeatDTO sdto = new SeatDTO(); 
	ReserveDTO rdto;
	String movie, place, path, newStr="";
	boolean setN = false;
	HashSet<String> str = new HashSet<>();
	ArrayList<String> arr = new ArrayList<>();
	ArrayList<String> darr = new ArrayList<>();
	HBox h;

	public void setRoot(Parent root) {
		this.root = root;
	}
	public void setDto(ReserveDTO rdto, Parent root) {
		this.rdto = rdto;
		this.root = root;
	}

	// 영화, 극장, 날짜, 시간 정보 초기화 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Thread thread = new Thread() {
			@Override
			public void run() {

				Platform.runLater(()->{
					for( ;rdto == null; );
					// 상단
					setPlace.setText(rdto.getPlace());
					setTheater.setText(rdto.getTheater());
					setSeatAble.setText(result);
					setDate.setText(rdto.getDate()+"   "+rdto.getTime());

					// 영화 포스터 경로 설정
					path = Paths.get("").toAbsolutePath().toString();
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

					// 선택 가능 좌석 수 초기화
					String seat = Integer.toString(seatAble);
					setSeatAble.setText(seat);
				});
			}
		};
		thread.start();;
	}

	// '일반' 인원 클릭
	public void selC1_0() {
		c1_num=0; resetSeatText();
	}
	public void selC1_1() {
		c1_num=1; resetSeatText();
	}
	public void selC1_2() {
		c1_num=2; resetSeatText();
	}
	public void selC1_3() {
		c1_num=3; resetSeatText();
	}
	public void selC1_4() {
		c1_num=4; resetSeatText();
	}
	public void selC1_5() {
		c1_num=5; resetSeatText();
	}

	// '청소년' 인원 클릭
	public void selC2_0() {
		c2_num=0; resetSeatText();
	}
	public void selC2_1() {
		c2_num=1; resetSeatText();
	}
	public void selC2_2() {
		c2_num=2; resetSeatText();
	}
	public void selC2_3() {
		c2_num=3; resetSeatText();
	}
	public void selC2_4() {
		c2_num=4; resetSeatText();
	}
	public void selC2_5() {
		c2_num=5; resetSeatText();
	}

	// '우대' 인원 클릭
	public void selC3_0() {
		c3_num=0; resetSeatText();
	}
	public void selC3_1() {
		c3_num=1; resetSeatText();
	}
	public void selC3_2() {
		c3_num=2; resetSeatText();
	}
	public void selC3_3() {
		c3_num=3; resetSeatText();
	}
	public void selC3_4() {
		c3_num=4; resetSeatText();
	}
	public void selC3_5() {
		c3_num=5; resetSeatText();
	}
	// 인원 변경 시 좌석 초기화
	public void resetSeatText() {
		sdto.setCount(0);
		seatNum.setText("");
		setN = false;
		checkNum();
	}
	// 인원 수 체크
	public void checkNum() {	
		num = c1_num + c2_num + c3_num;
		setNum();
		selA1.isDisable();
		sdto.setSnum(num);
		setPrice();
		setPerson();
		price();
		if (num!=0) {
			setN=true;
		}
	}
	// 사람 라벨 출력
	public void setNum() {		
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
	// 인원 라벨 출력
		public void setPerson() {		
			if (c1_num!=0) {
				if (c2_num!=0) {
					if  (c3_num!=0) {
						selPerson.setText(c1_.getText()+"\n"+c2_.getText()+"\n"+c3_.getText());
					}else {
						selPerson.setText(c1_.getText()+"\n"+c2_.getText());
					}
				}else {
					if  (c3_num!=0) {
						selPerson.setText(c1_.getText()+"\n"+c3_.getText());
					}else {
						selPerson.setText(c1_.getText());
					}
				}
			}else {
				if (c2_num!=0) {
					if  (c3_num!=0) {
						selPerson.setText(c2_.getText()+"\n"+c3_.getText());
					}else {
						selPerson.setText(c2_.getText());
					}
				}
			}
		}
	// 금액 설정
	public void price() {
		c1_price = c1_num*15000;
		c2_price = c2_num*12000;
		c3_price = c3_num*10000;
		setSumPrice();
	}
	// 금액 라벨 출력
	public void setPrice() {		
		if (c1_num!=0) {
			if (c2_num!=0) {
				if  (c3_num!=0) {
					moviePrice.setText("15,000 X "+c1_num+"\n"+"12,000 X "+c2_num+"\n"+"10,000 X "+c3_num);
				}else {
					moviePrice.setText("15,000 X "+c1_num+"\n"+"12,000 X "+c2_num);
				}
			}else {
				if  (c3_num!=0) {
					moviePrice.setText("15,000 X "+c1_num+"\n"+"10,000 X "+c3_num);
				}else {
					moviePrice.setText("15,000 X "+c1_num);
				}
			}
		}else {
			if (c2_num!=0) {
				if  (c3_num!=0) {
					moviePrice.setText("12,000X"+c2_num+"\n"+"10,000X"+c3_num);
				}else {
					moviePrice.setText("12,000X"+c2_num);
				}
			}
		}
	}
	// 합계 금액 라벨 출력
	public void setSumPrice() {
		int sum = c1_price + c2_price + c3_price;
		sdto.setSumPrice(sum);
		sumPrice.setText(Integer.toString(sum)+"원");
	}
	



	// 좌석 선택
	// resultSeat : 총 예매 가능한 좌석 수(남은 좌석 수)
	// seatAble : 선택 가능한 좌석 수(인원 수 - 선택좌석 수)
	// count : 선택한 좌석 수 
	// snum : 인원 수

	// 남은 좌석 수 체크
	public void checkSeat() {
		System.out.println(sdto.getSeatAble());
	}

	// 좌석 선택 시 
	public void ableP() {	
		count++;
		sdto.setCount(count);		
		sdto.setSeatAble(sdto.getSnum()-sdto.getCount());
		seatAble--;
		sdto.setresultSeat(seatAble);
		String res = Integer.toString(sdto.getresultSeat());
		setSeatAble.setText(res);
	}
	// 좌석 선택 해제 시 
	public void ableM() {	

		seatAble++;
		sdto.setresultSeat(seatAble);
		count--;
		sdto.setCount(count);
		sdto.setSeatAble(sdto.getSnum()-sdto.getCount());
		String res = Integer.toString(sdto.getresultSeat());
		setSeatAble.setText(res);
	}
	// 선택한 좌석 배열에 넣기 
	public void seatPrint() {
		Iterator<String> iter = str.iterator();   // Iterator 사용
		while (iter.hasNext()) {//값이 있으면 true 없으면 false
			newStr = iter.next();
			if (arr.contains(newStr)==false) {
				arr.add(newStr);
			}
		}
		System.out.println(arr);
		sdto.setArr(arr);
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
	// 선택 해제한 후 배열 수정
	public void seatDelete(String seat) {
		darr = sdto.getArr();
		if (darr!=null) {
			if (darr.contains(seat)) {
				darr.remove(seat);
			}
			System.out.println(darr);
			bbb(darr);
		}
	}
	// 선택 해제 배열 출력
	public void bbb(ArrayList<String> darr) {
		String cc="";
		//darr = sdto.getArr();
		for (int i=0; i<darr.size(); i++) {
			String dd = darr.get(i);
			cc += dd+" ";
			sdto.setStr(cc);
		}
		System.out.println(cc);
		seatNum.setText(cc);
	}
	// 인원 먼저 선택
	public void person() {
		seatNum.setText("인원 먼저 선택!!");
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText("선택한 좌석을 취소한 후 인원을 먼저 선택해주세요!");
		alert.show();
	}
	// 좌석 선정
	public void setSeat(String seat) {
		str.add(seat);
		ableP();
		seatPrint();
		checkSeat();
	}
	// 좌석 해제
	public void removeSeat(String seat) {
		seatNum.setText("");
		str.remove(seat);
		System.out.println(str);
		ableM();
		seatDelete(seat);
		checkSeat();
	}
	// A열
	public void a1() {
		seat = "A1";
		if(selA1.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a2() {
		seat = "A2";
		if(selA2.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a3() {
		seat = "A3";
		if(selA3.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a4() {
		seat = "A4";
		if(selA4.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a5() {
		seat = "A5";
		if(selA5.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a6() {
		seat = "A6";
		if(selA6.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a7() {
		seat = "A7";
		if(selA7.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {

				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a8() {
		seat = "A8";
		if(selA8.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a9() {
		seat = "A9";
		if(selA9.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a10() {
		seat = "A10";
		if(selA10.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a11() {
		seat = "A11";
		if(selA11.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void a12() {
		seat = "A12";
		if(selA12.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	// B열
	public void b1() {
		seat = "B1";
		if(selB1.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b2() {
		seat = "B2";
		if(selB2.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b3() {
		seat = "B3";
		if(selB3.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b4() {
		seat = "B4";
		if(selB4.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b5() {
		seat = "B5";
		if(selB5.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b6() {
		seat = "B6";
		if(selB6.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b7() {
		seat = "B7";
		if(selB7.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b8() {
		seat = "B8";
		if(selB8.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b9() {
		seat = "B9";
		if(selB9.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b10() {
		seat = "B10";
		if(selB10.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b11() {
		seat = "B11";
		if(selB11.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void b12() {
		seat = "B12";
		if(selB12.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	// C열
	public void c1() {
		seat = "C1";
		if(selC1.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void c2() {
		seat = "C2";
		if(selC2.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void c3() {
		seat = "C3";
		if(selC3.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void c4() {
		seat = "C4";
		if(selC4.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void c5() {
		seat = "C5";
		if(selC5.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void c6() {
		seat = "C6";
		if(selC6.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void c9() {
		seat = "C9";
		if(selC9.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void c10() {
		seat = "C10";
		if(selC10.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void c11() {
		seat = "C11";
		if(selC11.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void c12() {
		seat = "C12";
		if(selC12.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	// D열
	public void d3() {
		seat = "D3";
		if(selD3.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void d4() {
		seat = "D4";
		if(selD4.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void d9() {
		seat = "D9";
		if(selD9.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void d10() {
		seat = "D10";
		if(selD10.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	// E열
	public void e1() {
		seat = "E1";
		if(selE1.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void e2() {
		seat = "E2";
		if(selE2.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void e5() {
		seat = "E5";
		if(selE5.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void e6() {
		seat = "E6";
		if(selE6.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void e7() {
		seat = "E7";
		if(selE7.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void e8() {
		seat = "E8";
		if(selE8.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void e9() {
		seat = "E9";
		if(selE9.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void e10() {
		seat = "E10";
		if(selE10.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void e11() {
		seat = "E11";
		if(selE11.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void e12() {
		seat = "E12";
		if(selE12.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	// F열
	public void f1() {
		seat = "F1";
		if(selF1.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void f2() {
		seat = "F2";
		if(selF2.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void f3() {
		seat = "F3";
		if(selF3.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void f4() {
		seat = "F4";
		if(selF4.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void f5() {
		seat = "F5";
		if(selF5.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void f6() {
		seat = "F6";
		if(selF6.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void f9() {
		seat = "F9";
		if(selF9.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void f10() {
		seat = "F10";
		if(selF10.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	// G열
	public void g5() {
		seat = "G5";
		if(selG5.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void g6() {
		seat = "G6";
		if(selG6.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void g7() {
		seat = "G7";
		if(selG7.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void g8() {
		seat = "G8";
		if(selG8.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void g11() {
		seat = "G11";
		if(selG11.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void g12() {
		seat = "G12";
		if(selG12.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	// H열
	public void h3() {
		seat = "H3";
		if(selH3.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void h4() {
		seat = "H4";
		if(selH4.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void h7() {
		seat = "H7";
		if(selH7.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void h8() {
		seat = "H8";
		if(selH8.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void h9() {
		seat = "H9";
		if(selH9.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void h10() {
		seat = "H10";
		if(selH10.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void h11() {
		seat = "H11";
		if(selH11.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void h12() {
		seat = "H12";
		if(selH12.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	// I열
	public void i1() {
		seat = "I1";
		if(selI1.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void i2() {
		seat = "I2";
		if(selI2.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void i11() {
		seat = "I11";
		if(selI11.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	public void i12() {
		seat = "I12";
		if(selI12.isSelected()) {   // 한 번 눌렀을 때(체크 시)
			if (setN==false) {
				person();
			}else {
				if (sdto.getSnum()!=0) {
					setSeat(seat);
				}
			}
		}else {               // 두 번 눌렀을 때(체크 해제 시)
			removeSeat(seat);
		}
	}
	// 영화 다시 선택하기
	public void selectMovie() {		
		ReserveMain2 reserveMain = new ReserveMain2();
		reserveMain.viewFx2(root);
	}
	// 결제로 넘어가기
	public void selectPay() {
		if (sdto.getSnum()!=0) {
			if (sdto.getCount()!=0) {
				if (sdto.getSeatAble()==0) {
					PayMain payMain = new PayMain();
					payMain.viewFx2(rdto, sdto, root);

				}else if (sdto.getSeatAble()<0){
					Alert alert = new Alert(AlertType.ERROR);
					alert.setContentText("인원 수에 맞게 좌석을 선택하세요!!!");
					alert.show();
				}else {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setContentText("모든 항목을 선택하세요!!!");
					alert.show();
				}
			}else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setContentText("좌석을 선택하세요!!!");
				alert.show();
			}
		}else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("인원을 선택하세요!!!");
			alert.show();
		}
	}
}

