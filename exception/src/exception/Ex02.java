package exception;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while (true) {
			System.out.print("수 입력 : ");
			num = sc.nextInt();
			try {
			System.out.println("결과 : "+(100/num));
			} catch (Exception e) {
				System.out.println("0 입력하면 안돼요!!");
				System.out.println(e);
				System.err.println("에러 : "+e);	// 빨간 글씨로 출력
			}
		}
	}
}
