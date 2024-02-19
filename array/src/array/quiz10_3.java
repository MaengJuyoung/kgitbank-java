package array;

import java.util.Scanner;

public class quiz10_3 {
	public static void main(String[] args) {	// 다시보기
		// 3조 1번
		/* 세개의 자연수 A,B,C가 주어질 때 A*B*C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇번 쓰였는지를 구하는 프로그램을 작성하시오
		예를들어 A=150, B=266,C=427이라면, A*B*C=150*266*427=17037300이 되고
		계산한결과 17037300에는 0이3번, 1이 1번, 3이 2번, 7이 2번쓰였다.
		입력 예 )			출력 예 )
		150				3
		266				1
		427				0
						2
						0
						0
						0
						2
						0	
						0*/
		
		int arr[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 3개 입력 >>> ");
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = 1;
		for (int i=0; i<arr.length; i++) {
			result *= arr[i];
		}
		System.out.println(result);
		String str = Integer.toString(result);
		sc.close();
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(i+" : "+count+"개");
		}
		
	}
}
