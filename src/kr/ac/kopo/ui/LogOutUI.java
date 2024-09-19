package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class LogOutUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		MemberVO.mem = null;
		System.out.println("로그아웃되었습니다.\n");
		new StartUI().execute();
	}

}
