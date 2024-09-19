package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.EmailService;
import kr.ac.kopo.service.EmailServiceFactory;
import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.service.MemberServiceFactory;

public abstract class BaseUI implements IEmailUI {

	private Scanner sc;
	protected MemberService memberservice;
	protected EmailService emailservice;

	public BaseUI() {
		sc = new Scanner(System.in);
		memberservice = MemberServiceFactory.getInstance();
		emailservice = EmailServiceFactory.getInstance();
	}

	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));
	}
}
