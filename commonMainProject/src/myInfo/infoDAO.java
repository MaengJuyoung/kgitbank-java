package myInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import login.dto.LoginDTO;

public class infoDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	public infoDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "c##abcd", pwd = "1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,id,pwd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public LoginDTO aaa(String userId) {
		String sql = "select * from login_fx where id ='" + userId+ "'";
		LoginDTO dto = null;
		//String a = "xodud5080@naver.com";
			try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				dto = new LoginDTO(rs.getString("id"),rs.getString("pwd"),rs.getString("name"), rs.getString("email"));
				//a = rs.getString("email");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
}
