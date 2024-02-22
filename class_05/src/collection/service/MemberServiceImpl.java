package collection.service;

import java.util.ArrayList;
import java.util.Scanner;

import collection.dao.MemberDAO;
import collection.dto.MemberDTO;

public class MemberServiceImpl implements MemberService {
	MemberDAO dao;
	public MemberServiceImpl() {
		dao = new MemberDAO();
	}
	@Override
	public void register() {
		System.out.println("회원 가입 기능입니다!!");
		String name, addr;
		MemberDTO dto = new MemberDTO();
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("주소 입력 : ");
		dto.setAddr(input.next());
		dto.setName(name);
		dao.register(dto);
	}

	@Override
	public void memberViews() {
		System.out.println("목록 보는 기능입니다!!");
		ArrayList<MemberDTO> arr = dao.getData();
		for (MemberDTO m : arr) {
			System.out.println("이름 : "+m.getName());
			System.out.println("주소 : "+m.getAddr());
			System.out.println("----------------");
		}
	}
	@Override
	public void display() {
		System.out.println("------ 회원 관리 ------");
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("1. 저장\n2. 목록확인\n3. 검색\n4. 종료\n>>> : ");
			num = input.nextInt();
			switch(num) {
			case 1 : 
				register();
				break;
			case 2 :
				memberViews();
				break;
			case 3 : 
				search();
				break;
			case 4 :
				System.out.println("회원 관리를 마칩니다. \n");
				return;				
			default : System.out.println("잘못된 입력입니다!\n");
			}
		}
	}
	@Override
	public void search() {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.print("검색할 이름 입력 : ");
		name = input.next();
		MemberDTO m = dao.search(name);
		if (m ==null) {
			System.out.println(name+" 사용자는 없습니다!!\n");
		}else {
			System.out.println("이름 : "+m.getName());
			System.out.println("주소 : "+m.getAddr());
			System.out.println();
		}
	}
}
