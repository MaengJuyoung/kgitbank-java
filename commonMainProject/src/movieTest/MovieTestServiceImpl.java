package movieTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.scene.Parent;
import movieJudge.movieJudgeDTO;

public class MovieTestServiceImpl implements MovieTestService{
	Parent root;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	testController ctrl;
	MovieTestServiceImpl ms;
	ArrayList<movieTestDTO> arr = new ArrayList<>();
	movieTestDTO dto;
	
	@Override
	public void setRoot(Parent root, testController ctrl) {
		this.root = root;
		this.ctrl = ctrl;
		//aaa();
	}
	public MovieTestServiceImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "c##abcd";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "select * from movie_judge";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public ArrayList<movieTestDTO> aaa() {
		try {
			while (rs.next()) {
				dto = new movieTestDTO();
				dto.setContent(rs.getString("content"));
				dto.setMoviename(rs.getString("moviename"));
				arr.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr;
	}
}
