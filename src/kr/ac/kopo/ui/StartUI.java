package kr.ac.kopo.ui;

public class StartUI extends BaseUI {
	
	private int choiceMenu() {
		System.out.println("****** E-mail ******");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("0. 종료");
		int type = scanInt("항목을 선택하세요 : ");
		return type;

	}

	@Override
	public void execute() throws Exception {

		while (true) {

			IEmailUI ui = null;
			
			int type = choiceMenu();

			switch (type) {
			
			case 1:
				ui = new LogInUI();
				break;

			case 2:
				ui = new AddUI();
				break;

			case 0:
				ui = new ExitUI();
			}
		
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
