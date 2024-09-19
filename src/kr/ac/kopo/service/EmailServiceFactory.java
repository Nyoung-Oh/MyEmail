package kr.ac.kopo.service;

public class EmailServiceFactory {

	private static EmailService emailservice;
	
	public static EmailService getInstance() {
		
		if(emailservice == null) {
			emailservice = new EmailService();
		}
		return emailservice;
	}
	
	
	
	

}
