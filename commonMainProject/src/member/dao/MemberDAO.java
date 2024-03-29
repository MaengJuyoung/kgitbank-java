package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import member.dto.MemberDTO;

public class MemberDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public MemberDAO(){
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "c##abcd", pwd="1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로드 성공");
			con = DriverManager.getConnection(url,id,pwd);
			System.out.println("디비 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public int register(MemberDTO dto) {
		int result = 0;
		String sql = "insert into login_fx(id,email,pwd,name)"+"values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getEmail());
			ps.setString(3, dto.getPwd());
			ps.setString(4, dto.getName());
			
			result = ps.executeUpdate();
		} catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	ArrayList<MemberDTO> arr = new ArrayList<>();
	public ArrayList<MemberDTO> getMembers(){
		String sql = "select * from login_fx";
		MemberDTO dto;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setEmail(rs.getString("email"));
				dto.setPwd(rs.getString("pwd"));
				dto.setName(rs.getString("name"));

				arr.add(dto);
				System.out.println(arr.get(0).getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
	public int delete(String delId) {
		//System.out.println(delId);
		String sql = "delete from login_fx where id ='"+delId+"'";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int modify( String pwd, String name, String email, String id) {

		String sql ="update login_fx set pwd=?, name=?, email=? where id = ?";
	 int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, pwd);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, id);
			ps.execute();
			result = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result ;
	}
}
