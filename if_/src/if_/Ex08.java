package if_;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		if (num>100) {
			System.out.println("100보다 큰 수");
		}else if (num>50) {
			System.out.println("50보다 큰 수");
		}else if (num>0) {
			System.out.println("0보다 큰 수");
		}else {
			System.out.println("그 외의 값");
		}
		System.out.println("다음 문장들 실행");
		
		// 입력값이 짝수고, 50보다 크다면
		if (num%2 == 0) {
			System.out.println("짝수");
		}
		if (num>50) {
			System.out.println("50보다 크다.");
		}
	}
}
