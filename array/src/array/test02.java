package array;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even=null;
		System.out.print("짝수, 홀수 입력 : ");
		odd_even = input.next(); 
		for (int i=0; i<arr.length; i++) {
			if (odd_even.equals("짝수")) {
				if (arr[i]%2==0) {
					System.out.println("짝수 : "+arr[i]);
				}
			}else {
				if (arr[i]%2==1) {
					System.out.println("홀수 : "+arr[i]);
				}
			}
		}

		/*
		 {10, 54, 13, 17, 25, 30}
		 짝수 입력 시 : index가 짝수번째인 값 출력(0,2,4)10, 13, 25
		 홀수 입력 시 : index가 짝수번째인 값 출력(1,3,5)54, 17, 30
		 */
		System.out.println("----------------");
		System.out.print("짝수, 홀수 입력 : ");
		odd_even = input.next(); 
		for (int i=0; i<arr.length; i++) {
			if (odd_even.equals("짝수")) {
				if (i%2==0) {
					System.out.println(i+"번째 : "+arr[i]);
				}
			}else {
				if (i%2==1) {
					System.out.println(i+"번째 : "+arr[i]);
				}
			}
		}



		/* 강사님 답
		System.out.println("-------------------------");
		System.out.print("짝수, 홀수 입력 : ");
		odd_even = input.next();
		for(int i=0 ; i <arr.length ; i++) {
			if( odd_even.equals("짝수") && i%2 == 0 ) {
				System.out.println(i+"."+arr[i]);
			}else if(odd_even.equals("홀수") && i%2 == 1){
				System.out.println(i+"."+arr[i]);
			}
		}
		System.out.println("--------");
		int k = 0;
		if( odd_even.equals("짝수")) {
			k = 0;
		}else {
			k = 1;
		}
		for( ;k < arr.length ; k = k + 2 ) {
			System.out.println(k + "."+arr[k]);
		}
		System.out.println("---------");
		int i = 10;
		String msg = (i>5)?"5보다 크다":"5보다작다";
		System.out.println( "msg : "+msg);
		System.out.println("-------------");
		for(int j = (odd_even.equals("짝수")?0:1) ; j < arr.length ; j+=2  ) {
			System.out.println(j + "."+arr[j]);
		}
		*/
	}
}