package for_;

import java.util.Scanner;

public class quiz10_3 {
	public static void main(String[] args) {
		// 3조 1번
		// 두정수 A와 B를 입력받은 다음에 A+B를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.print("개수 입력 > ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=0; i<n; i++) {
			System.out.print("두 개의 수 입력 > ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("합 : "+(num1+num2));
		}
	}
}
