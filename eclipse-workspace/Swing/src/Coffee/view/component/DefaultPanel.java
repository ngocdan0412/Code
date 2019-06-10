package Coffee.view.component;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DefaultPanel extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DefaultPanel() {
		super("DỰ ÁN FT COFFEE");
		setSize(1200, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		ImageIcon img = new ImageIcon("src\\Coffee\\img\\cafe4.png");
		setIconImage(img.getImage());
		pnNorth();
	}

	public void pnNorth() {
		TopPanel topPanel = new TopPanel();
		CenterPanel centerPanel = new CenterPanel();

//		JTabbedPane tabbedPane = new JTabbedPane();
//		tabbedPane.setMaximumSize(new Dimension(Integer.MAX_VALUE, 800));
//		JPanel panel1 = new JPanel();
//		tabbedPane.addTab("Tab 1", null, panel1, "Show tab 1");
//		JPanel panel2 = new JPanel();
//		tabbedPane.addTab("Tab 2", null, panel2, "Show tab 2");
//		JPanel panel3 = new JPanel();
//		tabbedPane.addTab("Tab 3", null, panel3, "Show tab 3");
//		JPanel panel4 = new JPanel();
//		tabbedPane.addTab("Tab 4", null, panel4, "Show tab 4");

		BottomPanel bottomPanel = new BottomPanel();

		Container con = getContentPane();
		con.add(topPanel, BorderLayout.NORTH);
		con.add(centerPanel, BorderLayout.CENTER);
		con.add(bottomPanel, BorderLayout.SOUTH);
	}

	/**
	 * Test Run!!!
	 */
	public static void main(String[] args) {
		DefaultPanel ui = new DefaultPanel();
		ui.setVisible(true);
	}
}
