package Coffee.view.component;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Coffee.view.tabpanel.TabThuNgan;

public class CenterPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TabThuNgan tabThuNgan;
	
	public CenterPanel() {
		setMaximumSize(new Dimension(Integer.MAX_VALUE, 800));
		tableTab();
	}

	public void tableTab() {
		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabThuNgan = new TabThuNgan();
		tabbedPane.addTab("Thu ngân", null, tabThuNgan, "Show Thu Ngân");

		this.setLayout(new BorderLayout());
		this.add(tabbedPane);
	}
}
