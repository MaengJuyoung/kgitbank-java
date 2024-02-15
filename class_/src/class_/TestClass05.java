package class_;

import java.util.Scanner;

public class TestClass05 {
	public void sumFunc(int num) {
		// Scanner input = new Scanner(System.in);
		int sum=0;
		// 입력 기능
		// System.out.print("수 입력 > ");
		// num = input.nextInt();
		// 연산 기능
		for (int i=1; i<=num; i++) {
			sum+=i;
		}
		// 출력 기능
		System.out.println("1~"+num+"까지의 합 : "+sum);
	}
}
