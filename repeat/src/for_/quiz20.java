package for_;

import java.util.Scanner;

public class quiz20 {
	public static void main(String[] args) {
		// 7조 2번
		// 구구단을 작성하세요
		int result;
	
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				result = i*j;
				System.out.println(i+" X "+j+" = "+result);
			}
			System.out.println("------------");
		}
		
		/* 만약 선택받는다면 ~
		Scanner sc = new Scanner(System.in);
		System.out.print("궁금한 구구단의 숫자 입력 > ");
		int n= sc.nextInt();
		for (int i=1; i<=n; i++ ) {
			for (int j=1; j<10; j++) {
				result = i*j;
				System.out.println(i+" X "+j+" = "+result);
			}
			System.out.println("------------");
		}*/
	}
}
