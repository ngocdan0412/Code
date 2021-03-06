package Test.TabbedPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class MainGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jPanelLeft;
	private JPanel jPanelRight;
	private JButton callPanelBtn;
	private JTabbedPane tab;

	public MainGUI() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1280, 600); // set frame size
		this.setVisible(true); // display frame
		this.setTitle("Tab Example");

		setLayout(new BorderLayout()); // layout manager
		jPanelLeft = new JPanel();
		jPanelLeft.setLayout(null);
		jPanelLeft.setPreferredSize(new Dimension(400, 800)); // to set the size of the left panel
		jPanelLeft.setBackground(Color.blue);
		this.add(jPanelLeft, BorderLayout.WEST);

		callPanelBtn = new JButton("Call a jPanel");
		callPanelBtn.addActionListener(btn);
		callPanelBtn.setBounds(150, 200, 150, 40);
		jPanelLeft.add(callPanelBtn);

		jPanelRight = new JPanel();
		jPanelRight.setBorder(new EmptyBorder(0, 0, 0, 0));
		jPanelRight.setLayout(new GridLayout(0, 1));
		this.add(jPanelRight);

		tab = new CloseButtonTabbedPane();

	}// endd constructor

	ActionListener btn = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent ae) {

			if (ae.getActionCommand() == "Call a jPanel") {
				jPanelRight.add(new CreatePanel(t));
				jPanelRight.revalidate();

			}
		}

	};

	// Actionlistener for CreatePanel
	ActionListener t = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent ae) {

			if (tab.getTabCount() <= 8) {

				// if no tabs make main tab
				if (tab.getTabCount() == 0) {

					tab.addTab("Main Content", jPanelRight); // name for listener not to close
					add(tab);
					revalidate();
					repaint();
				}

				if (tab.getTabCount() > 0) {
					JPanel newJPanel = new JPanel();
					tab.addTab("new ", newJPanel);

					tab.setSelectedIndex(tab.getTabCount() - 1);
				}
			}

		}

	};

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				new MainGUI();
			}

		});

	} // end main

}// end class
