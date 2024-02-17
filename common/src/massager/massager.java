package massager;

import java.util.Scanner;

class get_set {	// 3. 안마기
	private String power;
	private int time=5, force=1;

	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
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
		power();
		time();
		force();
		while (true) {	
			set();
		}
	}
	public void power() {
		while (true) {
			System.out.print("on, off 입력 >> ");
			gs.setPower(sc.next());
			if (gs.getPower().equals("on")) {
				System.out.println("안마기 "+gs.getPower()+"\n");
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
		System.out.println("작동 시간을 설정합니다. 버튼을 누를때마다 5분씩 증가합니다.");
		System.out.println("(기본 설정 : 5분, 가능한 시간 : 10분, 15분)");
		System.out.print("버튼을 누를 횟수 입력 >> ");
		int time = sc.nextInt();
		gs.setTime(time);
		// getter를 통해 안마시간과 안마강도를 출력합니다.
		System.out.println("설정된 안마 작동 시간은 "+gs.getTime()+"분 입니다.\n");
	}
	public void force() {
		// setter를 통해 안마시간(time)과 안마강도(force)를 결정합니다. 
		System.out.println("안마 세기를 설정합니다. 버튼을 누를때마다 증가합니다.");
		System.out.println("(기본 설정 : 1, 가능한 세기 : ~5)");
		System.out.print("버튼을 누를 횟수 입력 >> ");
		int force = sc.nextInt();
		gs.setForce(force);
		// getter를 통해 안마시간과 안마강도를 출력합니다.
		System.out.println("설정된 안마 강도는 "+gs.getForce()+"입니다.\n");
	}

	// 설정된 값 변경 시 이용하는 메서드 추가 생성
	public void set() {
		while (true) {
			System.out.println(gs.getTime()+"분 후에 안마기가 자동 종료됩니다.");
			System.out.print("에어컨 설정을 변경하려면 set, 유지하려면 stay, 강제종료하려면 off 입력 >>  ");
			String str = sc.next();
			if (str.equals("set")) {
				time();
				force();
				break;
			}else if (str.equals("stay")) {
				System.out.println(gs.getTime()-1+"분 후에 안마기가 자동 종료됩니다. 감사합니다.");
				System.exit(0);
			}else if (str.equals("off")) {
				System.out.println("안마기가 즉시 종료됩니다.");
				System.exit(0);
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요!!\n");
			}
		}
	}
}
