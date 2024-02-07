package day02;

import java.util.Scanner;	// import : 특정 기능을 현재 페이지로 가져올 때 사용하는 기능

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String name;
		System.out.print("이름 입력 : ");
		name = input.next();	// next() : 문자열 입력받는 기능
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		
		System.out.println();
		System.out.println("이름 : "+name);
		System.out.println("입력 수 : "+num);
		System.out.println();
		
		double dou;
		System.out.print("실수 입력 : ");
		dou = input.nextDouble();
		System.out.println("실수 : "+dou);
	}
}
