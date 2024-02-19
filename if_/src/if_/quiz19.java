package if_;

import java.util.Scanner;

public class quiz19 {
	public static void main(String[] args) {	// 복습! 출제자 답 그대로 옮김 
		// 7조 1번
		// 달러 환전 프로그램을 작성하세요. 환전할 단위 선택지 작성
		// 환율 : 1달러 = 1326원, 소수점 없이 정수만 사용

		Scanner sc = new Scanner(System.in);
		int won, choice, dollar, exchange;

		while(true) { // while - true 무한루프
			System.out.println("환전하실 단위를 선택하세요(1-달러, 2-원화)");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("얼마를 환전 하시겠습니까? ");
				dollar = sc.nextInt();
				exchange = dollar * 1326;
				won =+ exchange;
				System.out.println(dollar + "달러를 환전하시면 " + won + "원입니다");
				break; // 무한루프를 빠져나온다
			}else if(choice == 2) {
				System.out.println("얼마를 환전 하시겠습니까? ");
				won = sc.nextInt();
				exchange = won / 1326 ;
				dollar =+ exchange;
				System.out.println(won + "원을 환전하시면 " + dollar + "달러입니다");
				break; // 무한루프를 빠져나온다
			}else {
				System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
			}
		}
	}
}