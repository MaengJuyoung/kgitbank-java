package file;	// next와 nextLine

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1, s2;
		int num;
		while (true) {
			try {			
				System.out.print("수 입력 : ");
				num = input.nextInt();
				System.out.println("입력 값 : "+num);
			}catch (Exception e) {
				s1 = input.nextLine();	// 수를 입력하지 않았을 때 위에 작성한 엔터를 빼내기 위함
				System.err.println(s1 +" : 수를 입력하세요!");	// 반복을 멈춤
			}
		}
		
		/*
		System.out.print("1. 문자열 입력 : ");
		s1 = input.next();		// 공백, 엔터를 구분자로 인식
		System.out.print("2. 문자열 입력 : ");
		input.nextLine();		// 첫번째 문자 입력 후 엔터를 친 값을 빼내기 위해 작성
		s2 = input.nextLine();	// 엔터를 구분자로 인식	
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		*/
	}
}
