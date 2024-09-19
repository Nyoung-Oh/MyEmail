package kr.ac.kopo.ui;

import kr.ac.kopo.vo.EmailVO;
import kr.ac.kopo.vo.MemberVO;

public class SendMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		
		System.out.println("<<< ���� ������ >>>");
		String receivedname = scanStr("�޴� ��� : ");
		String title = scanStr("���� : ");
		String contents = scanStr("���� : ");
	
		EmailVO email = new EmailVO();
		email.setSendname(MemberVO.mem.getId());
		email.setReceivedname(receivedname);
		email.setTitle(title);
		email.setContents(contents);
		emailservice.sendEmail(email);
		
		System.out.println("\n������ ���۵Ǿ����ϴ�.\n");
	}
}