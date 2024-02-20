package common;

import java.util.Scanner;

class vol_gs{
	private int vol=0;

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

}

public class Vol {
	vol_gs v = new vol_gs();
	Scanner sc = new Scanner(System.in);

	public void display() {
		while (true) {
			System.out.println("-------- 볼륨설정 --------");
			System.out.println("1. 숫자 직접 입력\n2. 한 단계씩 올리고 내리기\n3. 음소거\n4. 나가기");
			System.out.print("번호 선택 >> ");
			int n = sc.nextInt();
			if (n==1) {
				VolInput();
			}else if (n==2) {
				VolUpDonw();
			}else if (n==3) {
				VolZero();
			}else if (n==4) {
				exit();
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	public void VolUpDonw() {
		System.out.println("현재 볼륨은 "+v.getVol()+"입니다.");
		System.out.print("1. +버튼\n2. -버튼\n선택 >> ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: VolUp(); break;
		case 2: VolDown(); break;
		default : System.out.println("잘못된 입력입니다.");
		}
	}
	public void VolInput() {
		System.out.print("원하는 볼륨을 입력해주세요 >> ");
		int vol = sc.nextInt();
		if (vol>100) {
			System.out.println("최대 볼륨은 100입니다.\n");
		}else if (vol<0) {
			System.out.println("최소 볼륨은 0입니다.\n");
		}else {
			v.setVol(vol);
			System.out.println("현재 볼륨은 "+v.getVol()+"입니다.\n");
		}
	}
	public void VolUp() {
		if (v.getVol()==100) {
			System.out.println("이미 최대 볼륨입니다.\n");
		}else {
			v.setVol(v.getVol()+1);
			System.out.println("현재 볼륨은 "+v.getVol()+"입니다.\n");
		}
	}
	public void VolDown() {
		if (v.getVol()==0) {
			System.out.println("이미 최소 볼륨입니다.\n");
		}else {
			v.setVol(v.getVol()-1);
			System.out.println("현재 볼륨은 "+v.getVol()+"입니다.\n");
		}
	}
	public void VolZero() {
		v.setVol(0);
		System.out.println("음소거 모드로 설정합니다.\n");
	}
	public void exit() {
		System.out.println("볼륨 설정을 마칩니다.");
		System.exit(0);
	}

}
