package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class LogOutUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		MemberVO.mem = null;
		System.out.println("�α׾ƿ��Ǿ����ϴ�.\n");
		new StartUI().execute();
	}

}
