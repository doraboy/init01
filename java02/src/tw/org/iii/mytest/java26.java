package tw.org.iii.mytest;

import javax.swing.JFrame;

public class java26 extends JFrame{
	public java26() {
		setSize(640, 480);//父父類別window所擁有
		setVisible(true);//父父類別window所擁有
		setDefaultCloseOperation(EXIT_ON_CLOSE);//父類別所JFrame擁有
	}
	
	public static void main(String[] args) {
		new java26();

	}

}
