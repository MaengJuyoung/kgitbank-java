package collection.service;

import java.util.ArrayList;
import java.util.Scanner;

import collection.dao.LoginDAO;
import collection.dto.LoginDTO;

public class LoginServiceImpl implements LoginService{
	LoginDAO dao;
	Scanner sc = new Scanner(System.in);
	String id, pwd;

	public LoginServiceImpl() {
		dao = new LoginDAO();
	}
	// LoginDTO dto = new LoginDTO(); 이게 바깥에만 있고 안에 없을 경우 new 연산자를 한 번만 만들기때문에 얕은복사가 되어버림!! 계속 새로운 값을 만들어서 저장하려면 메소드마다 있어야함

	@Override
	public void loginCheck() {
		System.out.println("로그인 기능입니다!!");
		LoginDTO dto = new LoginDTO();
		if (dao.arr.size()==0) {
			System.out.println("회원가입이 필요합니다.\n");
		}else {
			System.out.print("id 입력 : "); 
			id = sc.next();
			LoginDTO l = dao.search(id);
			if (l!=null) {
				if (id.equals(l.getId())) {
					System.out.print("pwd 입력 : "); pwd = sc.next();
					if (pwd.equals(l.getPwd())) {
						System.out.println("로그인 성공!\n");
					}else {
						System.out.println("비밀번호가 틀렸습니다.\n");
					}
				}
			}
			else {
				System.out.println("없는 아이디입니다!\n");
			}
		}
	}

	@Override
	public void register() {
		System.out.println("회원가입 기능입니다!!");
		LoginDTO dto = new LoginDTO();
		System.out.print("가입할 id 입력 : ");		
		String id = sc.next();
		LoginDTO l = dao.search(id);
		if (l!=null) {
			System.out.println("존재하는 아이디입니다. \n");
		}else {
			dto.setId(id);
			System.out.print("가입할 pwd 입력 : ");		
			dto.setPwd(sc.next());
			dao.register(dto);
			System.out.println("가입 성공\n");
		}
	}

	@Override
	public void delete() {
		System.out.println("탈퇴 기능입니다!!");
		LoginDTO dto = new LoginDTO();
		if (dao.arr.size()==0) {
			System.out.println("회원가입이 필요합니다.\n");
		}else {
			System.out.print("탈퇴할 id 입력 : ");		
			String id = sc.next();
			LoginDTO l = dao.search(id);
			dao.delete(id);
			/*// 잘 삭제되었는지 확인
			System.out.print("남은 아이디 : ");
			ArrayList<LoginDTO> arr = dao.getData();
			for (LoginDTO i : arr) {
				System.out.print(i.getId()+" ");
			}
			System.out.println();
			System.out.println(); */
			System.out.println(id+"가 탈퇴되었습니다.\n");
		}

	}

	@Override
	public void login() {
		System.out.println("------ 로그인 기능 ------");
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("1. 로그인\n2. 회원가입\n3. 탈퇴\n4. 종료\n>>> : ");
			num = input.nextInt();
			switch(num) {
			case 1 : 
				loginCheck();
				break;
			case 2 :
				register();
				break;
			case 3 : 
				delete();
				break;
			case 4 :
				System.out.println("로그인 기능을 마칩니다. \n");
				return;
			default : System.out.println("잘못된 입력입니다!\n");
			}
		}
	}
}
