package exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.print("수 입력 > ");
		x = sc.nextInt();
		try {
			int result = 10/x;
			System.out.println("결과 : "+result);
			return;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {	// 무조건 실행
			sc.close();
			System.out.println("finally 실행");
		}
		System.out.println("다음 문장들 실행!!!");
	}
}
