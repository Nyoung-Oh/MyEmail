package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.EmailVO;

public class SendAllMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		List<EmailVO> list = emailservice.sendAllEmail();

		System.out.println("==================================================================================");
		System.out.println("\t\t\t\t[ ���� ������ ]");
		System.out.println("==================================================================================");
		System.out.println("��ȣ\t���� ��¥\t\t\t�޴� ���\t����\t\t����");
		System.out.println("==================================================================================");
		if (list.isEmpty()) {
			System.out.println("���� �������� ����ֽ��ϴ�.\n");
		} else {
			for (EmailVO email : list) {
				System.out.println(email.getNo() + "\t" + email.getReg_date() + "\t" + email.getReceivedname() + "\t"
						+ email.getTitle() + "\t" + email.getContents());
			}
		}
	}
}
