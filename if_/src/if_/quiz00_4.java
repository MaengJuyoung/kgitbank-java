package if_;

import java.util.Scanner;

public class quiz00_4 {
	public static void main(String[] args) {
		// 맹주영(4조 2번)
		// 국어, 영어, 수학 점수를 입력하여 평균 점수와 등급을 출력하는 프로그램을 작성하시오.
		// 단, 평균이 100점 초과이거나, 0점 미만인 경우 "잘못입력하셨습니다."를 출력하도록 작성
		// A:90점 이상, B:90점 미만 80점 이상, C:80점 미만 70점 이상, D:70점 미만 60점 이상, F:60점 미만
		// 출력 예) 평균 점수는 90점이며, 등급은 A입니다.
		int kor, eng, mat, sum, avg;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요 > ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		sum = kor+eng+mat;
		avg = sum/3;
		
		if (avg>100 || avg<0) {
			System.out.println("잘못입력하셨습니다.");
		}else if (avg>=90) {
			System.out.println("평균 점수는 "+avg+"이며, 등급은 A입니다.");
		}
		else if (avg>=80) {
			System.out.println("평균 점수는 "+avg+"이며, 등급은 B입니다.");
		}
		else if (avg>=70) {
			System.out.println("평균 점수는 "+avg+"이며, 등급은 C입니다.");
		}
		else if (avg>=60) {
			System.out.println("평균 점수는 "+avg+"이며, 등급은 D입니다.");
		}else {
			System.out.println("평균 점수는 "+avg+"이며, 등급은 F입니다.");
		}
	}
}
