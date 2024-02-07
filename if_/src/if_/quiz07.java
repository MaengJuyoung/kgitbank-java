package if_;

import java.util.Scanner;

public class quiz07 {
	public static void main(String[] args) {
		// 2조 2번
		// 점수와 학년을 입력했을때 합격 불합격 여부 출력
		// 1) 점수가 60점 이상면 합격 그렇지 않으면 불합격 출력
		// 2) 단, 4학년을 입력했을때는 70점 이상이여야 합격이다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수와 학년을 입력하세요 > ");
		int score = sc.nextInt();
		int grade = sc.nextInt();
		
		if (score>=60) {
			if (grade!=4) {
				System.out.println("합격");
			}else if (score>=70) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}
	}
}
