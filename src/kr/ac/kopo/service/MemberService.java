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
	
//�α���
	public MemberVO logIn(MemberVO member) throws Exception {

		return memdao.logIn(member);
		}

//ȸ������
	public void addMember(MemberVO mem) {
		
		memdao.insert(mem);
	}

//ȸ�� Ż��	
	public void deleteMember(MemberVO mem) throws Exception {
		memdao.deleteMember(mem);
	}

	
}
