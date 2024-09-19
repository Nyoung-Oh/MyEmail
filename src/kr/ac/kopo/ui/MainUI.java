package kr.ac.kopo.ui;

public class MainUI extends BaseUI {
	
	private int choiceMenu() {
		System.out.println("=========================================");
		System.out.println("\t\t메인");
		System.out.println("=========================================");
		System.out.println("1. 받은 메일함");
		System.out.println("2. 보낸 메일함");
		System.out.println("3. 메일 보내기");
		System.out.println("4. 받은 메일 삭제하기");
		System.out.println("5. 로그아웃");
		System.out.println("6. 회원 탈퇴");
		System.out.println("7. 서비스 종료");
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
				ui = new ReceivedAllMailUI();
				break;
			case 2:
				ui = new SendAllMailUI();
				break;
			case 3:
				ui = new SendMailUI();
				break;
			case 4:
				ui = new DeleteMailUI();
				break;
			case 5:
				ui = new LogOutUI();
				break;
			case 6:
				ui = new DeleteMemberUI();
				break;
			case 7:
				ui = new ExitUI();
				break;
			}
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
