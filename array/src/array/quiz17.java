package array;

import java.util.Random;

public class quiz17 {
	public static void main(String[] args) {
		// 5조 2번
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 배열에 초기화 후 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		//	ex. 5 3 2 7 4 8 6 10 9 10
		//	최대값 : 10
		//	최소값 : 2
		
		int arr[] = new int[10];
		/* 출제자 답 - 랜덤 생성 다른 경우(import 생성필요없는 경우)
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		*/
		Random r = new Random();
		for (int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(10)+1;
			System.out.print(arr[i]+" ");
		}
		int max=arr[0], min=arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>max) max=arr[i];
			if (arr[i]<min) min=arr[i];
		}
		System.out.println();
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
	}
}