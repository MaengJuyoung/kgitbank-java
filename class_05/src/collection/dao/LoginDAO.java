package collection.dao;

import java.util.ArrayList;

import collection.dto.LoginDTO;

public class LoginDAO {
	public static ArrayList<LoginDTO> arr;
	static {
		arr = new ArrayList<>();
	}
	public void register (LoginDTO dto) {
		System.out.println("dao register 연동\n");
		arr.add(dto);
	}
	public void delete (String id) {
		LoginDTO l = search(id);
		if (l==null) {
			System.out.println("해당하는 아이디가 없습니다.");
		}
		else {
			int index = arr.indexOf(l);
			arr.remove(index);
		}
	}
	public ArrayList<LoginDTO> getData() {
		return arr;
	}
	public LoginDTO search(String id) {
		for (LoginDTO d : arr) {
			if (id.equals(d.getId())) {
				return d;
			}
		}
		return null;	// 내가 찾는 회원이 없을수도 있으므로 !
	}
}
