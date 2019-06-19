package Coffee.view.tabpanel;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TabKhachHang extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TabKhachHang() {
		setLayout(new BorderLayout());
		initScreen();
	}
	
	private void initScreen() {
		JScrollPane pnTabKH = new JScrollPane();
		this.add(pnTabKH, BorderLayout.CENTER);
	}
}
