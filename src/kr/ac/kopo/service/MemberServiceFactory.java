package kr.ac.kopo.service;

public class MemberServiceFactory {

	private static MemberService memberservice;
	
	public static MemberService getInstance() {
		
		if(memberservice == null) {
			memberservice = new MemberService();
		}
		return memberservice;
	}
	
	
	
	

}
