import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Main extends JPanel implements KeyListener {
	static int height=900;
	static int width=1800;
	
	int drops=1000;
	
	drop rain[] =new drop[drops];	
		
	
	public Main() {
		setSize(800, height);
		setPreferredSize(new Dimension(800, height));
		setFocusable(true);
		
		for(int i=0;i<drops;i++) {
			rain[i]=new drop();
		}

	}
	
	public void update(Graphics g) {
		paint(g);
	}
	 public void paint(Graphics g) {
		 
		 g.setColor(Color.BLACK);
		 g.fillRect(0, 0, width, height);
		 
		 for(int i=0;i<drops;i++) {
			 rain[i].draw(g);
			 rain[i].fall();
		 }
		 
		 try {
			Slow.pause(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 g.dispose();
		 repaint();
	 }
	 
		@Override
		public void keyPressed(KeyEvent e) {
			int c = e.getKeyCode();
			
			if (c == KeyEvent.VK_A) {
				
			}
			if (c == KeyEvent.VK_D) {

			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			int c = e.getKeyCode();

		}
		
		@Override
		public void keyTyped(KeyEvent arg0) {
		
		}
	
	public static void main(String[] args) {
		Main game=new Main();
		
		JFrame frame = new JFrame();
		frame.add(game);
		frame.pack();
		frame.setBackground(Color.BLACK);
		frame.setResizable(true);
		frame.setTitle("Dodge the Rectangles");
		frame.setSize(new Dimension(800, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	
}
