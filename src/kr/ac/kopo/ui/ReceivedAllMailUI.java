package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.EmailVO;

public class ReceivedAllMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		List<EmailVO> list = emailservice.receivedAllEmail();
		
		System.out.println("==================================================================================");
		System.out.println("\t\t\t\t[ 받은 메일함 ]");
		System.out.println("==================================================================================");
		System.out.println("번호\t받은 날짜\t\t\t보낸 사람\t제목\t\t내용");
		System.out.println("==================================================================================");
		if(list.isEmpty()) {
			System.out.println("받은 메일함이 비어있습니다.\n");
		} else {
			for(EmailVO email : list) {
				System.out.println(email.getNo()+ "\t" + email.getReg_date() + "\t" + email.getSendname() + "\t" + email.getTitle() + "\t" + email.getContents() );
			}
		}
	}
}
