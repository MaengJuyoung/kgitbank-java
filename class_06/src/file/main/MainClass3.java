package file.main;

import java.util.Scanner;

import file.service.ServiceMember;
import file.service.ServiceMemberImpl3;

public class MainClass3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while (true) {
			System.out.println("1. 회원가입\n2. 검색\n3. 회원 목록 보기");
			System.out.print("4. 탈퇴\n5. 종료\n>>> : ");
			num = input.nextInt();
			ServiceMember member = new ServiceMemberImpl3();
			switch (num) {
			case 1:
				member.register();
				break;
			case 2:
				member.search();
				break;
			case 3:
				member.list();
				break;
			case 4:
				member.delete();
				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력하셨습니다\n");
			}
		}
	}
}


