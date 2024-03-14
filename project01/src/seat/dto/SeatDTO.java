package seat.dto;

import java.util.ArrayList;

public class SeatDTO {
	// resultSeat : 총 남은 좌석 수
	// seatAble : 선택 가능한 좌석 수(인원 수 - 선택좌석 수)
	// count : 선택한 좌석 수 
	// snum : 인원 수
	private int resultSeat, seatAble, count, snum, sumPrice;
	public int getSumPrice() {
		return sumPrice;
	}

	public void setSumPrice(int sumPrice) {
		this.sumPrice = sumPrice;
	}

	private String str;
	private ArrayList<String> arr;
	


	public ArrayList<String> getArr() {
		return arr;
	}

	public void setArr(ArrayList<String> arr) {
		this.arr = arr;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getresultSeat() {
		return resultSeat;
	}

	public void setresultSeat(int resultSeat) {
		this.resultSeat = resultSeat;
	}

	public int getSeatAble() {
		return seatAble;
	}

	public void setSeatAble(int seatAble) {
		this.seatAble = seatAble;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getResultSeat() {
		return resultSeat;
	}

	public void setResultSeat(int resultSeat) {
		this.resultSeat = resultSeat;
	}

	public int getSnum() {
		return snum;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	
					


	
}
