package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class AddUI extends BaseUI{
 
	@Override
	public void execute() throws Exception{
		
		System.out.println("    <<< 회원가입 >>>");
		System.out.println("<<< 개인 정보를 입력하세요 >>>");
		String id = scanStr("아이디 : ");
		String password = scanStr("비밀번호 : ");
		String name = scanStr("이름 : ");
		String phone = scanStr("핸드폰 번호 : ");
	
		MemberVO mem = new MemberVO();
		mem.setId(id);
		mem.setPassword(password);
		mem.setName(name);
		mem.setPhone(phone);
		memberservice.addMember(mem);
		
		System.out.println("\n회원가입을 완료하였습니다!\n");
		
	}
}