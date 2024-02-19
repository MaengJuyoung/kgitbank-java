package if_;

import java.util.Scanner;

public class quiz15 {
	public static void main(String[] args) {
		// 5조 3번
		// 국어, 영어, 수학 점수를 입력 받아 평균을 구한 후,	평군이 60점 이상이면서 
		// 과목 점수가 모두 60점 이상이면 [합격].	평균이 60점 이상이지만 과목 점수가 
		// 한과목 이상 60점 미만이면 [과락으로 불합격].	평균이 60점 미만이면 [평균 미달 불합격]
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요 > ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int sum = kor+eng+mat;
		int avg = sum/3;
		
		if (avg>=60) {
			if (kor<60 || eng<60 || mat<60) {
				System.out.println("과락으로 불합격");
			}else System.out.println("합격!");
		}else System.out.println("평균 미달 불합격");
		
		/* 출제자 답
		if(avg >= 60) {
			if(kor >= 60 && eng >= 60 && mat >= 60) {
				System.out.println("합격");
			}else {
				if(kor < 60) {
					System.out.print("국어 ");
				}
				if(eng < 60) {
					System.out.print("영어 ");
				}
				if(mat < 60) {
					System.out.print("수학 ");
				}
				System.out.println("과락으로 불합격");
			}
		}else {
			System.out.println("평균 미달 불합격");
		}
		*/
	}
}
