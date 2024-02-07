package if_;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		// 1조 3번
		// 문자열을 입력받고, 입력받은 문자열 안에 a가 포함되어있는지 여부를 출력하는 문제 
		// str.contains(String)
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		str = sc.next();
		if (str.contains("a")) {
			System.out.println("a 포함");
		}else {
			System.out.println("a 미포함");
		}
	}
}
