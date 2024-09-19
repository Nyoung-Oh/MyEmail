package kr.ac.kopo.ui;

public class ExitUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("-----------------------");
		System.out.println(" 이메일 서비스를 종료합니다!");
		System.out.println("-----------------------");
		System.exit(0);
	}

}
