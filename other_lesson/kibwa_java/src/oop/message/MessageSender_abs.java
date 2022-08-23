package oop.message;

abstract class MessageSender_abs {
	String title,senderName;
	
	public MessageSender_abs(String title, String senderName) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.senderName = senderName;
	}
	
	abstract void sendMessage(String rec);
}
