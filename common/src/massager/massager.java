package massager;

import java.util.Scanner;

class get_set {	// 3. 안마기
	private String power;
	private int time=15, force=1;

	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = "원하는 번호를 선택해주세요 >> ";
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
}

public class massager {
	get_set gs = new get_set();
	Scanner sc = new Scanner(System.in);

	public void display() {
		while (true) {			
			power();
			time();
			force();
		}
	}
	public void power() {
		while (true) {
			System.out.println("-------- 안마기 --------");
			System.out.println("on, off 입력 >> ");
			gs.setPower(sc.next());
			if (gs.getPower().equals("on")) {
				System.out.println("안마기 "+gs.getPower());
				break;
			}else if (gs.getPower().equals("off")) {
				System.out.println("안마기 "+gs.getPower());
				System.exit(0);
			}else {
				System.out.println("다시 입력해주세요!");
			}
		}

		System.out.println(gs.getPower());
	}
	public void time() {
		// setter를 통해 안마시간(time)과 안마강도(force)를 결정합니다.
		while(true) {
			
		}
		// 기본 5분 작동이며, 버튼을 한 번 누를때마다 5분씩 증가합니다.
		// (시간 : 5, 10, 15) 버튼을 누를 횟수를 입력
		gs.setTime(10);
		// getter를 통해 안마시간과 안마강도를 출력합니다.
		System.out.println("설정된 안마 작동 시간은 "+gs.getTime()+"분 입니다.");
	}
	public void force() {
		// setter를 통해 안마시간(time)과 안마강도(force)를 결정합니다. 

		// 기본 강도는 1이며, 버튼을 한 번 누를때마다 +1됩니다.
		// (강도 : 1~5) 버튼을 누를 횟수를 입력
		gs.setForce(10);
		// getter를 통해 안마시간과 안마강도를 출력합니다.
		System.out.println("설정된 안마 강도는 "+gs.getForce()+"입니다.");
	}

	String massager = sc.next();
	gs.setPower(massager);
	System.out.println(m.getPower());



	// 강제종료하는 메소드를 만들어 전원을 off 하세요 
	gs.off();
	System.out.println(m.getPower());
}
