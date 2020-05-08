package Coffee.view.tabpanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;

public class TabSanPham extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton btnDuLieu;
	private JButton btnCapNhat;
	private JButton btnXoa;
	private JButton btnChuyen;
	private JButton btnGhep;
	private JButton btnThanhToan;
	private JButton btnXacNhan;
	
	public TabSanPham() {
		setLayout(new BorderLayout());
		initScreen();
	}
	
	private void initScreen() {
		JPanel menuThuNgan = new JPanel();
		btnDuLieu = new JButton();
		setButtonMenu(menuThuNgan, btnDuLieu, "Dữ Liệu");
		btnCapNhat = new JButton();
		setButtonMenu(menuThuNgan, btnCapNhat, "Cập nhật");
		btnXoa = new JButton();
		setButtonMenu(menuThuNgan, btnXoa, "Xóa");
		btnChuyen = new JButton();
		setButtonMenu(menuThuNgan, btnChuyen, "Chuyển");
		btnGhep = new JButton();
		setButtonMenu(menuThuNgan, btnGhep, "Ghép");
		btnThanhToan = new JButton();
		setButtonMenu(menuThuNgan, btnThanhToan, "Thanh toán");
		btnXacNhan = new JButton();
		setButtonMenu(menuThuNgan, btnXacNhan, "Xác nhận");

		this.add(menuThuNgan, BorderLayout.NORTH);
		
		JScrollPane pnTabKH = new JScrollPane();
		this.add(pnTabKH, BorderLayout.CENTER);
	}
	
	private void setButtonMenu(JPanel pn, JButton bt, String name) {
		bt.setText(name);
		bt.setBorderPainted(false);
		bt.setContentAreaFilled(false);
		pn.add(bt);
		pn.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		pn.setBackground(new Color(202, 229, 232));
		JLabel kt = new JLabel();
		kt.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		kt.setPreferredSize(new Dimension(2, 20));
		if(!name.equals("Xác nhận")) {
			pn.add(kt);
		}
		
		
		bt.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				bt.setBorderPainted(false);
				bt.setContentAreaFilled(false);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				bt.setBorderPainted(true);
				bt.setContentAreaFilled(true);
				bt.setBackground(new Color(110, 195, 201));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}
}
