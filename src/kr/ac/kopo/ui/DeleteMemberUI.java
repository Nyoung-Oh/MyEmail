package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class DeleteMemberUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("\t  ȸ�� Ż��");
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("���̵� : "+ MemberVO.mem.getId());
		int no = scanInt("\nŻ���Ͻðڽ��ϱ�? : 1.�� 2.�ڷΰ���");
	
		switch(no) {		
		case 1 : 
		memberservice.deleteMember(MemberVO.mem);
		System.out.println("\nŻ��Ǿ����ϴ�.\n");
		new StartUI().execute();
		
		case 2: 
			new MainUI().execute();
		}
	}
}
