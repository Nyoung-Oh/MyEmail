package kr.ac.kopo.ui;

import kr.ac.kopo.vo.EmailVO;
import kr.ac.kopo.vo.MemberVO;

public class SendMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		
		System.out.println("<<< 메일 보내기 >>>");
		String receivedname = scanStr("받는 사람 : ");
		String title = scanStr("제목 : ");
		String contents = scanStr("내용 : ");
	
		EmailVO email = new EmailVO();
		email.setSendname(MemberVO.mem.getId());
		email.setReceivedname(receivedname);
		email.setTitle(title);
		email.setContents(contents);
		emailservice.sendEmail(email);
		
		System.out.println("\n메일이 전송되었습니다.\n");
	}
}