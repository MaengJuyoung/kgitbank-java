package for_;

import java.util.Scanner;

public class quiz16_6 {
	public static void main(String[] args) {
		// 6조 1번
		// 1. 사용자에게 구구단을 입력받는다. ex) 구구단을 입력하세요: 3
		// 2. 만약에 3을 입력 받았으면 구구단을 1단부터 3단까지 출력한다.

		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 입력하세요 > ");
		int n= sc.nextInt();
		for (int i=1; i<=n; i++ ) {
			for (int j=1; j<10; j++) {
				int result = i*j;
				System.out.println(i+" X "+j+" = "+result);
			}
			System.out.println("------------");
		}
	}
}