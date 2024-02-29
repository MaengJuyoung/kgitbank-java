package ex01.service;

import java.util.ArrayList;
import java.util.Scanner;

import ex01.dao.MemberDAO;
import ex01.dto.memberDTO;

public class MemberServiceImpl implements MemberService{
	private MemberDAO dao;
	public MemberServiceImpl() {
		dao = new MemberDAO();
	}
	public void memberView() {
		System.out.println("---- 회원 보기 기능 ----");
		ArrayList<memberDTO> members = dao.getMembers();
		if (members.size() == 0) {
			System.out.println("등록된 정보가 없습니다!\n");
		}else {
			// for (MemberDTO m : members ){}
			for (int i=0; i<members.size(); i++) {
				memberDTO m = members.get(i);
				System.out.println("id\t: "+m.getId());
				System.out.println("pwd\t: "+m.getPwd());
				System.out.println("name\t: "+m.getName());
				System.out.println("age\t: "+m.getAge());
				System.out.println("----------------");
			}
		}
	}
	public void modify() {
		System.out.println("---- 회원 수정 기능 ----");
		Scanner input = new Scanner(System.in);
		String id, pwd, name;
		int age;
		while(true) {
			System.out.print("수정할 id\t  입력 : ");
			id = input.next();
			memberDTO m = dao.memberChk(id);
			if (m!=null) break;
			System.out.println("존재하지 않는 id입니다.\n");
		}
		System.out.print("수정할 pwd  입력 : "); 	pwd = input.next();
		System.out.print("수정할 name 입력 : "); 	name = input.next();
		System.out.print("수정할 age  입력 : "); 	age = input.nextInt();
		
		memberDTO dto = new memberDTO();
		dto.setId(id); dto.setPwd(pwd); dto.setName(name); dto.setAge(age);
		//int result = dao.modify(dto);
		int result = dao.modify(id, pwd, name, age);
		if (result==1) System.out.println("수정되었습니다. \n");
		else System.out.println("수정 실패\n");
	}
}


