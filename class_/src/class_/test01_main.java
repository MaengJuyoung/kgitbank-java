package class_;

import java.util.Scanner;

public class test01_main {
	public static void main(String[] args) {
		test01_class t = new test01_class();
		
		Scanner input = new Scanner(System.in);
		
		t.big();
		
		t.isOddEven();
		
		t.multipleThree();
		
		t.prime();
		
		System.out.print("절대값 판별할 수 입력 : ");
		int num1 = input.nextInt();
		System.out.println(num1+"의 절대 값 : "+t.absolute(num1));
		System.out.println();
		
		System.out.print("거꾸로 수 출력할 수 입력 : ");
		int num2 = input.nextInt();
		System.out.println(num2+"의 거꾸로 수 : "+t.reverse(num2));

	}
	
	
	
	
}
