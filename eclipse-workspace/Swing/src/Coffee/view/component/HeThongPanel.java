package Coffee.view.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Coffee.view.component.detail.ResetPassword;

public class HeThongPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HeThongPanel() {
		setBackground(Color.ORANGE);
		pnHT();
	}

	public void pnHT() {
		JButton danhMuc = new JButton();
		createBT(danhMuc, "Danh mục", "src\\Coffee\\img\\HT1.png");
		
		JButton tuyChon = new JButton();
		createBT(tuyChon, "Tùy chọn", "src\\Coffee\\img\\HT2.png");
		
		JButton sanPham = new JButton();
		createBT(sanPham, "Sản phẩm", "src\\Coffee\\img\\HT3.png");
		
		JButton khachHang = new JButton();
		createBT(khachHang, "Khách hàng", "src\\Coffee\\img\\HT4.png");
		
		JButton nhanVien = new JButton();
		createBT(nhanVien, "Nhân viên", "src\\Coffee\\img\\HT5.png");
		
		JButton matkhau = new JButton();
		createBT(matkhau, "Mật khẩu", "src\\Coffee\\img\\HT6.png");
		
		JButton ketThuc = new JButton();
		createBT(ketThuc, "Kết thúc", "src\\Coffee\\img\\HT7.png");

		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(danhMuc);
		this.add(tuyChon);
		this.add(sanPham);
		this.add(khachHang);
		this.add(nhanVien);
		this.add(matkhau);
		this.add(ketThuc);
		
		matkhau.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LoadResetPassword();
			}
		});
		ketThuc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	protected void LoadResetPassword() {
		ResetPassword ui = new ResetPassword();
		ui.setVisible(true);
	}

	private void createBT(JButton bt, String name, String img) {
		ImageIcon anh = new ImageIcon(img);
		Image image = anh.getImage();
		Image newimg = image.getScaledInstance(50, 50,  Image.SCALE_SMOOTH);
		anh = new ImageIcon(newimg); 
		bt.setIcon(anh);
		bt.setText(name);
		bt.setFont(new Font("", Font.BOLD, 15));
		bt.setHorizontalTextPosition(SwingConstants.CENTER);
		bt.setVerticalTextPosition(SwingConstants.BOTTOM);
//		bt.setBackground(Color.LIGHT_GRAY);
	}
}
