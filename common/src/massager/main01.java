package massager;

import java.util.Scanner;

public class main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("====전자 제품 선택====\n1. 에어컨\n2. 티비\n3. 안마기\n>>> ");
		int func = sc.nextInt();
		
		switch (func) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			massager01 m = new massager01();
			m.powerOn();
			m.TimeUp();
			m.ForceDown();
			System.out.println(m.getPower());
			System.out.println("안마기의 작동 시간은 "+m.getTime()+
					"분이며, 강도는 "+m.getForce()+"입니다.");
			m.powerOff();
			System.out.println(m.getPower());
			m.powerOn();
			m.TimeDown();
			m.ForceUp();
			System.out.println(m.getPower());
			System.out.println("안마기의 작동 시간은 "+m.getTime()+
					"분이며, 강도는 "+m.getForce()+"입니다.");
			
			break;
		default:
			break;
		}
	}
}
