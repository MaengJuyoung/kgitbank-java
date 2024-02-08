package switch_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		while(true) {
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.println("입력한 이름 : "+name);
		}
	}
}
