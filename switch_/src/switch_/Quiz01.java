package switch_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String home=null, office=null;

		while(true) {
			System.out.println("----------------");
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.println("----------------");
			System.out.print("수행할 번호 입력 > ");
			int num = sc.nextInt();
			System.out.println();
			
			switch (num) {
			case 1:
				System.out.print("우리집 주소 입력 > ");
				home = sc.next();
				System.out.println("등록 성공!");
				break;
			case 2:
				System.out.print("회사 주소 입력 > ");
				office = sc.next();
				System.out.println("등록 성공!");
				break;
			case 3:
				if (home ==null) {
					System.out.println("집 주소를 등록하세요...");
				}else {
					System.out.println("우리집 : "+home);
				}
				if (office ==null) {
					System.out.println("집 주소를 등록하세요...");
				}else {
					System.out.println("우리집 : "+home);
				}
				break;
			}
			// if (num==3) break;
		}
	}
}
