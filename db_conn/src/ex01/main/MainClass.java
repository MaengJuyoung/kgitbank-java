package ex01.main;

import java.util.Scanner;

import ex01.service.MemberService;
import ex01.service.MemberServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberService ms = new MemberServiceImpl();
		int num;
		while (true) {
			System.out.print("1. 회원 보기\n2. 회원 수정\n3. 종료\n>>> : ");
			num = input.nextInt();
			switch (num) {
			case 1:
				ms.memberView(); break;
			case 2 :
				ms.modify(); break;
			case 3 :
				System.out.println("프로그램 종료!"); return;
			default :
				System.out.println("잘못된 입력입니다. \n");
			}
		}
	}
}
