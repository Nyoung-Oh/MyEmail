package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;

import kr.ac.kopo.vo.EmailVO;
import kr.ac.kopo.vo.MemberVO;

public class MemberDAO {

//로그인
	public MemberVO logIn(MemberVO member) throws Exception {

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id, password, name ");
		sql.append("  FROM TBL_MEMBER ");
		sql.append(" WHERE id = ? AND password = ?");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");

				MemberVO mem = new MemberVO();
				mem.setId(id);
				mem.setPassword(password);
				mem.setName(name);

				return mem;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//회원가입
	public void insert(MemberVO member) {

		StringBuilder sql = new StringBuilder();
		sql.append("insert into tbl_member(name, id, password, phone) ");
		sql.append(" values(?, ?, ?, ?) ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getId());
			pstmt.setString(3, member.getPassword());
			pstmt.setString(4, member.getPhone());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//회원 탈퇴
	public void deleteMember(MemberVO member) throws Exception {

		StringBuilder sql = new StringBuilder();
		sql.append("DELETE  ");
		sql.append("  FROM TBL_MEMBER ");
		sql.append(" WHERE id = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, member.getId());
			pstmt.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
