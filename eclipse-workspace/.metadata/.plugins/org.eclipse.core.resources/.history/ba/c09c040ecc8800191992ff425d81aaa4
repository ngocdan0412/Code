package ft.coffee.view;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import ft.coffee.view.component.panel.FooterPanel;
import ft.coffee.view.component.panel.HeaderPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private HeaderPanel header;
	private JTabbedPane contentPanel;
	private FooterPanel footer;
	

	public MainFrame() {
		super("quan ly ca phe");
		this.setSize(900, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		initScreen();
	}

	private void initScreen() {
		// Border border = BorderFactory.createLineBorder(Color.RED, 1);
		header = new HeaderPanel();
		header.showCardWithName(HeaderPanel.CARD_HE_THONG);
		contentPanel = new JTabbedPane();
		contentPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1000));
		footer = new FooterPanel();

		Container container = getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.add(header);
		container.add(contentPanel);
		container.add(footer);
	}
	
//	public static void main(String[] args) {
//		MainFrame ui = new MainFrame();
//		ui.setVisible(true);
//	}
}
