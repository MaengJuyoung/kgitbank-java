package for_;

import java.util.Scanner;

public class quiz06_2 {
	public static void main(String[] args) {
		// 2조 1번
		// 점수를 입력받아 80점 이상이면 합격메세지를 그렇지 않으면 불합격 메세지를 
		// 출력하는 작업을 반복하다가 0에서 100점 이외의 점수가 입력되면 종료하는 프로그램
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("점수를 입력하세요 > ");
			int n = sc.nextInt();
			
			if (n<0 || n>100) {
				System.out.println("점수 오입력. 프로그램 종료");
			}else if (n>=80) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}
	}
}
