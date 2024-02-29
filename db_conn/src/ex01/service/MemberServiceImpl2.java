package ex01.service;

import java.util.ArrayList;
import java.util.Scanner;

import ex01.MemberDTO;
import ex01.dao.MemberDAO2;
import ex01.dto.memberDTO;

public class MemberServiceImpl2 implements MemberService2{
	private MemberDAO2 dao;
	public MemberServiceImpl2() {
		dao = new MemberDAO2();
	}
	public void memberView() {	// 1. 모든 회원 보기
		System.out.println("------ 모든 회원 보기 ------");
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
				System.out.println("------------------------");
			}
		}
	}
	@Override
	public void selectOne() {	// 2. 특정 사용자 보기
		System.out.println("------ 특정 회원 보기 ------");
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("조회할 id 입력 : ");
			String id = input.next();
			memberDTO m = dao.memberChk(id);
			if (m!=null) {
				ArrayList<memberDTO> members = dao.getMembers();
				for (int i=0; i<members.size(); i++) {
					memberDTO mm = members.get(i);
					if (mm.getId().equals(id)) {
						System.out.println("------------------------");
						System.out.println("id\t: "+mm.getId());
						System.out.println("pwd\t: "+mm.getPwd());
						System.out.println("name\t: "+mm.getName());
						System.out.println("age\t: "+mm.getAge());
						System.out.println("------------------------");
					}
				}
				break;
			}else {
				System.out.println("존재하지 않는 id입니다.\n"); 
				return;
			}
		}
	}
	@Override
	public void register() {	// 3. 회원 등록
		System.out.println("-------- 회원 등록 기능 --------");
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("등록할 id 입력 : ");
			String id = input.next();
			memberDTO m = dao.memberChk(id);
			if (m==null) {
				MemberDTO d = new MemberDTO();
				d.setId(id);
				System.out.print("가입할 pwd 입력 : "); 	d.setPwd(input.next());
				System.out.print("가입할 name 입력 : ");	d.setName(input.next());
				System.out.print("가입할 age 입력 : ");		d.setAge(input.nextInt());
				int res = dao.insert(d);
				if (res ==1) System.out.println("회원가입 성공!\n");
				break;
			}
			System.out.println("이미 존재하는 id입니다. 등록 실패!\n");
		}
	}
	public void modify() {	// 4. 회원 수정
		System.out.println("-------- 회원 수정 기능 --------");
		Scanner input = new Scanner(System.in);
		String id, pwd, name;
		int age;
		while(true) {
			System.out.print("수정할 id\t  입력 : ");
			id = input.next();
			memberDTO m = dao.memberChk(id);
			if (m!=null) break;
			System.out.println("존재하지 않는 id입니다.\n"); return;
		}
		System.out.print("수정할 pwd  입력 : "); 	pwd = input.next();
		System.out.print("수정할 name 입력 : "); 	name = input.next();
		System.out.print("수정할 age  입력 : "); 	age = input.nextInt();
		
		memberDTO dto = new memberDTO();
		dto.setId(id); dto.setPwd(pwd); dto.setName(name); dto.setAge(age);
		//int result = dao.modify(dto);
		int result = dao.modify(id, pwd, name, age);
		if (result==1) {
			System.out.println("수정되었습니다. \n");
		}else {
			System.out.println("수정 실패\n"); 
			return;
		}
	}
	@Override
	public void delete() {	// 5. 회원 삭제
		System.out.println("-------- 회원 수정 기능 --------");
		Scanner input = new Scanner(System.in);
		String id;
		while(true) {
			System.out.print("삭제할 id 입력 : ");
			id = input.next();
			memberDTO m = dao.memberChk(id);
			if (m!=null) {
				int re = dao.delete(id);
				if (re==1) System.out.println("삭제 성공!!\n");
				break;
			}else {
				System.out.println("삭제할 id가 없습니다. 삭제 실패!\n");
				return;
			}
		}
	}
}


