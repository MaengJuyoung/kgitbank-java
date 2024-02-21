package constructor;

import java.util.Scanner;

public class LoginService01 implements LoginInter{
	TimeService03 t = new TimeService03();
	LoginDTO01 l = new LoginDTO01();
	Scanner sc = new Scanner(System.in);
	String userId, userPwd;
	
	public void display() {
		while (true) {
			System.out.println("1. 로그인\n2. 회원가입\n3. 탈퇴");
			System.out.print("번호 선택 >> ");
			int num = sc.nextInt();
			System.out.println("---------------");
			if (num ==1) {
				System.out.println("1. 로그인");
				login(); 
			}
			else if (num==2) {
				System.out.println("2. 회원가입");
				join();
			}
			else if (num==3) {
				System.out.println("3. 탈퇴");
				delete();
				System.out.println(t.getResultTime()+"\n");
			}
			else System.out.println("잘못된 번호입니다.");
		}
	}
	public void login() {
		if (l.getId()==null) {
			System.out.println("회원가입 먼저 하세요!!!\n");
		}else {
			System.out.print("아이디를 입력하세요 >> ");
			userId = sc.next();
			if (userId.equals(l.getId())) {
				System.out.print("비밀번호를 입력하세요 >> ");
				userPwd = sc.next();
				if (userPwd.equals(l.getPwd())) {
					System.out.println("인증 통과!!!\n");
					t.setStartTime();
				}else {
					System.out.println("비밀번호가 틀렸습니다.\n");
				}
			}else {
				System.out.println("존재하지 않는 id입니다.\n");
			}
		}
	}
	public void join() {
		System.out.print("회원가입 할 id 입력 > "); userId = sc.next();
		
		if (userId.equals(l.getId())) {
			System.out.println("사용자 존재합니다. 탈퇴 후 진행하세요!!\n");
		}else {
			System.out.print("pwd 입력 > ");	userPwd = sc.next();
			l.setId(userId); l.setPwd(userPwd);
			System.out.println("등록 완료\n");
		}
	}
	public void delete() {
		if (l.getId()==null) {
			System.out.println("회원가입 먼저 하세요!!!\n");
		}else {
			l.setId(null); l.setPwd(null);
			t.setEndTime();
			System.out.println("탈퇴 되었습니다.\n");
		}
	}
}