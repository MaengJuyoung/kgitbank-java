package array;

import java.util.Scanner;

public class quiz18 {
	public static void main(String[] args) {
		// 5조 3번
		// up&down 게임 만들기
		/*Random 숫자 값을 설정하고 해당 숫자 값을 맞추는 게임을 제작하시오
		입력 숫자가 정답숫자보다 높으면 "UP"/ 낮으면"Down"
		랜덤 정수 구하는식 => (int)(Math.random()*50+1);
		예시)
		======Up & Down======
		1. 게임 시작
		2. 기록 확인
		3. 게임 종료
		번호를 선택하시오 >> 1
		========Start=========
		50
		정답 입력 : 25
		Up
		정답 입력 : 70
		Down
		정답 입력 : 50
		정답!!
		====================
		1. 게임 시작
		2. 기록 확인
		3. 게임 종료
		번호를 선택하시오 >> 2
		이전 기록은 3회 입니다.*/
		Scanner sc = new Scanner(System.in);
		int count=0;
		while(true) {
			System.out.println("==== UP & DOWN ====");
			System.out.println("1. 게임 시작\n2. 기록 확인\n3. 게임 종료");
			System.out.print("번호를 선택하세요 >> ");
			int choice = sc.nextInt();
			System.out.println("===================");
			if (choice==1) {
				int ran = (int)(Math.random()*50+1);
				while (true) {
					System.out.print("숫자 입력(1~50) >>> ");
					int num = sc.nextInt();
					count++;
					if (num>ran) System.out.println("DOWN");
					else if (num<ran) System.out.println("UP");
					else {
						System.out.println("정답!!!");
						break;
					}
				}
			}else if (choice==2) {
				System.out.println(count+"번 만에 성공하셨습니다.");
			}else if (choice==3) {
				System.out.println("게임을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}

	}
}