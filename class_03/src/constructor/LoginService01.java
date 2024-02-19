package constructor;

import java.util.HashMap;
import java.util.Scanner;

public class LoginService01 {
	private LoginDTO01 l;
	Scanner sc = new Scanner(System.in);
	HashMap<String, String> map = new HashMap<>();
	String id, pwd ;
	
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
			}
			else System.out.println("잘못된 번호입니다.");
		}
	}
	public void login() {
		l = new LoginDTO01();
		if (map.size()==0) {
			System.out.println("회원가입 먼저 하세요!!!\n");
		}else {
			System.out.print("아이디를 입력하세요 >> ");
			id = sc.next();
			if (map.containsKey(id)==false) {
				System.out.println("존재하지 않는 id입니다.\n");
			}else {
				System.out.print("비밀번호를 입력하세요 >> ");
				String pwd = sc.next();
				if (map.containsValue(pwd)) {
					System.out.println("인증 통과!!!\n");
				}else {
					System.out.println("비밀번호가 틀렸습니다.\n");
				}
			}
		}
		
	}
	public void join() {
		l = new LoginDTO01();
		System.out.print("회원가입 할 id 입력 > ");
		id = sc.next();
		
		if (map.containsKey(id)) {
			System.out.println("사용자 존재합니다. 탈퇴 후 진행하세요!!\n");
		}else {
			l.setId(id);
			System.out.print("pwd 입력 > ");
			String pwd = sc.next();
			l.setPwd(pwd);
			map.put(id, pwd);
			System.out.println("등록 완료\n");
		}
	}
	public void delete() {
		l = new LoginDTO01();
		if (map.size()==0) {
			System.out.println("회원가입 먼저 하세요!!!\n");
		}else {
			System.out.print("탈퇴할 아이디 입력 > ");
			id = sc.next();
			if (map.containsKey(id)) {
				System.out.println("탈퇴가 완료되었습니다.\n");
				map.remove(id);
			}else {
				System.out.println("해당 아이디가 존재하지 않습니다.\n");
			}
		}
	}
}