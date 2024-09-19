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
	
//받은 메일함
	public List<EmailVO> receivedAllEmail() throws Exception{
		return emaildao.receivedAllEmail();
	}

//보낸 메일함
	public List<EmailVO> sendAllEmail() throws Exception{
		return emaildao.sendAllEmail();
	}
	
//메일 보내기
	public void sendEmail(EmailVO email) {
		emaildao.insertSend(email);
		emaildao.insertReceived(email);
	}
	
//받은 메일 번호로 휴지통 이동
	public void delete(int no) {
		EmailVO email = emaildao.deleteEmail(no);
	}

}
