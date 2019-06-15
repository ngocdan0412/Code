package Test.TabbedPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CreatePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jPanel1;
	private final JButton tabBTN;

	public CreatePanel(ActionListener t) {
		jPanel1 = new JPanel();
		jPanel1.setLayout(null);
		jPanel1.setBorder(BorderFactory.createBevelBorder(1, Color.lightGray, Color.lightGray));
		jPanel1.setPreferredSize(new Dimension(850, 300));
		jPanel1.setBackground(Color.green);
		add(jPanel1);

		// add button for tabs
		tabBTN = new JButton("Press for Tab");
		tabBTN.setBounds(400, 100, 150, 30);
		tabBTN.addActionListener(t);
		jPanel1.add(tabBTN);
	}// end constructor
}// end class
