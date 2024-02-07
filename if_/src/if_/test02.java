package if_;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		n = sc.nextInt();
		if (n==0) {
			System.out.println("0은 잘못 입력했습니다.");
		}else if (n%3==0 && n%4==0) {
			System.out.println("3의 배수이면서, 4의 배수에도 해당합니다.");
		}else if (n%3==0) {
			System.out.println("3의 배수에만 해당합니다.");
		}else if (n%4==0) {
			System.out.println("4의 배수에만 해당합니다.");
		}else {
			System.out.println("3의 배수도, 4의 배수도 해당 안 됩니다.");
		}
	}
}
