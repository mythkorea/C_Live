package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

import dto.UserDTO;

public class UserDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	public UserDAO() {
		conn = DBConnection.getConnection();
	}
		
	public boolean join(UserDTO newUser) {
		//회원가입은 새로운 데이터를 추가하는 것이므로 conn에 있는 insert() 메소드를 이용한다
		//DB에 전달할 쿼리문 작성(가변값들은 ?로 작성)
		String sql = "INSERT INTO USERS VALUES(?,?,?,?,?,?,?,?)";
		//미리 작성해좋은 DBConnection클래스를 이용해 건설된 다리받아오기
		conn = DBConnection.getConnection();
		int result = 0;
	
		try {
			       //받아온 다리 위를 왔다갓다할 전령만들기,전령이 수행할 쿼리문을 전달해준다
			pstm = conn.prepareStatement(sql);
			//가지고 있는 첫번째 물움표에 newUser.userid값으로 대신 채워주기
			pstm.setString(1, newUser.id);
			pstm.setString(2, newUser.pw);
			pstm.setString(3, newUser.name);
			pstm.setString(4, newUser.phonenum);
			pstm.setString(5, newUser.gender);
			pstm.setInt   (6, newUser.age);
			pstm.setString(7, newUser.addr);
			pstm.setString(8, newUser.email);
			
			//pstm이 가지고 있는 쿼리문 수행
			//INSERT, UPDATE, DELETE : executeUpdate()	- 수정된(추가된) 행의개수 return (int)
			//SELECT : executeQuery() - 검색된 테이블을 return (ResultSet)
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("join 예외발생 : " + e);
		}
		return result==1;
	}
	public boolean login(String userid, String userpw) {
		
		String sql = "SELECT COUNT(*) FROM USERS WHERE ID=? AND PW=?";
		int result = 0;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			
			//검색되 결과 테이블을 ResultSet 타입으로 리턴
			rs = pstm.executeQuery();
			//rs.next() : 행을 하나 아래로 이동
			if(rs.next()) {
				result = rs.getInt(1);
			}

		} catch (SQLException e) {
			System.out.println("join 예외발생 : "+e);
		}
		return result==1;
	}

	public boolean checkDup(String id) {
		String sql = "SELECT COUNT(*) FROM USERS WHERE ID=?";
		int result = 1;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			
			//검색되 결과 테이블을 ResultSet 타입으로 리턴
			rs = pstm.executeQuery();
			//rs.next() : 행을 하나 아래로 이동
			if(rs.next()) {
				result = rs.getInt(1);
			}

		} catch (SQLException e) {
			System.out.println("join 예외발생 : "+e);
		}
		return result==0;
	}
	public boolean updateUser(int choice, String newData) {
		String userid = Session.get("login_id");
		String[] columns = {"PW","PHONE","ADDR"};
		String sql ="UPDATE USERS SET"+columns[choice-1]+"=? WHERE ID = ?";
		int result = 0;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, newData);
			pstm.setString(2, userid);
			
			result = pstm.executeUpdate();
		}catch (SQLException e) {
			
		}
		return result !=0;
	}

	public boolean leaveId() {
		String sql = "DELETE FROM USERS WHERE ID = ?";
		try {
		pstm = conn.prepareStatement(sql);
		pstm = conn.setString(1,Session.get("login_id"));
		//pstm.
		}catch(SQLException e) {
			
		}
	}

//	public char[] getList() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}

















