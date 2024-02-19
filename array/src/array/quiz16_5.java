package array;

import java.util.Scanner;

public class quiz16_5 {
	public static void main(String[] args) {
		// 5조 1번
		// 6개의 서로 다른 자연수를 배열로 입력하고, 이들 중 최댓값을 찾고 그 최댓값이 몇번째 수 인지 구하는 프로그램 작성
		// * 자연수를 입력하지 않을 경우 "다시 입력하세요" - 해당 수만 다시 입력하도록 함
		// * 자연수는 1번째 부터 6번째까지 있음
		/* 1번째 수 입력 : 0
			다시 입력하세요 : 0
			다시 입력하세요 : 12
			2번째 수 입력 : 99
			3번째 수 입력 : 25
			4번째 수 입력 : -7
			다시 입력하세요 : 7
			5번째 수 입력 : 56
			6번째 수 입력 : 100

			12 99 25 7 56 100 
			해당 배열의 최댓값은 6번째 수인 100 입니다. */

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];

		for (int i=0; i<arr.length; i++) {
			System.out.print(i+1+"번째 수 입력 : ");
			arr[i] = sc.nextInt();
			while(true) {
				if (arr[i]<=0 || arr[i]>10000000) {
					System.out.print("자연수로 다시 입력하세요 : ");
					arr[i] = sc.nextInt();
				}else break;
			}
		}
		int max=arr[0], index=0;
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			if (arr[i]>max) {
				max=arr[i];
				index =i+1;
			}
		}
		System.out.println();
		System.out.println("해당 배열의 최댓값은 "+index+"번째 수인 "+max+"입니다.");
		
		
	}
}