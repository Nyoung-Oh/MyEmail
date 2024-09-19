package kr.ac.kopo.ui;

public class MainUI extends BaseUI {
	
	private int choiceMenu() {
		System.out.println("=========================================");
		System.out.println("\t\t����");
		System.out.println("=========================================");
		System.out.println("1. ���� ������");
		System.out.println("2. ���� ������");
		System.out.println("3. ���� ������");
		System.out.println("4. ���� ���� �����ϱ�");
		System.out.println("5. �α׾ƿ�");
		System.out.println("6. ȸ�� Ż��");
		System.out.println("7. ���� ����");
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
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
}
