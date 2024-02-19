package if_;

import java.util.Scanner;

public class quiz06_2 {
	public static void main(String[] args) {
		// 2조 1번
		// 1과목, 2과목, 3과목, 4과목, 5과목 까지 있는 시험을 치른다.
		// 한 과목이라도 60점 미만인 경우 "불합격입니다."를 출력하고
		// 총점이 400점 이상이면 "합격입니다!"를 출력하시오.
		int a, b, c, d, e, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("다섯과목 점수를 입력하세요.");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		sum=a+b+c+d+e;
		
		/* 내가한거
		if (sum>400) {
			if (a<60 || b<60 || c<60 || d<60 || e<60) {
				System.out.println("불합격입니다.");
			}else
				System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}*/ 
		
		if (a<60 || b<60 || c<60 || d<60 || e<60 || sum<400) {
			System.out.println( "불합격입니다" );
		}else {
			System.out.println("합격입니다!"); 
		}
		
	}
}
