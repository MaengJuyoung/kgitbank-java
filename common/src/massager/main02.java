package massager;

import java.util.Scanner;

public class main02 {
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
			// 객체 생성
			massager02 m = new massager02();
			
			// "시작"을 입력하면 안마기의 전원이 켜집니다.
			System.out.print("안마기입니다. >> ");
			String massager = sc.next();
			m.setPower(massager);
			System.out.println(m.getPower());
			
			// setter를 통해 안마시간(time)과 안마강도(force)를 결정합니다.
			
			// 기본 5분 작동이며, 버튼을 한 번 누를때마다 5분씩 증가합니다.
			// (시간 : 5, 10, 15) 버튼을 누를 횟수를 입력
			m.setTime(10);
			
			// 기본 강도는 1이며, 버튼을 한 번 누를때마다 +1됩니다.
			// (강도 : 1~5) 버튼을 누를 횟수를 입력
			m.setForce(10);
			
			// getter를 통해 안마시간과 안마강도를 출력합니다.
			System.out.println("안마시간은 "+m.getTime()+
					"분 이며, 강도는 "+m.getForce()+"입니다.");
			// 강제종료하는 메소드를 만들어 전원을 off 하세요 
			m.off();
			System.out.println(m.getPower());
			break;
		default:
			break;
		}
	}
}
