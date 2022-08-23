package oop.message;

public class MessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SMSSender obj1 = new SMSSender("생일을 축하합니다", "고객센터","010-2314-1241", "10%쿠폰발송");
		EmailSender obj2 = new EmailSender("생일을 축하합니다", "고객센터", "patmat1004@naver.com", "10%쿠폰발송");
		
		obj1.sendMessage("010-3243-3462");
		obj2.sendMessage("patmat1004@naver.com");
		obj1.sendMessage("010-3242-2632");
		MessageSender_abs m = new MessageSender_abs("","") {
			@Override
			void sendMessage(String rec) {
				System.out.println("sdf");
			}

		};


	}

}
