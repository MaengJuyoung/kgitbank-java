package for_;

import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {	// 복습! 그대로 옮겨옴
		// 1조 2번
		// 2.숫자 맞추기 게임
		System.out.println("숫자 맞추기 게임을 시작합니다.");
		int computerNum = (int)(Math.random()*100+1);

		if(computerNum%2==0) {
			System.out.println("힌트: 짝수입니다.");
		}else {
			System.out.println("힌트: 홀수입니다.");
		}
		
		Scanner s = new Scanner(System.in);

		int userNum = 0 ;
		int count = 0;
		while(true) {
			System.out.println("1~100 사이의 값을 입력하세요 :");
			userNum = s.nextInt();
			count++;
			if(userNum>computerNum) {
				System.out.println("더 작은 수입니다");
			}else if(userNum < computerNum) {
				System.out.println("더 큰 수입니다.");
			}else {
				System.out.println(count + "번만에 맞췄습니다.");
				break;
			}
		}
	}
}
