package Test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class run {

	public static void main(String[] a) {
		JFrame frame = new JFrame("Empty Borders");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel ts = new JPanel();
		ts.setBackground(Color.PINK);
		Border emptyBorder = BorderFactory.createEmptyBorder(-5, 0, 0, 0);
		JButton emptyButton = new JButton("With Empty");

//		ts.setBorder(emptyBorder);
//		ts.setBorder(new EmptyBorder(-5, 0, 0, 0));
		// emptyButton.setBorder(emptyBorder);
		ts.add(emptyButton);
		JButton nonemptyButton = new JButton("Without Empty");

		Container contentPane = frame.getContentPane();

//		JPanel p = new JPanel();
//		GridBagLayout layout = new GridBagLayout();
//		p.setLayout(layout);
//		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.fill = GridBagConstraints.HORIZONTAL;
//		gbc.gridx = 0;
//		gbc.gridy = 0;
//		p.add("", gbc);

		// contentPane.add(emptyButton, BorderLayout.NORTH);
		contentPane.add(ts, BorderLayout.NORTH);
		contentPane.add(nonemptyButton, BorderLayout.SOUTH);

		frame.pack();
		frame.setSize(300, frame.getHeight());
		frame.setVisible(true);
	}

}
