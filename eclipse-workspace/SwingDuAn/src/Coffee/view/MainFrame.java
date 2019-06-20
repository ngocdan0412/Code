package Coffee.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Coffee.view.component.BottomPanel;
import Coffee.view.component.CenterPanel;
import Coffee.view.component.TopPanel;
import Coffee.view.component.detail.ResetPassword;
import Coffee.view.component.detail.DanhMuc;
import Coffee.view.tabpanel.TabKhachHang;
import Coffee.view.tabpanel.TabNhanVien;
import Coffee.view.tabpanel.TabSanPham;
import Coffee.view.tabpanel.TabThuNgan;

public class MainFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	private ActionButton actionButton;
	private TopPanel topPanel;
	private CenterPanel centerPanel;
	private BottomPanel bottomPanel;
	
	public MainFrame() {
		super("DỰ ÁN FT COFFEE");
		setSize(1200, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		ImageIcon img = new ImageIcon("src\\Coffee\\img\\cafe4.png");
		setIconImage(img.getImage());
		initScreen();
	}

	private void initScreen() {
//		actionButton = new ActionButton(MainFrame.this, topPanel, centerPanel, bottomPanel);
		
		topPanel = new TopPanel();
		topPanel.getHeThongPanel().getDanhMuc().addActionListener(hd);
		topPanel.getHeThongPanel().getTuyChon().addActionListener(hd);
		topPanel.getHeThongPanel().getSanPham().addActionListener(hd);
		topPanel.getHeThongPanel().getKhachHang().addActionListener(hd);
		topPanel.getHeThongPanel().getNhanVien().addActionListener(hd);
		topPanel.getHeThongPanel().getMatKhau().addActionListener(hd);

		centerPanel = new CenterPanel();
		centerPanel.add("Thu Ngân", new TabThuNgan());

		bottomPanel = new BottomPanel();

		Container con = getContentPane();
		con.add(topPanel, BorderLayout.NORTH);
		con.add(centerPanel, BorderLayout.CENTER);
		con.add(bottomPanel, BorderLayout.SOUTH);
	}

	private ActionListener hd = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object action = e.getSource();
			if(action == topPanel.getHeThongPanel().getDanhMuc()) {
				DanhMuc ui = new DanhMuc();
				ui.setVisible(true);
			}else if(action == topPanel.getHeThongPanel().getSanPham()) {
				centerPanel.addTab("Sản Phẩm", new TabSanPham());
			}else if(action == topPanel.getHeThongPanel().getKhachHang()) {
				centerPanel.addTab("Khách hàng", new TabKhachHang());
			}else if(action == topPanel.getHeThongPanel().getNhanVien()) {
				centerPanel.add("Nhân Viên", new TabNhanVien());
			}else if(action == topPanel.getHeThongPanel().getMatKhau()) {
				LoadResetPassword();
				setEnabled(false);
			}
		}
	};
	protected void LoadResetPassword() {
		ResetPassword ui = new ResetPassword(MainFrame.this);
		ui.setVisible(true);
	}
	
	/**
	 * Test Run!!!
	 */
	public static void main(String[] args) {
		MainFrame ui = new MainFrame();
		ui.setVisible(true);
	}

}

