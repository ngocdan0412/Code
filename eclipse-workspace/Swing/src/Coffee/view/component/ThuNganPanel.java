package Coffee.view.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ThuNganPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ThuNganPanel() {
		setBackground(null);
		pnHT();
	}
	
	public void pnHT() {
		JButton mauIn = new JButton();
		createBT(mauIn, "Mẫu in", "src\\Coffee\\img\\TN1.png");
		
		JButton mayIn = new JButton();
		createBT(mayIn, "Máy in", "src\\Coffee\\img\\TN2.png");
		
		JButton soDo = new JButton();
		createBT(soDo, "Sơ đồ", "src\\Coffee\\img\\TN3.png");
		
		JButton datBan = new JButton();
		createBT(datBan, "Đặt bàn", "src\\Coffee\\img\\TN4.png");
		
		JButton hoaDon = new JButton();
		createBT(hoaDon, "Hóa đơn", "src\\Coffee\\img\\TN5.png");
		
		JButton doanhThu = new JButton();
		createBT(doanhThu, "Doanh thu", "src\\Coffee\\img\\TN6.png");
		
		JButton thuChi = new JButton();
		createBT(thuChi, "Thu chi", "src\\Coffee\\img\\TN7.png");
		
		JButton phieuThu = new JButton();
		createBT(phieuThu, "Phiếu thu", "src\\Coffee\\img\\TN8.png");
		
		JButton phieuChi = new JButton();
		createBT(phieuChi, "Phiếu chi", "src\\Coffee\\img\\TN9.png");

		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(mauIn);
		this.add(mayIn);
		this.add(soDo);
		this.add(datBan);
		this.add(hoaDon);
		this.add(doanhThu);
		this.add(thuChi);
		this.add(phieuThu);
		this.add(phieuChi);
		
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
	}
}
