package Coffee.view.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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

	private JButton mauIn;
	private JButton mayIn;
	private JButton soDo;
	private JButton datBan;
	private JButton hoaDon;
	private JButton doanhThu;
	private JButton thuChi;
	private JButton phieuThu;
	private JButton phieuChi;
	
	public ThuNganPanel() {
		setBackground(new Color(202, 229, 232));
		initScreen();
	}
	
	private void initScreen() {
		mauIn = new JButton();
		createBT(mauIn, "Mẫu in", "src\\Coffee\\img\\TN1.png");
		
		mayIn = new JButton();
		createBT(mayIn, "Máy in", "src\\Coffee\\img\\TN2.png");
		
		soDo = new JButton();
		createBT(soDo, "Sơ đồ", "src\\Coffee\\img\\TN3.png");
		
		datBan = new JButton();
		createBT(datBan, "Đặt bàn", "src\\Coffee\\img\\TN4.png");
		
		hoaDon = new JButton();
		createBT(hoaDon, "Hóa đơn", "src\\Coffee\\img\\TN5.png");
		
		doanhThu = new JButton();
		createBT(doanhThu, "Doanh thu", "src\\Coffee\\img\\TN6.png");
		
		thuChi = new JButton();
		createBT(thuChi, "Thu chi", "src\\Coffee\\img\\TN7.png");
		
		phieuThu = new JButton();
		createBT(phieuThu, "Phiếu thu", "src\\Coffee\\img\\TN8.png");
		
		phieuChi = new JButton();
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
