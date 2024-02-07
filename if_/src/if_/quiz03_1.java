package if_;

import java.util.Scanner;

public class quiz03_1 {
	public static void main(String[] args) {
		// 1조 1번
		// 입력받은 수가 양수인지 음수인지 판단하는 프로그램을 작성하세요.
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		n = sc.nextInt();
		
		if (n>0) {
			System.out.println(n+"은 양수입니다.");
		}else if (n==0) {
			System.out.println("0입니다.");
		}else {
			System.out.println(n+"은 음수입니다.");
		}
	}
}
