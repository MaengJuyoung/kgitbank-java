package if_;

import java.util.Scanner;

public class quiz11 {
	public static void main(String[] args) {
		// 3조 2번
		// 오늘은 5월 1일 수요일입니다.	사용자 입력으로 일수를 받고 n일 뒤 무슨 요일인지 출력하세요.
		// 단,0보다 작거나 31이상의 숫자는 '1이상 30이하의 숫자를 입력해주세요' 문구 출력
		// (2024년 5월과 일수-요일이 같으니 달력으로 올바른지 확인 가능)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 > ");
		int n = sc.nextInt();
		
		System.out.println();
		System.out.println("오늘은 2024년 5월 1일 수요일입니다.");
		if (n>0 && n<31) {
			if (n%7==1) {
				System.out.println(n+"일 뒤는 목요일입니다.");
			}else if (n%7==2) {
				System.out.println(n+"일 뒤는 금요일입니다.");
			}else if (n%7==3) {
				System.out.println(n+"일 뒤는 토요일입니다.");
			}else if (n%7==4) {
				System.out.println(n+"일 뒤는 일요일입니다.");
			}else if (n%7==5) {
				System.out.println(n+"일 뒤는 월요일입니다.");
			}else if (n%7==6) {
				System.out.println(n+"일 뒤는 화요일입니다.");
			}else {
				System.out.println(n+"일 뒤는 수요일입니다.");
			}
		}else System.out.println("1이상 30이하의 숫자를 입력해주세요");
	}
}
