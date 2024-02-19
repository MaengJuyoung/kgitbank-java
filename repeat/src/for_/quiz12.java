package for_;

import java.util.Scanner;

public class quiz12 {
	public static void main(String[] args) {
		// 3조 3번
		/*1번부터 5번 학생의 점수를 연속으로 받고,	65점 이상이면 합격, 65점 미만이면 불합격으로
		   처리해 전체학생의 합격,불합격 여부를 한번에 보여주세요.	(단, 5번의 입력에는 모두 "점수를
		   입력해주세요"가 각각 떠야하고, 학생들의 합격여부는 5줄로 한번만 출력이 이뤄져야합니다.)*/
		
		Scanner sc = new Scanner(System.in);
		int score, n1 = 0;
		String s1=null, s2=null, s3=null, s4=null, s5=null, n2=null;
		System.out.println("학생들의 점수를 순서대로 입력해주세요 : ");
		for( ; n1 < 5 ; ) {
			score = sc.nextInt();
			n1 += 1;

			if(score >= 65) n2 = "합격";
			else n2 = "불합격";

			switch(n1) {
			case 1 : s1 = n1+"번 학생은 "+n2+"입니다.";
			case 2 : s2 = n1+"번 학생은 "+n2+"입니다.";
			case 3 : s3 = n1+"번 학생은 "+n2+"입니다.";
			case 4 : s4 = n1+"번 학생은 "+n2+"입니다.";
			case 5 : s5 = n1+"번 학생은 "+n2+"입니다.";
			}
		}
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5);
	}
}
