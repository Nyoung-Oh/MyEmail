package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.EmailVO;

public class SendAllMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		List<EmailVO> list = emailservice.sendAllEmail();

		System.out.println("==================================================================================");
		System.out.println("\t\t\t\t[ 보낸 메일함 ]");
		System.out.println("==================================================================================");
		System.out.println("번호\t보낸 날짜\t\t\t받는 사람\t제목\t\t내용");
		System.out.println("==================================================================================");
		if (list.isEmpty()) {
			System.out.println("보낸 메일함이 비어있습니다.\n");
		} else {
			for (EmailVO email : list) {
				System.out.println(email.getNo() + "\t" + email.getReg_date() + "\t" + email.getReceivedname() + "\t"
						+ email.getTitle() + "\t" + email.getContents());
			}
		}
	}
}
