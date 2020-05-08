package Coffee.view.tabpanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import Coffee.view.tabpanel.dialog.themBoPhan;
import common.grouptable.JCustomTable;

public class TabNhanVien extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton btnDongBo;
	private JButton btnThemBP;
	private JButton btnSuaBP;
	private JButton btnXoaBP;
	private JButton btnLuu;
	private JButton btnChuyen;
	private JButton btnXoa;

	private JPanel pnBoPhan;
	
	private DefaultTableModel nhanVienTableModel;
	private JCustomTable nhanVienTable;
	private JScrollPane pnTabNVLeft;
	private JScrollPane pnTabNVRight;

	public TabNhanVien() {
		setLayout(new BorderLayout());
		initScreen();
	}

	private void initScreen() {
		JPanel menuNhanVien = new JPanel();
		btnDongBo = new JButton();
		setButtonMenu(menuNhanVien, btnDongBo, "Đồng bộ");
		btnThemBP = new JButton();
		btnThemBP.addActionListener(hd);
		setButtonMenu(menuNhanVien, btnThemBP, "Thêm BP");
		btnSuaBP = new JButton();
		setButtonMenu(menuNhanVien, btnSuaBP, "Sửa BP");
		btnXoaBP = new JButton();
		setButtonMenu(menuNhanVien, btnXoaBP, "Xóa BP");
		btnLuu = new JButton();
		setButtonMenu(menuNhanVien, btnLuu, "Lưu");
		btnChuyen = new JButton();
		setButtonMenu(menuNhanVien, btnChuyen, "Chuyển");
		btnXoa = new JButton();
		setButtonMenu(menuNhanVien, btnXoa, "Xóa");

		this.add(menuNhanVien, BorderLayout.NORTH);

		pnBoPhan = new JPanel();
		pnBoPhan.setBackground(Color.WHITE);

		pnTabNVLeft = new JScrollPane(pnBoPhan);
		pnTabNVLeft.setPreferredSize(new Dimension(280, 830));
		
		
		

		JPanel tt = new JPanel();
//		tt.setPreferredSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
//		tt.setPreferredSize(new Dimension(getWidth(), getHeight()));
		tt.setLayout(new BorderLayout());
		tt.add(pnTabNVLeft, BorderLayout.WEST);

		nhanVienTableModel = new DefaultTableModel();
		nhanVienTableModel.addColumn("TT");
		nhanVienTableModel.addColumn("Mã");
		nhanVienTableModel.addColumn("Họ tên");
		nhanVienTableModel.addColumn("Thu ngân");
		nhanVienTableModel.addColumn("Thực đơn");
		nhanVienTableModel.addColumn("Đăng nhập");
		nhanVienTableModel.addColumn("Mật khẩu");
		nhanVienTableModel.addColumn("Điện thoại");
		nhanVienTableModel.addColumn("Địa chỉ");
		nhanVienTableModel.addColumn("Tài khoảng");
		nhanVienTableModel.addColumn("Ngân hàng");
		nhanVienTableModel.addColumn("Số CMNN");
		nhanVienTableModel.addColumn("Email");

		nhanVienTable = new JCustomTable(nhanVienTableModel);
		nhanVienTable.setBackground(Color.RED);
		
		nhanVienTable.setAutoResizeMode(JCustomTable.AUTO_RESIZE_OFF);

		nhanVienTable.getColumnModel().getColumn(0).setPreferredWidth(30);
		nhanVienTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		nhanVienTable.getColumnModel().getColumn(2).setPreferredWidth(140);
		nhanVienTable.getColumnModel().getColumn(3).setPreferredWidth(90);
		nhanVienTable.getColumnModel().getColumn(4).setPreferredWidth(90);
		nhanVienTable.getColumnModel().getColumn(5).setPreferredWidth(120);
		nhanVienTable.getColumnModel().getColumn(6).setPreferredWidth(120);
		nhanVienTable.getColumnModel().getColumn(7).setPreferredWidth(150);
		nhanVienTable.getColumnModel().getColumn(8).setPreferredWidth(150);
		nhanVienTable.getColumnModel().getColumn(9).setPreferredWidth(120);
		nhanVienTable.getColumnModel().getColumn(10).setPreferredWidth(120);
		nhanVienTable.getColumnModel().getColumn(11).setPreferredWidth(120);
		nhanVienTable.getColumnModel().getColumn(12).setPreferredWidth(120);

		pnTabNVRight = new JScrollPane(nhanVienTable);
		
		JPanel tx = new JPanel();
		tx.setBackground(Color.RED);
		
		tt.add(pnTabNVRight, BorderLayout.CENTER);
		this.add(tt, BorderLayout.CENTER);
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
		if (!name.equals("Xóa")) {
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
	
	private ActionListener hd = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object action = e.getSource();
			if(action == btnThemBP) {
				themBoPhan ui = new themBoPhan();
				ui.setVisible(true);
			}
		}
	};
}
