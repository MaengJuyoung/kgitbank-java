package while_;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String newId=null, newPw=null, id, pw;
		
		while (true) {
			System.out.print("1. 로그인\n2. 회원가입\n3. 나가기\n>>>");
			int num = sc.nextInt();
			if (num==1) {
				System.out.print("아이디 입력 > ");
				id = sc.next();
				System.out.print("비밀번호 입력 > ");
				pw = sc.next();
				System.out.println();
				if (id.equals(newId)) {
					if (pw.equals(newPw)) {
						System.out.println("로그인 성공"); 
						break;
					}
					else System.out.println("비밀번호가 틀렸습니다.");
				}else {
					System.out.println("회원가입하세요.\n");
				}
			}else if (num==2) {
				System.out.print("등록할 아이디 입력 > ");
				newId = sc.next();
				System.out.print("등록할 비밀번호 입력 > ");
				newPw = sc.next();
				System.out.println("가입 완료!");
				System.out.println();
			}else if (num==3) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.\n");
			}
		}
		
		/* 강사님 답
		Scanner input = new Scanner(System.in);
		String saveID=null,savePW=null,newID=null,newPW=null;
		boolean flag = true;
		int num;
		while(flag){
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.print(">>> ");
			num = input.nextInt();
			if(num == 3){
				System.out.println("프로그램 종료 합니다!!!");
				break;
			}
			switch(num){
			case 1:
				System.out.print("아이디 입력 : ");
				newID = input.next();
				System.out.print("비밀번호 입력 : ");
				newPW = input.next();
				if(newID.equals(saveID) && newPW.equals(savePW))
					System.out.println("인증 성공 !!!");
				else
					System.out.println("인증 실패 !!!");
				break;
			case 2:
				System.out.print("저장할 아이디 입력 : ");
				saveID = input.next();
				System.out.print("저장할 비밀번호 입력 : ");
				savePW = input.next();
				System.out.print("가입 완료 !!!");
			}
		}*/
		
	}
}
