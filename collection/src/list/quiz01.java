package list;

import java.util.ArrayList;
import java.util.Random;

public class quiz01 {
	public static void main(String[] args) {
		// 4조 1번 (이태영)
		/* 학생 3명의 국어,영어,수학 점수를 인덱스 순서대로 각각 ArrayList를 만든다.
		* 인덱스 0 = 국어, 1 = 영어, 2 = 수학
		각 과목의 점수를 1~100점 사이의 점수를 랜덤으로 부여한다.
		3명의 학생의 각각 과목당 1등, 전체 평균의 1등을 출력하시오
		ex)
		첫번째 학생 점수 => [24, 88, 14]
		두번째 학생 점수 => [38, 90, 41]
		세번째 학생 점수 => [41, 36, 98]
		국어 성정 1등은 세번째 학생입니다.
		영어 성적 1등은 두번째 학생입니다.
		수학 성정 1등은 세번째 학생입니다.
		전체 1등은 세번째 학생입니다. */
		
		Random ran = new Random();
		ArrayList<Integer> stu1 = new ArrayList<>();
		ArrayList<Integer> stu2 = new ArrayList<>();
		ArrayList<Integer> stu3 = new ArrayList<>();
		
		for (int i=0; i<3; i++) {
			stu1.add(ran.nextInt(100)+1);
			stu2.add(ran.nextInt(100)+1);
			stu3.add(ran.nextInt(100)+1);
		}
		System.out.println("첫 번째 학생 점수 : "+stu1);
		System.out.println("두 번째 학생 점수 : "+stu2);
		System.out.println("세 번째 학생 점수 : "+stu3);
		
		for (int i=0; i<3; i++) {
			if (stu1.get(i)>stu2.get(i) && stu1.get(i)>stu3.get(i)) {
				if (i==0) System.out.println("국어 성적 1등은 첫 번째 학생입니다.");
				else if (i==1) System.out.println("영어 성적 1등은 첫 번째 학생입니다.");
				else System.out.println("수학 성적 1등은 첫 번째 학생입니다.");
			}else if (stu2.get(i)>stu1.get(i) && stu2.get(i)>stu3.get(i)) {
				if (i==0) System.out.println("국어 성적 1등은 두 번째 학생입니다.");
				else if (i==1) System.out.println("영어 성적 1등은 두 번째 학생입니다.");
				else System.out.println("수학 성적 1등은 두 번째 학생입니다.");
			}else {
				if (i==0) System.out.println("국어 성적 1등은 세 번째 학생입니다.");
				else if (i==1) System.out.println("영어 성적 1등은 세 번째 학생입니다.");
				else System.out.println("수학 성적 1등은 세 번째 학생입니다.");
			}
		}
		int sum1=0, sum2=0, sum3=0;
		for (int i=0; i<3; i++) {
			sum1 += stu1.get(i);
			sum2 += stu1.get(i);
			sum3 += stu1.get(i);
		}
		if (sum1>sum2 && sum1>sum3) System.out.println("전체 성적 1등은 첫 번째 학생입니다.");
		else if (sum2>sum1 && sum2>sum3) System.out.println("전체 성적 1등은 두 번째 학생입니다.");
		else System.out.println("** 전체 성적 1등은 세 번째 학생입니다.**");
		
	}
}
