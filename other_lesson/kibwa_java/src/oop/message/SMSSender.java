package oop.message;

public class SMSSender extends MessageSender_abs {
	String senderPhoneno,message;
	public SMSSender(String title, String senderName,String senderPhoneno,String message) {
		super(title, senderName);
		// TODO Auto-generated constructor stub
		this.senderPhoneno = senderPhoneno;
		this.message =message;
	}

	void sendMessage(String rec) {
		System.out.println("----------------");
		System.out.println("제목 : "+title);
		System.out.println("보내는 사람 :"+senderName);
		System.out.println("전화번호 : "+rec);
		System.out.println("회신번호 : "+senderPhoneno );
		System.out.println("메세지 : "+message);
	}
}
