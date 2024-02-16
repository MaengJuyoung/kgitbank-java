package massager;

public class massager01 {	// 3. 안마기
	private int time=15, force=1;
	private String power;

	public void setPower(String power) {
		this.power = power;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public String getPower() {
		return power;
	}
	
	// 전원
	public void powerOn() {
		power = "안마기를 작동합니다.";
	}
	public void powerOff() {
		power = "안마기를 강제 종료합니다.";
	}
	
	// 안마 시간 설정
	public void TimeUp() {
		time = time+5;
		if (time>=30) time=30;
	}
	public void TimeDown() {
		time = time-5;
		if (time<=5) time=5;
	}
	
	// 안마 강도 설정
	public void ForceUp() {
		force ++;
		if (force>=10) force =10;
	}
	public void ForceDown() {
		force --;
		if (force<=1) force =1;
	}

	
}
