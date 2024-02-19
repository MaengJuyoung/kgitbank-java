package array;

import java.util.Scanner;

public class quiz13_7 {
	public static void main(String[] args) {
		// 7조 1번
		// 배열 인덱스 수를 입력받아서 그 인덱스 크기만큼 배열의 값을 모두 입력해서 저장해서 작성하시오
		// 배열의 전체 합과 짝수, 홀수 입력 받아 그 합도 같이 작성하시오
		/* 출력화면
		배열 인덱수 수를 입력하세요 : 4
		짝수, 홀수 입력 : 짝수
		배열의 arr[0] 번째 정수 입력 : 1
		배열의 arr[1] 번째 정수 입력 : 2
		배열의 arr[2] 번째 정수 입력 : 3
		배열의 arr[3] 번째 정수 입력 : 4
		배열 전채 합 : 10
		짝수의 합 : 20  */
		int sum=0;
		String str=null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 인덱스 수를 입력하세요 > ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			System.out.print("배열의 arr["+i+"]번째 정수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("배열 전체 합 : "+sum);
		
		System.out.print("\n짝수, 홀수 입력 >> ");
		str = sc.next();
		sum=0;
		for (int i=0; i<n; i++) {
			if (str.equals("짝수")) {
				if (i%2==0) {
					sum += arr[i];
				}
			}else if (str.equals("홀수")){
				if (i%2==1) {
					sum += arr[i];
				}
			}
		}
		if (str.equals("짝수")) {
			System.out.println("짝수의 합 : "+sum);
		}else if (str.equals("홀수")) {
			System.out.println("홀수의 합 : "+sum);
			
		}		
	}
}
