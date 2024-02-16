package massager;

public class massager02 {	// 3. 안마기
	private String power;
	private int time=15, force=1;
	
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = "안마기를 "+power+"합니다.";
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		if (time%3==0) this.time=5;
		else if (time%3==1) this.time = 10;
		else this.time=15;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		if (force%5==0) this.force=1;
		else if (force%5==1) this.force=2;
		else if (force%5==2) this.force=3;
		else if (force%5==3) this.force=4;
		else this.force = 5;
	}
	
	
	// 전원
	public void off() {
		power = "안마기를 종료합니다.";
	}

}
