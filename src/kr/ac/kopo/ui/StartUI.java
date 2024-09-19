package kr.ac.kopo.ui;

public class StartUI extends BaseUI {
	
	private int choiceMenu() {
		System.out.println("****** E-mail ******");
		System.out.println("1. �α���");
		System.out.println("2. ȸ������");
		System.out.println("0. ����");
		int type = scanInt("�׸��� �����ϼ��� : ");
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
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
}
