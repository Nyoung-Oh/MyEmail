package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.EmailVO;

public class DeleteMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		int no = scanInt("������ �̸��� ��ȣ : ");
		
		emailservice.delete(no);

		System.out.println("[ " + no + " ]�� ������ �����Ǿ����ϴ�.");
	}
}
