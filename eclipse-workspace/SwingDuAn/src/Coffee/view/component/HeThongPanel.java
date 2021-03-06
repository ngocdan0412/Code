package Coffee.view.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class HeThongPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton danhMuc;
	private JButton tuyChon;
	private JButton sanPham;
	private JButton khachHang;
	private JButton nhanVien;
	private JButton matKhau;
	private JButton ketThuc;
	
	public JButton getDanhMuc() {
		return danhMuc;
	}
	public JButton getTuyChon() {
		return tuyChon;
	}
	public JButton getSanPham() {
		return sanPham;
	}
	public JButton getKhachHang() {
		return khachHang;
	}
	public JButton getNhanVien() {
		return nhanVien;
	}
	public JButton getMatKhau() {
		return matKhau;
	}
	
	public HeThongPanel() {
		setBackground(new Color(202, 229, 232));
		initScreen();
	}

	private void initScreen() {
		danhMuc = new JButton();
		createBT(danhMuc, "Danh mục", "src\\Coffee\\img\\HT1.png");
		
		tuyChon = new JButton();
		createBT(tuyChon, "Tùy chọn", "src\\Coffee\\img\\HT2.png");
		
		sanPham = new JButton();
		createBT(sanPham, "Sản phẩm", "src\\Coffee\\img\\HT3.png");
		
		khachHang = new JButton();
		createBT(khachHang, "Khách hàng", "src\\Coffee\\img\\HT4.png");
		
		nhanVien = new JButton();
		createBT(nhanVien, "Nhân viên", "src\\Coffee\\img\\HT5.png");
		
		matKhau = new JButton();
		createBT(matKhau, "Mật khẩu", "src\\Coffee\\img\\HT6.png");
		
		ketThuc = new JButton();
		createBT(ketThuc, "Kết thúc", "src\\Coffee\\img\\HT7.png");

		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(danhMuc);
		this.add(tuyChon);
		this.add(sanPham);
		this.add(khachHang);
		this.add(nhanVien);
		this.add(matKhau);
		this.add(ketThuc);
		
		ketThuc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	private void createBT(JButton bt, String name, String img) {
		ImageIcon anh = new ImageIcon(img);
		Image image = anh.getImage();
		Image newimg = image.getScaledInstance(50, 50,  Image.SCALE_SMOOTH);
		anh = new ImageIcon(newimg);
		bt.setIcon(anh);
		bt.setText(name);
		bt.setFont(new Font("", Font.BOLD, 15));
		bt.setContentAreaFilled(false);
		bt.setHorizontalTextPosition(SwingConstants.CENTER);
		bt.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		bt.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				bt.setContentAreaFilled(false);
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				bt.setContentAreaFilled(true);
				bt.setBackground(new Color(110, 195, 201));
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
	}
}
