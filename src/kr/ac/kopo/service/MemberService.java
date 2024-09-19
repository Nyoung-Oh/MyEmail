package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dao.MemberDAO;
import kr.ac.kopo.vo.EmailVO;
import kr.ac.kopo.vo.MemberVO;

public class MemberService {

	private MemberDAO memdao;
	
	public MemberService() {
		memdao = new MemberDAO();
	}
	
//로그인
	public MemberVO logIn(MemberVO member) throws Exception {

		return memdao.logIn(member);
		}

//회원가입
	public void addMember(MemberVO mem) {
		
		memdao.insert(mem);
	}

//회원 탈퇴	
	public void deleteMember(MemberVO mem) throws Exception {
		memdao.deleteMember(mem);
	}

	
}
