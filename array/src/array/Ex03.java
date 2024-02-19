package array;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String[] str = new String[3];
		System.out.println(str.length);
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<str.length; i++) {
			System.out.print(i+"번째 입력 > ");
			str[i] = sc.next();
		}
		System.out.println("---- 출력 ----");
		for (int i=0; i<str.length; i++) {
			System.out.println(i+". "+str[i]);
		}
	}
}
