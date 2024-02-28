package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class DB_con{
	private Connection con;			// 데이터베이스와 연결
	private PreparedStatement ps; 	// 데이터베이스로 명령어를 전송하는 역할
	private ResultSet rs;			// 데이터를 저장하는 역할
	public DB_con() {
		try {
			// 1. 오라클 연결 할 수 있게 드라이버 사용
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 기능 사용가능(드라이브 로드)");
			// 18버전 이전 : xe, 19이상 : orcl
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "c##abcd";
			String pwd = "1234";
			
			// 2. 오라클 연동
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("db 연결 성공 : "+con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<MemberDTO> select() {
		String sql = "select * from member_test";
		ArrayList<MemberDTO> arr = new ArrayList<>();
		try {
			// 3. 전송 객체 얻어오기
			ps = con.prepareStatement(sql);		// 저장된 명령어를 실행해주세용
			// 4. 얻어온 객체 실행하기 
			rs = ps.executeQuery();				// 명령어를 실행해서 나온 결과를 저장해주세용
			// rs.next(); 데이터가 존재하는지 여부 출력, next를 만나면 다음 위치(줄)로 이동
			// System.out.println(rs.next());
			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setPwd(rs.getString("pwd"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				arr.add(dto);
				/*
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("pwd"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("age"));
				System.out.println("--------");
				*/
			}
		} catch (SQLException e) {		// SQLException
			e.printStackTrace();
		}
		return arr;
	}
	public MemberDTO selectOne(String userId) {
		String sql = "select * from member_test where id='"+userId+"'";
		// System.out.println(sql);
		MemberDTO dto = null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			// while (rs.next()) {
			if (rs.next()) {
				dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setPwd(rs.getString("pwd"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				/*
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("pwd"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("age"));
				*/
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	public int delete(String delId) {
		String sql = "delete from member_test where id = ?";	// ? : 나중에 값을 채워 넣겠다는 의미
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, delId);			// '1'번째 물음표에 delID를 넣겠다. 
			// executeUpdate() : select 제외하고는 이 명령어 사용
			result = ps.executeUpdate();	// 삭제 되면 1 반환, 안되면 0 반환
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int insert(MemberDTO d) {
		String sql = "insert into member_test values(?, ?, ?, ?)";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, d.getId());
			ps.setString(2, d.getPwd());
			ps.setString(3, d.getName());
			ps.setInt(4, d.getAge());
			result = ps.executeUpdate();	// insert 성공이면 1 반환, 안되면 오류 메세지(catch)실행
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
public class MainClass {
	public static void main(String[] args) {
		DB_con db = new DB_con();
		
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. 모든 목록 보기\n2. 특정 사용자 보기");
			System.out.println("3. 데이터 추가\n4. 데이터 삭제");
			System.out.print(">>> : ");
			num = input.nextInt();
			System.out.println();
			switch (num) {
			case 1 :
				ArrayList<MemberDTO> arr = db.select();
				System.out.println("---- main ----");
				for (MemberDTO dto : arr) {
					System.out.println("id \t: "+dto.getId());
					System.out.println("pwd \t: "+dto.getPwd());
					System.out.println("name \t: "+dto.getName());
					System.out.println("age \t: "+dto.getAge());
					System.out.println("--------------");
				}
				break;
			case 2 : 
				System.out.print("검색할 id 입력 : ");
				String userId = input.next();
				MemberDTO dto = db.selectOne(userId);
				// System.out.println("dto : "+dto);
				if (dto == null)
					System.out.println("존재하지 않는 id입니다.\n");
				else {
					System.out.println("---- 검색 결과 ----");
					System.out.println("id \t: "+dto.getId());
					System.out.println("pwd \t: "+dto.getPwd());
					System.out.println("name \t: "+dto.getName());
					System.out.println("age \t: "+dto.getAge());
					System.out.println("----------------");
				}
				break;
			case 3 : 
				MemberDTO d = new MemberDTO();
				while (true) {
					System.out.print("가입할 id 입력 : ");
					d.setId(input.next());
					MemberDTO dd = db.selectOne(d.getId());
					if (dd==null) break;
					System.out.println("존재하는 아이디입니다.\n");
				}
				System.out.print("가입할 pwd 입력 : ");
				d.setPwd(input.next());
				d.setName(input.next());
				System.out.print("가입할 age 입력 : ");
				d.setAge(input.nextInt());
				int res = db.insert(d);
				if (res ==1) System.out.println("회원가입 성공!\n");
				else System.out.println("존재하는 id입니다. 회원가입 실패 \n");
				break;
			case 4 :
				System.out.print("삭제할 id 입력 : ");
				String delId = input.next();
				int re = db.delete(delId);
				if (re==1) System.out.println("삭제 성공!!\n");
				else System.out.println("존재하지 않는 id입니다. 삭제 실패\n");
				break;
			default : System.out.println("잘못된 입력입니다.\n");
			}
		}
	}
}
