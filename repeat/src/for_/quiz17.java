package for_;

import java.util.Scanner;

public class quiz17 {
	public static void main(String[] args) {
		// 6조 2번
		// 랜덤한 0 ~ 10 까지의 수를 생성하여 5번의 기회 내에 랜덤 생성된 숫자를 맞추는 프로그램을 만드시오
		// 1) 현재 남은 목숨 출력
		// 2) 정답 시 맞춘 숫자, 추측 횟수 출력
		// 3) 목숨이 다 닳는다면 정답을 출력

		// - 랜덤 숫자 생성 코드 -
		// double ranDouble = Math.random();
		// int ranInt = (int)(ranDouble*10)

		double ranDouble = Math.random();
		int ranInt = (int)(ranDouble*10+1);
		Scanner sc = new Scanner(System.in);

		for (int i=5; i>0; i--) {
			System.out.println("------------------------");
			System.out.println("현재 목숨 : "+i);
			System.out.print("숫자를 맞추세요(1~10) : ");
			int n = sc.nextInt();
			System.out.println();

			if (n==ranInt) {
				System.out.println("★★★★★ 숫자를 맞추셨습니다! ★★★★★");
				System.out.println("맞춘 숫자 : "+n);
				System.out.println("추측 횟수 : "+(5-i));
				break;
			}else {
				System.out.println("추측 실패, 목숨 -1");
				if (i==1) {
					System.out.println();
					System.out.println("목숨이 모두 닳았습니다.");
					System.out.println("정답은 "+ranInt+"입니다.");
					break;
				}
			}
		}
		
		
		/* 출제자 답
		 Scanner sc = new Scanner(System.in);
				
		// 1~9 랜덤 숫자 변수 
		double ranDouble = Math.random();
		int ranInt = (int)(ranDouble*10);
		
		// 변수 선언 및 초기화 
		int chance = 5;
		int guess = 0;
		int life = 5;
		boolean check;
		
		// 숫자 추측 
		for(int i=1; i<=10; i++) {
			System.out.println("현재 목숨 : " + life);
			System.out.print("숫자를 맞추세요(1~9) : ");
			guess = sc.nextInt();
			
			// 추측 성공 여부 
			if(guess == ranInt) {
				check = true;
			}else {
				check = false;
			}
		
			// 성공, 실패 시 출력 메세지 
			if( check ) {
				System.out.println();
				System.out.println("★★★★★숫자를 맞추셨습니다★★★★★");
				System.out.println("맞춘 숫자 : " + ranInt);
				System.out.println("추측 횟수 : " + i);
				break;
			}else {
				System.out.println();
				System.out.println("추측 실패, 목숨 -1");
				System.out.println();
				life -= 1;
			}
			
			// 목숨 확인 및 게임진행 여부 
			if(life>0) {
				continue;
			}else {
				System.out.println("목숨이 모두 닳았습니다.");
				System.out.println("정답은 " + ranInt + "입니다.");
				break;
			}
		}
		*/
	}
}