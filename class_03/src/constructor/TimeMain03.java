package constructor;

import java.util.Scanner;

public class TimeMain03 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TimeInter t = new TimeService03();
		while (true) {
			System.out.println("1. 시작 시간 설정\n2. 시작 시간 확인\n3. 종료 시간 설정");
			System.out.print("4. 종료 시간 확인\n5. 사용 시간 가져오기\n>>> : ");
			int num = sc.nextInt();
			if (num==1) {
				t.setStartTime();
			}else if (num==2) {
				String sTime = t.getStartTime();
				System.out.println(sTime);
			}else if (num==3) {
				t.setEndTime();
			}else if (num==4) {
				String eTime = t.getEndTime();
				System.out.println(eTime);
			}else if (num==5) {
				System.out.println(t.getResultTime());
			}else {
				System.out.println("잘못 입력하셨습니다. ");
			}
			System.out.println();
		}
	}
}
