package exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, result=0;
		System.out.print("두 수 입력 > ");
		x=sc.nextInt();
		y=sc.nextInt();
		try {
			System.out.println("try 실행");
			result = x/y;
			System.out.println("정상 동작");
			System.out.println("정상 동작");
			System.out.println("정상 동작");
		}catch(ArithmeticException e) {
			System.out.println("문제 발생");
			System.out.println("0으로 나눌 수 없음");
		}
		
		System.out.println("결과 : "+result);
	}
}
