package for_;

import java.util.Scanner;

public class quiz09 {
	public static void main(String[] args) {	// 복습! if문 식 다시 보기
		// 2조 4번
		// int형 양수 범위 숫자를 입력하였을 경우 각 자릿수의 합을 구하세요.
		// 반복해서 동작하다 입력값에 0이 들어가면 프로그램이 종료됩니다.
		// 입력           출력
		// 11               2 
		// 111              3
		// 1111            4
		// 11111           5
		// 895              22
		// 222222222     18
		
		Scanner sc = new Scanner(System.in);
		
		while(true)	{
			System.out.print("양수 범위 숫자 입력 > ");
			int num = sc.nextInt();
			
			int sum = 0;
			int temp = num;
						
			if(num == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			while(true)	{
				int ten = 10;
				
				if(temp > 0) {
					sum += temp % ten; 
					temp -= temp % ten; 
					temp = temp / 10;	
				}
				else break;
			}
			System.out.println(sum);
		}
	}
}
