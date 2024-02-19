package if_;

import java.util.Scanner;

public class quiz10_3 {
	public static void main(String[] args) {
		// 3조 1번
		// 한국초등학교에서 학년별 대표가 국어, 영어, 수학시험을 본다. 1,2,3학년은 평균이 65점
		// 이상이면 합격이고	4,5학년은 평균 75점 이상이면 합격, 6학년은 80점 이상이어야지 합격.
		// 학년과 시험 점수를 입력하고 합격일 시 "합격입니다."를 출력하고, 불합격 일시 
		// 평균 점수가 몇 점 미달인지를 알려주는 "OO 점 미달로 불합격입니다"를 출력하시오.

		int grade, kor, eng, mat, sum, avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("학년과 국어, 영어, 수학시험 점수를 입력하세요 > ");
		grade = sc.nextInt();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		sum = kor+eng+mat;
		avg = sum/3;
		
		System.out.println("총점 : "+sum+", 평균 : "+avg);
		if (grade>0 && grade<4) {
			if (avg>=65) System.out.println("합격입니다.");
			else System.out.println((65-avg)+"점 미달로 불합격입니다.");
		}else if (grade==6) {
			if (avg>=80) System.out.println("합격입니다.");
			else System.out.println((80-avg)+"점 미달로 불합격입니다.");
		}else {
			if (avg>=75) System.out.println("합격입니다.");
			else System.out.println((75-avg)+"점 미달로 불합격입니다.");
		}
		
		/* 제출자 답
		 if(1 <= grade && 3 >= grade) {
			if(avg >= 65) {
				System.out.println("합격입니다.");
			}
			else {	
				System.out.println(65 - avg +"점 미달로 불합격입니다.");
			}
		}
		if(4 <= grade && 5 >= grade) {
			if(avg >= 75) {
				System.out.println("합격입니다.");
			}
			else {
				System.out.println(75 - avg +"점 미달로 불합격입니다.");
			}
		}
		if(grade == 6) {
			if(avg >= 80) {
				System.out.println("합격입니다.");
			}
			else {
				System.out.println(80 - avg +"점 미달로 불합격입니다.");
			}		
		}
		 */
	}
}
