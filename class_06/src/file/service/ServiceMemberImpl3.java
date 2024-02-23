package file.service;

import java.util.Scanner;

import file.dao.MemberDAO3;
import file.dto.MemberDTO;

public class ServiceMemberImpl3 implements ServiceMember{
	private MemberDAO3 dao;
	public ServiceMemberImpl3() {
		dao = new MemberDAO3();
	}
	@Override
	public void register() {
		MemberDTO dto = new MemberDTO();
		Scanner input = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		dto.setId(input.next());
		System.out.print("이름 입력 : ");
		dto.setName(input.next());
		
		boolean bool = dao.register(dto);
		if (bool) {
			System.out.println("존재하는 회원입니다.\n");
		}else {
			System.out.println("회원가입 성공!!\n");
		}
		
	}
	@Override
	public void list() {
		String[] listFile = dao.getList();
		if (listFile.length==0) {
			System.out.println("저장된 목록이 없습니다.");
		}else {
			for (int i=0; i<listFile.length; i++) {
				System.out.println(i+1+". "+listFile[i]);
			}
			System.out.println();
		}
	}
	@Override
	public void delete() {
		Scanner input = new Scanner(System.in);
		String id;
		System.out.print("삭제할 id 입력 : ");
		id = input.next();
		boolean bool = dao.delete(id);
		if (bool) System.out.println("삭제되었습니다!!\n");
		else System.out.println("존재하지 않는 회원입니다.\n");
	}
	@Override
	public void search() {
		Scanner input = new Scanner(System.in);
		String id;
		System.out.print("검색할 id 입력 : ");
		id = input.next();
		MemberDTO d = dao.search(id);
		if (d!=null) {
			System.out.println("id : "+d.getId());
			System.out.println("name : "+d.getName());
			System.out.println();
		}
	}
}

