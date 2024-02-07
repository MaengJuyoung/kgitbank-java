package if_;

import java.util.Scanner;

public class quiz13_5 {
	public static void main(String[] args) {
		// 5조 1번
		// 나이와 금액을입력 받고 영화표를 구매할 수 있는지 알 수 있는 프로그램을 만드시오
		// 10세~15세는 어린이표로 13000원이며, 모두시청가능 ~19세는 성인표로 15000원이다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이와 금액을 입력하세요 > ");
		int age = sc.nextInt();
		int cash = sc.nextInt();
		
		if (age>9 && age<16) {
			if (cash>=13000) {
				System.out.println("어린이 표 구매");
			}else System.out.println("돈이 부족합니다. 표를 구매할 수 없습니다.");
		}else if (age>18) {
			if (cash>=15000) {
				System.out.println("성인 표 구매");
			}else System.out.println("돈이 부족합니다. 표를 구매할 수 없습니다.");
		}
	}
}
