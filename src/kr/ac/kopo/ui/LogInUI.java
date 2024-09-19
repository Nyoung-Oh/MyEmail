package kr.ac.kopo.ui;

import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.vo.EmailVO;
import kr.ac.kopo.vo.MemberVO;

public class LogInUI extends BaseUI{
 
	@Override
	public void execute() throws Exception{
		
		System.out.println("<<< 로그인 >>>");
		String id = scanStr("아이디 : ");
		String password = scanStr("비밀번호 : ");

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		
		MemberVO mem = memberservice.logIn(member);
		if(mem == null) {
			System.out.println("\n아이디 또는 비밀번호를 잘못입력하셨습니다.\n");
		} else {
			MemberVO.mem = member;
			System.out.println("\n환영합니다. [" + mem.getName() + "님]\n");
			new MainUI().execute();
		}
	}
}