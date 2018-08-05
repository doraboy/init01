package tw.org.iii.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	public MyPanel() {
		System.out.println("MyPanel()");
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				//滑鼠按下去,重畫紅色圓
				System.out.println(e.getX());
				System.out.println(e.getY());
				repaint();
				
			}
		});
	}

	
	
	//作業:滑鼠點哪裡,紅圈中心出現哪裡
	//但自己練習寫個MouseListener
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		System.out.println("paint");
	}
	
	@Override
	protected void paintComponent(Graphics g) {//這個component因為有生命週期,故為自動呼叫
		super.paintComponent(g);
		System.out.println("paintComponent");
		Graphics2D g2d = (Graphics2D)g;//此物件實體被自動創造,一定存在
		g2d.setColor(Color.red);
		g2d.fillOval(0, (int)(Math.random()*400), 80, 80);
		
	}	
}


