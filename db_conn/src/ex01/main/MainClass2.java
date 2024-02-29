package ex01.main;

import java.util.Scanner;

import ex01.service.MemberService2;
import ex01.service.MemberServiceImpl2;

public class MainClass2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberService2 ms = new MemberServiceImpl2();
		int num;
		while (true) {
			System.out.print("1. 모든 회원 보기\t4. 회원 수정\n");
			System.out.print("2. 특정 회원 보기\t5. 회원 삭제\n");
			System.out.print("3. 회원 등록\t6. 종료\n>>> : ");
			num = input.nextInt();
			switch (num) {
			case 1:
				ms.memberView(); break;
			case 2:
				 ms.selectOne(); break;
			case 3: 
				ms.register(); break;
			case 4: 
				ms.modify(); break;
			case 5 :
				ms.delete(); break;
			case 6 :
				System.out.println("프로그램 종료!"); return;
			default :
				System.out.println("잘못된 입력입니다. \n");
			}
		}
	}
}
