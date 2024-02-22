package collection.dao;	// Data Access Object의 약자로 DB의 데이터에 접근하기 위해서 사용되는 객체

import java.util.ArrayList;

import collection.dto.MemberDTO;

public class MemberDAO {	// 데이터베이스에 연동할 때 작성하는 부분
	public static ArrayList<MemberDTO> arr;
	static {	// 따로 쓸 경우 초기에 작업하는 코드를 추가할 수 있음
		arr = new ArrayList<>();
		// arr.add(null);
	}
	public void register(MemberDTO dto) {
		System.out.println("dao register 연동\n");
		//System.out.println(dto.getName());
		//System.out.println(dto.getAddr());
		arr.add(dto);
	}
	public ArrayList<MemberDTO> getData() {
		return arr;
	}
	public MemberDTO search(String name) {
		for (MemberDTO d : arr) {
			if (name.equals(d.getName())) {
				return d;
			}
		}
		return null;	// 내가 찾는 회원이 없을수도 있으므로 !
	}
	
}
