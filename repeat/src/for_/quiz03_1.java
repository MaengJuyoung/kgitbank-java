package for_;

import java.util.Scanner;

public class quiz03_1 {
	public static void main(String[] args) {
		// 1조 1번
		// 사용자로부터 정수를 입력받고, 1부터 입력받은수 까지의 합을 출력하는 프로그램을 만드시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int n = sc.nextInt();
		int sum=0;
		for (int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(n+"까지의 합 : "+sum);
	}
}
