package array;

import java.util.Scanner;

public class quiz09 {
	public static void main(String[] args) {
		// 2조 4번
		// 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력.
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개 입력 >> ");
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("3의 배수 : ");
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
