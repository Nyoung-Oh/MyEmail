package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.EmailVO;
import kr.ac.kopo.vo.MemberVO;

public class EmailDAO {

	
//받은 메일함
	public List<EmailVO> receivedAllEmail() {

		List<EmailVO> list = new ArrayList<>();

		StringBuilder sql = new StringBuilder();
		sql.append("select no, title, sendname, receivedname, reg_date, contents ");
		sql.append("  from  tbl_received ");
		sql.append("  where receivedname = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, MemberVO.mem.getId());
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String sendname = rs.getString("sendname");
				String receivedname = rs.getString("receivedname");
				String contents = rs.getString("contents");
				String reg_date = rs.getString("reg_date");

				EmailVO e = new EmailVO(no, reg_date, title, sendname, receivedname, contents);
				list.add(e);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	
//보낸 메일함
	public List<EmailVO> sendAllEmail() {

		List<EmailVO> list = new ArrayList<>();

		StringBuilder sql = new StringBuilder();
		sql.append("select no, title, sendname, receivedname, reg_date, contents ");
		sql.append("  from  tbl_send ");
		sql.append("  where sendname = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, MemberVO.mem.getId());
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String sendname = rs.getString("sendname");
				String receivedname = rs.getString("receivedname");
				String contents = rs.getString("contents");
				String reg_date = rs.getString("reg_date");

				EmailVO e = new EmailVO(no, reg_date, title, sendname, receivedname, contents);
				list.add(e);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	
//메일 보내기
	
	//보낸 메일함에 insert
	public void insertSend(EmailVO email) {

		StringBuilder sql = new StringBuilder();
		sql.append("insert into tbl_send(no, sendname, receivedname, title, contents) ");
		sql.append(" values(seq_tbl_send_no.nextval, ?, ?, ?, ?) ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			String receivedname = email.getReceivedname();
			String title = email.getTitle();
			String contents = email.getContents();

			pstmt.setString(1, MemberVO.mem.getId());
			pstmt.setString(2, email.getReceivedname());
			pstmt.setString(3, email.getTitle());
			pstmt.setString(4, email.getContents());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//받은 메일함에 insert
	public void insertReceived(EmailVO email) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("insert into tbl_received(no, sendname, receivedname, title, contents) ");
		sql.append(" values(seq_tbl_received_no.nextval, ?, ?, ?, ?) ");
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			
			String sendname = email.getSendname();
			String title = email.getTitle();
			String contents = email.getContents();
			
			pstmt.setString(1, email.getSendname());
			pstmt.setString(2, email.getReceivedname());
			pstmt.setString(3, email.getTitle());
			pstmt.setString(4, email.getContents());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
//받은 메일 번호로 휴지통으로 이동
	
	//로그인한 아이디의 받은 메일함 출력
	public List<EmailVO> selectReceivedEmail() {

		List<EmailVO> list = new ArrayList<>();

		StringBuilder sql = new StringBuilder();
		sql.append("select no, title, sendname, receivedname, reg_date, contents ");
		sql.append("  from  tbl_received ");
		sql.append("  where receivedname = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, MemberVO.mem.getId());
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String sendname = rs.getString("sendname");
				String receivedname = rs.getString("receivedname");
				String contents = rs.getString("contents");
				String reg_date = rs.getString("reg_date");

				EmailVO e = new EmailVO(no, reg_date, title, sendname, receivedname, contents);
				list.add(e);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//선택 번호의 메일 휴지통으로 insert
	public void insertTrash(int no) {

		StringBuilder sql = new StringBuilder();
		sql.append("insert into tbl_trash(no, name, title, contents) ");
		sql.append(" select no, sendname, title, contents ");
		sql.append("  from tbl_received ");
		sql.append("  where no = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//선택 메일 삭제
	public EmailVO deleteEmail(int no) {
		
		EmailVO a = null;
		StringBuilder sql = new StringBuilder();
		sql.append("delete ");
		sql.append(" from tbl_received ");
		sql.append(" where no = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		) {
			
			pstmt.setInt(1, no);
			pstmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
}