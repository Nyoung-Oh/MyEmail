package kr.ac.kopo.ui;

import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.vo.EmailVO;
import kr.ac.kopo.vo.MemberVO;

public class LogInUI extends BaseUI{
 
	@Override
	public void execute() throws Exception{
		
		System.out.println("<<< �α��� >>>");
		String id = scanStr("���̵� : ");
		String password = scanStr("��й�ȣ : ");

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		
		MemberVO mem = memberservice.logIn(member);
		if(mem == null) {
			System.out.println("\n���̵� �Ǵ� ��й�ȣ�� �߸��Է��ϼ̽��ϴ�.\n");
		} else {
			MemberVO.mem = member;
			System.out.println("\nȯ���մϴ�. [" + mem.getName() + "��]\n");
			new MainUI().execute();
		}
	}
}