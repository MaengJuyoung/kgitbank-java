package aaa_package;

import java.util.Scanner;

class test{
	private String  power;
	private int wind = 10, temp = 24;

	public int getWind() {
		return wind;
	}
	public void setWind(int wind) {
		this.wind = wind;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
}

public class airconditional {
	// 풍향 (강, 중, 약), 온도, 전원
	//private String windUp, windDown, tempUp, tempDown, power;
	//private int wind, temp;
	public void power(){
		test t = new test();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("에어컨 전원 (on = 켜기, off = 끄기) : ");
			String power = sc.next();
			if (power.equals("on")) {
				t.setPower("on");
				System.out.println("전원이 켜졌습니다.");
				break;
			}else if (power.equals("off")) {
				t.setPower("off");
				System.out.println("전원이 꺼졌습니다");
				System.exit(0);
			}else {
				System.out.println("다시 입력");
				continue;
			}
		}
	}public void wind() {
		test t = new test();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("\n풍력을 선택해주세요.\n현재 풍력은 " + t.getWind() + "입니다.\n1. 풍력 올리기\n2. 풍력 내리기\n3. 풍향 유지하기\n>>> ");
			int wind = sc.nextInt();
			int winda = t.getWind();
			if (wind == 1) {
				winda += 1;
				t.setWind(winda);
				System.out.println("현재 증가!!");
			}else if (wind == 2) {
				winda -= 1;
				t.setWind(winda);
				System.out.println("현재 감소!!" );
			}else {
				System.out.println("유지!!");
				break;
			}
		}
	}public void temp() {
		test t = new test();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("\n온도를 선택해주세요.\n현재 온도는 "+ t.getTemp() +"도 입니다.\n1. 온도 올리기\n2. 온도 내리기\n3. 온도 유지하고 나가기\n>>> ");
			int temp = sc.nextInt();
			int temperature = t.getTemp();
			if (temp == 1) {
				temperature += 1;
				t.setTemp(temperature);
				System.out.println("온도 증가!!");
			}else if (temp == 2) {
				temperature -= 1;
				t.setTemp(temperature);
				System.out.println("온도 감소!!");
			}else if (temp == 3) {
				System.out.println("유지!!");
				break;
			}
		}
	}
	public void display() {
		while (true) {
		power();
		wind();
		temp();
		}
	}
}
