package kr.ac.kopo.vo;

public class EmailVO {

	private int    no;
	private String title;
	private String sendname;
	private String receivedname;
	private String reg_date;
	private String contents;

	public EmailVO() {
		super();
	}

	public EmailVO(int no, String reg_date, String title, String sendname, String receivedname, String contents) {
		super();
		this.no = no;
		this.title = title;
		this.sendname = sendname;
		this.receivedname = receivedname;
		this.reg_date = reg_date;
		this.contents = contents;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSendname() {
		return sendname;
	}

	public void setSendname(String sendname) {
		this.sendname = sendname;
	}

	public String getReceivedname() {
		return receivedname;
	}

	public void setReceivedname(String receivedname) {
		this.receivedname = receivedname;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setRegDate(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "EmailVO [no=" + no + ", title=" + title + ", sendname=" + sendname + ", receivedname=" + receivedname
				+ ", reg_date=" + reg_date + ", contents=" + contents + "]";
	}


}