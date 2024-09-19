package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.EmailVO;

public class DeleteMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		int no = scanInt("삭제할 이메일 번호 : ");
		
		emailservice.delete(no);

		System.out.println("[ " + no + " ]번 메일이 삭제되었습니다.");
	}
}
