package day02;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		int n, num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		n=sc.nextInt();
		String result1 = (n%2==0)?"짝수":"홀수";
		System.out.println(n+" = "+result1);
		String result2 = (n%3==0)?"3의 배수이다.":"3의 배수가 아니다.";
		System.out.println(n+" = "+result2);
		System.out.println();
		System.out.print("두 수 입력 : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("num1 : "+num1+", num2 : "+num2);
		String result3 = (num1<num2)?"num2가 num1보다 크다":"num1가 num2보다 크다.";
		System.out.println(result3);
	}
}
