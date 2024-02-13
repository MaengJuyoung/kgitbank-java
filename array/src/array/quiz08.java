package array;

import java.util.Scanner;

public class quiz08 {
	public static void main(String[] args) {
		// 2조 3번
		// 숫자 5개를 입력받아 높은 순서대로 나열하세요
		// ex) 
		//	입력 : 1 2 3 4 5
		//	1번째 : 5
		//	2번째 : 4
		//	3번째 : 3
		//	4번째 : 2
		//	5번째 : 1
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 5개 입력 >> ");
		for (int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
	}
}
