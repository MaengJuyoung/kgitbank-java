package array;

import java.util.Scanner;

public class quiz00_4 {
	public static void main(String[] args) {
		// 4조 1번 (맹주영)
		// 크기 5인 배열을 생성하여 숫자 5개를 입력받은 후, 
		// 5개의 숫자를 오름차순으로 정리하시오. 
		// 출력 예) 132 -64 54 3 21 
		//		 작은 수부터 출력 : -64 3 21 54 132

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.print("숫자 다섯 개를 입력하세요 >>> ");
		for (int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}

		// 입력받은 수를 작은 순서대로 넣기
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        // 결과값 출력
        System.out.print("작은 수부터 출력 : ");
        for (int i=0; i<5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
}
