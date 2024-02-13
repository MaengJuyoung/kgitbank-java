package while_;

import java.util.Scanner;

public class test10 {
	public static void main(String[] args) {	// 이중 반복문
		// 2~n 까지에 있는 소수 찾기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 >>> ");
		int n = sc.nextInt();
		
		System.out.print(n+"까지의 소수 : ");
		for (int i=1; i<=n; i++) {
			int count = 0;
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
					count ++;
				}
			}
			if (count==2) System.out.print(i+" ");
		}
	}
}
