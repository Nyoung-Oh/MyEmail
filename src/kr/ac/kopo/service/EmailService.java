package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dao.EmailDAO;
//import kr.ac.kopo.vo.BoardVO;
import kr.ac.kopo.vo.EmailVO;

public class EmailService {

	private EmailDAO emaildao;
	
	public EmailService() {
		emaildao = new EmailDAO();
	}
	
//���� ������
	public List<EmailVO> receivedAllEmail() throws Exception{
		return emaildao.receivedAllEmail();
	}

//���� ������
	public List<EmailVO> sendAllEmail() throws Exception{
		return emaildao.sendAllEmail();
	}
	
//���� ������
	public void sendEmail(EmailVO email) {
		emaildao.insertSend(email);
		emaildao.insertReceived(email);
	}
	
//���� ���� ��ȣ�� ������ �̵�
	public void delete(int no) {
		EmailVO email = emaildao.deleteEmail(no);
	}

}
