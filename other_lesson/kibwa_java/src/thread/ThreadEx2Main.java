package thread;

import javax.swing.JOptionPane;

public class ThreadEx2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx2 th = new ThreadEx2();
		th.start();
		
		String input = JOptionPane.showInputDialog("아무거나입력 ->");
		System.out.println("입력한 값은 " + input + "입니다.");
	}

}
