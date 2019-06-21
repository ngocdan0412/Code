package Test;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJComboBox extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel pnN;
	private JComboBox<String> showColor;
	private JPanel pnC;
	private CardLayout cd;
	private JPanel yellow;
	private JPanel green;
	private JPanel red;
	
	public MyJComboBox() {
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		initScreen();
	}
	
	private void initScreen() {
		pnN = new JPanel();
		pnN.setPreferredSize(new Dimension(Integer.MAX_VALUE, 30));
		pnN.setBorder(BorderFactory.createEmptyBorder(-5, -5, -5, -5));
		
		showColor = new JComboBox<String>();
		showColor.addItem("Vàng");
		showColor.addItem("Xanh");
		showColor.addItem("Đỏ");
		
		showColor.addActionListener(hd);
		showColor.setPreferredSize(new Dimension(380, 29));
		
		pnN.add(showColor);
		
		pnC = new JPanel();
		cd = new CardLayout();
		pnC.setLayout(cd);
		
		yellow = new JPanel();
		yellow.setBackground(Color.YELLOW);
		green = new JPanel();
		green.setBackground(Color.GREEN);
		red = new JPanel();
		red.setBackground(Color.RED);
		
		pnC.add(yellow, "vang");
		pnC.add(green, "xanh");
		pnC.add(red, "do");
		
		this.add(pnN, BorderLayout.NORTH);
		this.add(pnC, BorderLayout.CENTER);
	}
	
	private ActionListener hd = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object action = e.getSource();
			if(action == showColor) {
				if(showColor.getSelectedIndex() == 0) {
					cd.show(pnC, "vang");
				}else if(showColor.getSelectedIndex() == 1) {
					cd.show(pnC, "xanh");
				}else if(showColor.getSelectedIndex() == 2) {
					cd.show(pnC, "do");
				}
			}
		}
	};
	
	public static void main(String[] args) {
		MyJComboBox ui = new MyJComboBox();
		ui.setVisible(true);
	}
}