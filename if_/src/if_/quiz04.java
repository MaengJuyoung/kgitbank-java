package if_;

import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {
		// 1조 2번
		// 두 수를 입력받아 아래 기능을 수행하는 계산기를 만드시오.
		
		int n, num1, num2, result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- 계산기 ----");
		System.out.println("1.덧셈\t2.뺄셈");
		System.out.println("3.곱셈\t4.나눗셈");
		System.out.println("5.나머지구하기");
		System.out.println("--------------");
		
		System.out.print("원하는 기능의 번호를 입력하세요 : ");
		n = sc.nextInt();
		
		System.out.print(n+"번 연산을 할 두 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println();
		 
		if (n==1) {
			result = num1+num2;
			System.out.println(num1+" + "+num2+" = "+result);
		}else if (n==2) {
			result = num1-num2;
			System.out.println(num1+" - "+num2+" = "+result);
		}else if (n==3) {
			result = num1*num2;
			System.out.println(num1+" * "+num2+" = "+result);
		}else if (n==4) {
			result = num1/num2;
			System.out.println(num1+" / "+num2+" = "+result);
		}else if (n==5) {
			result = num1%num2;
			System.out.println(num1+" % "+num2+" = "+result);
		}else {
			System.out.println("해당하는 기능이 없습니다.");
		}
	} 
} 
