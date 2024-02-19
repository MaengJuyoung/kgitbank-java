package list;

import java.util.Scanner;

public class quiz03_3 {
	public static void main(String[] args) {
		// 3조 1번
		// 첫째 줄에 주어지는 정수 n개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		/* 입력 : 첫째 줄에 정수의 개수 N이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
		입력 예)
		5
		20 10 35 30 7
		출력 예)
		7 35 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.print(num+"개의 정수 입력 >> ");
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max=arr[0], min=arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}

		}
		System.out.println(min+" "+max);
	}
}
