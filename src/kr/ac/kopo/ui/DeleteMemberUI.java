package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class DeleteMemberUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("\t  È¸¿ø Å»Åð");
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("¾ÆÀÌµð : "+ MemberVO.mem.getId());
		int no = scanInt("\nÅ»ÅðÇÏ½Ã°Ú½À´Ï±î? : 1.³× 2.µÚ·Î°¡±â");
	
		switch(no) {		
		case 1 : 
		memberservice.deleteMember(MemberVO.mem);
		System.out.println("\nÅ»ÅðµÇ¾ú½À´Ï´Ù.\n");
		new StartUI().execute();
		
		case 2: 
			new MainUI().execute();
		}
	}
}
