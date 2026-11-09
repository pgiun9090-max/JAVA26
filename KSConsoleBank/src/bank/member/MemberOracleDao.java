package bank.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bank.app.Util.DbUtil;

public class MemberOracleDao implements MemberDao{


	@Override
	public boolean save(Member m) {
		String sql = "INSERT INTO BANK_MEMBER "
				+ " (id, password, name, email, mobile, type) "
				+ "values (?, ?, ?, ?, ?, ?)";
		try (Connection conn = DbUtil.getConnection(); //DB와 연결, conn변수에 저장
			PreparedStatement pstmt = conn.prepareStatement(sql)) { //SQL을 실행 준비, pstmt변수에 저장
			pstmt.setString(1, m.getId()); // 1번 ? 에 Id 저장
			pstmt.setString(2, m.getPassword()); // 2번 ? 에 Id 저장
			pstmt.setString(3, m.getName()); // 3번 ? 에 Id 저장
			pstmt.setString(4, m.getEmail()); // 4번 ? 에 Id 저장
			pstmt.setString(5, m.getMobile()); // 5번 ? 에 Id 저장
			pstmt.setString(6, String.valueOf(m.getType())); // 6번 ? 에 type 저장
			return pstmt.executeUpdate() == 1; // INSERT 성공했는지 여부
		} catch (SQLException e) {
			throw new RuntimeException("회원 저장 실패", e);
		}
	}

	@Override
	public List<Member> findAll() {
	    // 1. password 추가
	    String sql = "SELECT id, password, name, email, mobile, type "
	            + "FROM BANK_MEMBER";
	    List<Member> members = new ArrayList<>();
	    try (Connection conn = DbUtil.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {
	        while (rs.next()) {
	            String id = rs.getString("id");
	            String password = rs.getString("password"); // 2. 비밀번호 읽기
	            String name = rs.getString("name");
	            String email = rs.getString("email");
	            String mobile = rs.getString("mobile");
	            char type = rs.getString("type").charAt(0);

	            // 3. null 대신 password 넣기
	            Member member = new Member(
	                    id, password, name, email, mobile, type
	            );
	            members.add(member);
	        }
	        return members;
	    } catch (SQLException e) {
	        throw new RuntimeException("회원 목록 조회 실패", e);
	    }
	}

	
	@Override
	public Member findById(String id) {
	    String sql = "SELECT id, password, name, email, mobile, type "
	            + "FROM BANK_MEMBER "
	            + "WHERE id = ?";
	    try (Connection conn = DbUtil.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {

	        pstmt.setString(1, id);

	        try (ResultSet rs = pstmt.executeQuery()) {
	            if (rs.next()) {
	                String Id = rs.getString("id");
	                String password = rs.getString("password"); // 2. 비밀번호 읽기
	                String name = rs.getString("name");
	                String email = rs.getString("email");
	                String mobile = rs.getString("mobile");
	                char type = rs.getString("type").charAt(0);

	                Member member = new Member(Id, password, name, email, mobile, type);
	                return member;
	            }
	            return null;
	        }
	    } catch (SQLException e) {
	        throw new RuntimeException("회원 조회 실패", e);
	    }
	}
	

	@Override
	public boolean update(Member m) {
	    String sql = "UPDATE BANK_MEMBER "
	            + "SET password = ?, name = ?, email = ?, mobile = ? "
	            + "WHERE id = ?";
	    try (Connection conn = DbUtil.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setString(1, m.getPassword());
	        pstmt.setString(2, m.getName());
	        pstmt.setString(3, m.getEmail());
	        pstmt.setString(4, m.getMobile());
	        pstmt.setString(5, m.getId());
	        return pstmt.executeUpdate() == 1;
	    } catch (SQLException e) {
	        throw new RuntimeException("회원 수정 실패", e);
	    }
	}

	
	@Override
	public boolean delete(Member m) {
		String sql = "DELETE FROM BANK_MEMBER "
				+ "WHERE id = ? AND password = ?";
		try (Connection conn = DbUtil.getConnection(); //DB와 연결, conn변수에 저장
		        PreparedStatement pstmt = conn.prepareStatement(sql)){ //SQL을 실행 준비, pstmt변수에 저장
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPassword());
			
			return pstmt.executeUpdate() == 1; // DELETE 성공했는지 여부
		}catch (SQLException e) {
			throw new RuntimeException("회원 삭제 실패", e);
		}
	}

}
