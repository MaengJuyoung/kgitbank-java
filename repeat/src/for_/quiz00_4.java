package for_;

import java.util.Scanner;

public class quiz00_4 {
	public static void main(String[] args) {
		// 입력받은 수만큼 덧셈, 뺄셈, 곱셈, 나눗셈을 순서대로 실행하는 코드 작성
		// 1. 연산을 실행할 횟수 입력, 2. 연산을 실행할 두 개의 숫자 입력
		// 단, 나눗셈 연산 시 첫번째 입력한 수가 두번째 입력한 수보다 작을 시 다시 입력받게 하시오. 
		// 출력 예시 ) 횟수 입력 : 6
		//			두 개의 숫자 입력 : 1 2
		//			1. 덧셈 실행 결과 : 3
		//			------------------------
		//			두 개의 숫자 입력 : 1 2
		//			2. 뺄셈 실행 결과 : -1
		//			------------------------
		//			두 개의 숫자 입력 : 1 2
		//			3. 곱셈 실행 결과 : 2
		//			------------------------
		//			두 개의 숫자 입력 : 1 2
		//			첫 번째 수가 두번째 수보다 크도록 입력하세요.
		//			두 개의 숫자 재입력 : 2 1
		//			4. 나눗셈 실행 결과 : 2
		//			------------------------
		//			두 개의 숫자 입력 : 1 2
		//			5. 덧셈 실행 결과 : 3
		//			------------------------
		//			두 개의 숫자 입력 : 1 2
		//			6. 뺄셈 실행 결과 : -1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("횟수 입력 : ");
		int num = sc.nextInt();
		
		int i=0, num1, num2, result;
		while (i<num) {
			System.out.print("두 개의 숫자 입력 : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			i++;
			
			if (i%4==1) {
				result = num1 + num2;
				System.out.println(i+". 덧셈 실행 결과 : "+result);
			}else if (i%4==2) {
				result = num1 - num2;
				System.out.println(i+". 뺄셈 실행 결과 : "+result);
			}else if (i%4==3) {
				result = num1 * num2;
				System.out.println(i+". 곱셈 실행 결과 : "+result);
			}else {
				if (num1<num2) {
					while (num1<num2) {
						System.out.println("첫 번째 수가 두번째 수보다 크도록 입력하세요.");
					System.out.print("두 개의 숫자 재입력 : ");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					}
				}
				result = num1 / num2;
				System.out.println(i+". 나눗셈 실행 결과 : "+result);
			}
			System.out.println("------------------------");
		}
	}
}
