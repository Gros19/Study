package oop.message;

public class EmailSender extends MessageSender_abs {
	String sendMessage,message;
	public EmailSender(String title, String senderName,String sendMessage,String message) {
		super(title, senderName);
		// TODO Auto-generated constructor stub
		this.sendMessage = sendMessage;
		this.message = message;
	}
	
	void sendMessage(String rec) {
		System.out.println("----------------");
		System.out.println("제목 : "+title);
		System.out.println("보내는 사람 :"+senderName);
		System.out.println("전화번호 : "+rec);
		System.out.println("수신자 이메일 주소 : "+sendMessage );
		System.out.println("메세지 : "+message);
	}

}
