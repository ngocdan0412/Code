package ft.coffee.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import ft.coffee.view.component.jtabbedpane.TabContentPanel;
import ft.coffee.view.component.panel.FooterPanel;
import ft.coffee.view.component.panel.HeaderPanel;
import ft.coffee.view.component.panel.ThuNganContentPanel;
import ft.coffee.view.component.panel.ToolHeThongPanel;

public class MainFrame2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private HeaderPanel header;
	private TabContentPanel contentPanel;
	private FooterPanel footer;

	public MainFrame2() {
		super("quan ly ca phe");
		this.setSize(900, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		initScreen();
	}

	private void initScreen() {
		// Border border = BorderFactory.createLineBorder(Color.RED, 1);
		header = new HeaderPanel();
		header.getCardHeThong().getBtnDanhMuc().addActionListener(headerListener);
		header.getCardHeThong().getBtnSanPham().addActionListener(headerListener);
		header.getCardHeThong().getBtnMatKhau().addActionListener(headerListener);

		contentPanel = new TabContentPanel();
		contentPanel.add("Thu ngân", new ThuNganContentPanel());

		footer = new FooterPanel();

		Container container = getContentPane();
		container.add(header, BorderLayout.NORTH);
		container.add(contentPanel, BorderLayout.CENTER);
		container.add(footer, BorderLayout.SOUTH);

	}

	private ActionListener headerListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			Object action = e.getSource();
			if (action == header.getCardHeThong().getBtnDanhMuc()) {
				System.out.println("button danh muc");
			} else if (action == header.getCardHeThong().getBtnSanPham()) {
				contentPanel.addTab("Sản phẩm", new ToolHeThongPanel());
			} else if (action == header.getCardHeThong().getBtnMatKhau()) {
				ChangePasswordFrame changePasswordFrame = new ChangePasswordFrame(MainFrame2.this);
				changePasswordFrame.setVisible(true);
				setEnabled(false);
			}
		}
	};

	public static void main(String[] args) {
		MainFrame2 ui = new MainFrame2();
		ui.setVisible(true);
	}
}
