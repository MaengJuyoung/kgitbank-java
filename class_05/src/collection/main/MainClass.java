package collection.main;

import java.util.Scanner;

import collection.service.LoginService;
import collection.service.LoginServiceImpl;
import collection.service.MemberService;
import collection.service.MemberServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		MemberService ms = new MemberServiceImpl();
		LoginService ls = new LoginServiceImpl();
		while(true) {
			System.out.print("1. 회원 관리\n2. 로그인 기능\n>>> : ");
			num = input.nextInt();
			switch(num) {
			case 1 : 
				ms.display();
				break;
			case 2 :
				ls.login();
				break;
			default : System.out.println("잘못된 입력입니다!\n");
			}
		}
	}
}
