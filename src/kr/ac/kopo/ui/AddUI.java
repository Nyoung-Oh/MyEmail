package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class AddUI extends BaseUI{
 
	@Override
	public void execute() throws Exception{
		
		System.out.println("    <<< ȸ������ >>>");
		System.out.println("<<< ���� ������ �Է��ϼ��� >>>");
		String id = scanStr("���̵� : ");
		String password = scanStr("��й�ȣ : ");
		String name = scanStr("�̸� : ");
		String phone = scanStr("�ڵ��� ��ȣ : ");
	
		MemberVO mem = new MemberVO();
		mem.setId(id);
		mem.setPassword(password);
		mem.setName(name);
		mem.setPhone(phone);
		memberservice.addMember(mem);
		
		System.out.println("\nȸ�������� �Ϸ��Ͽ����ϴ�!\n");
		
	}
}