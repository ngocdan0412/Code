package Test;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;


public class run2 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public run2() {
		setSize(1200, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		chay();
	}

	private void chay() {
		JButton addBtn = new JButton("+");
		// addBtn.setBounds(x_pos, y_pos, 30, 25);
		addBtn.setBorder(new RoundedBorder(10)); // 10 is the radius
		addBtn.setForeground(Color.BLUE);
		this.add(addBtn);
	}

	
	public static void main(String[] args) {
		run2 ui = new run2();
		ui.setVisible(true);
	}
	
	
//	private static class RoundedBorder implements Border {
//
//		private int radius;
//
//		RoundedBorder(int radius) {
//			this.radius = radius;
//		}
//
//		public Insets getBorderInsets(Component c) {
//			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
//		}
//
//		public boolean isBorderOpaque() {
//			return true;
//		}
//
//		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
//			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
//		}
//	}

	
}
