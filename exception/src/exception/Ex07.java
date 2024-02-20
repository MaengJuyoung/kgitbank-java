package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=0;
		System.out.print("나이 입력 > ");
		try {
			age = sc.nextInt();
			if (age<0) {
				throw new Exception("음수는 안돼요!");	// 강제예외
			}
		}catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("당신의 나이는 : "+age);
	}
}
