package kr.ac.kopo.main;

import kr.ac.kopo.ui.StartUI;

public class EmailMain {

	public static void main(String[] args) {
		
		StartUI ui = new StartUI();
		
		try {
		ui.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
