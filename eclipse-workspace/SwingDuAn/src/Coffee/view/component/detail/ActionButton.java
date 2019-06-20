package Coffee.view.component.detail;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Coffee.view.component.BottomPanel;
import Coffee.view.component.CenterPanel;
import Coffee.view.component.TopPanel;
import Coffee.view.tabpanel.TabKhachHang;
import Coffee.view.tabpanel.TabNhanVien;
import Coffee.view.tabpanel.TabSanPham;

public class ActionButton {

	private TopPanel topPanel;
	private CenterPanel centerPanel;
	private BottomPanel bottomPanel;
	
	private ActionListener hd;
	private JFrame frame;
//	private JPanel top;
//	private CenterPanel center;
//	private JPanel bottom;
	
	public ActionListener getHd() {
		return hd;
	}
	
	public ActionButton(JFrame frame, TopPanel topPanel, CenterPanel centerPanel, BottomPanel bottomPanel) {
		this.frame = frame;
		this.topPanel = topPanel;
		this.centerPanel = centerPanel;
		this.bottomPanel = bottomPanel;
		actionBT();
	}
	
	private void actionBT() {
//		System.out.println(mainFrame.getTopPanel());
//		topPanel.getHeThongPanel().getMatKhau().addActionListener(hd);
//		topPanel.getHeThongPanel().getSanPham().addActionListener(hd);
//		topPanel.getHeThongPanel().getKhachHang().addActionListener(hd);
//		topPanel.getHeThongPanel().getNhanVien().addActionListener(hd);
		
//		centerPanel.add("Thu Ngân", new TabThuNgan());
		
		hd = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object action = e.getSource();
				if(action == topPanel.getHeThongPanel().getMatKhau()) {
					LoadResetPassword();
					frame.setEnabled(false);
				}else if(action == topPanel.getHeThongPanel().getSanPham()) {
					centerPanel.addTab("Sản Phẩm", new TabSanPham());
				}else if(action == topPanel.getHeThongPanel().getKhachHang()) {
					centerPanel.addTab("Khách hàng", new TabKhachHang());
				}else if(action == topPanel.getHeThongPanel().getNhanVien()) {
					centerPanel.add("Nhân Viên", new TabNhanVien());
				}
				
			}
		};
	}

	protected void LoadResetPassword() {
		ResetPassword ui = new ResetPassword(frame);
		ui.setVisible(true);
	}
}
