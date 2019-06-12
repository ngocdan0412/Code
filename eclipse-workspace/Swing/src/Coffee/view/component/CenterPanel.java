package Coffee.view.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class CenterPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CenterPanel() {
		setMaximumSize(new Dimension(Integer.MAX_VALUE, 800));
		setBackground(new Color(235, 113, 83));
		tableTab();
	}
	public void tableTab() {
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBackground(new Color(189, 107, 9));
		tabbedPane.setSize(300, 800);
		tabbedPane.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
		
//		JPanel panel1 = new JPanel();
//		tabbedPane.addTab("Tab 1", null, panel1, "Show tab 1");
//		JPanel panel2 = new JPanel();
//		tabbedPane.addTab("Tab 2", null, panel2, "Show tab 2");
//		JPanel panel3 = new JPanel();
//		tabbedPane.addTab("Tab 3", null, panel3, "Show tab 3");
//		JPanel panel4 = new JPanel();
//		tabbedPane.addTab("Tab 4", null, panel4, "Show tab 4");
		
		this.setLayout(new BorderLayout());
		this.add(tabbedPane, BorderLayout.WEST);
		
	}
}
