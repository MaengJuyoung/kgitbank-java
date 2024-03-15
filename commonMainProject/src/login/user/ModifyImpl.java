package login.user;

import java.util.ArrayList;

import common.CommonService;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import login.dao.LoginDAO;
import login.dto.LoginDTO;
import login.main.MainClass2;
import member.dao.MemberDAO;
import member.dto.MemberDTO;
import member.service.MemberService;

public class ModifyImpl implements ModifyService {
	Parent root;
	TextField delId,delPwd,delEmail;
	MemberDAO dao;
	ArrayList<MemberDTO> arr;
	String id2;
	String pwd2;
	String email2;
	String pwd3; String name3; String email3;
	String id3;
	public ModifyImpl() {
		dao = new MemberDAO();
		arr = new ArrayList<>();
	}
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void btnDel(int result1) {
	
		dao.delete(id2);
		CommonService.myAlert("탈퇴 완료");

	}
	public void delId(String id, String pwd, String email) {
		this.id2 = id;
		this.pwd2 = pwd;
		this.email2= email;
	}
	public int del() {
		int result = 1;
		arr = dao.getMembers();
		for(int i =0; i<arr.size(); i++) {
			if(id2.equals(arr.get(i).getId()) && 
					email2.equals(arr.get(i).getEmail())&& 
					pwd2.equals(arr.get(i).getPwd())) {
				result = 0;
			}
		}return result;
	}
	public void btn(Parent root) {
		MainClass2 ms = new MainClass2();
		ms.viewFx(root);
	}

	public void btnModi() {
		
	}
	public void modiId( String pwd, String name, String email, String id) {
		this.pwd3 = pwd;
		this.name3 = name;
		this.email3 = email;
		this.id3 = id;
	}
	public int modi() {
		int result = dao.modify(pwd3, name3, email3, id3);
		return result;
	}
}