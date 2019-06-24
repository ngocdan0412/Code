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
import javax.swing.table.DefaultTableModel;

import common.grouptable.ColumnGroup;
import common.grouptable.JCustomTable;

public class TabThuNgan extends JPanel {
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
	
	private DefaultTableModel thuNganTableModel;
	private JCustomTable thuNganTable;
	private JScrollPane pnTabTN;
	
	public TabThuNgan() {
		setLayout(new BorderLayout());
		initScreen();
	}

	private void initScreen() {
		JPanel menuThuNgan = new JPanel();
//		menuThuNgan.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
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
		
//		pnTabTN = new JScrollPane();
//		pnTabTN.add(menuThuNgan);
		
		this.add(menuThuNgan, BorderLayout.NORTH);
		
		thuNganTableModel = new DefaultTableModel();
		thuNganTableModel.addColumn("TT");
		thuNganTableModel.addColumn("Số bàn");
		thuNganTableModel.addColumn("Số CT");
		thuNganTableModel.addColumn("Số món");
		thuNganTableModel.addColumn("Thiếu");
		thuNganTableModel.addColumn("Số tiền");
		thuNganTableModel.addColumn("Giờ vào");
		thuNganTableModel.addColumn("Thời gian");
		thuNganTableModel.addColumn("Số khách");
		thuNganTableModel.addColumn("Khách hàng");
		thuNganTableModel.addColumn("Nhân viên phục vụ");
		thuNganTableModel.addColumn("Ghi chú");
		
		thuNganTable = new JCustomTable(thuNganTableModel);
		
		ColumnGroup chungTuColumnGroup = new ColumnGroup("Chứng Từ");
		chungTuColumnGroup.add(thuNganTable.getColumn(1));
		chungTuColumnGroup.add(thuNganTable.getColumn(2));
		thuNganTable.addColumnGroup(chungTuColumnGroup);
		
		ColumnGroup thucDonColumnGroup = new ColumnGroup("Thực đơn");
		thucDonColumnGroup.add(thuNganTable.getColumn(3));
		thucDonColumnGroup.add(thuNganTable.getColumn(4));
		thucDonColumnGroup.add(thuNganTable.getColumn(5));
		thuNganTable.addColumnGroup(thucDonColumnGroup);
		
		ColumnGroup khachHangColumnGroup = new ColumnGroup("Khách hàng");
		khachHangColumnGroup.add(thuNganTable.getColumn(6));
		khachHangColumnGroup.add(thuNganTable.getColumn(7));
		khachHangColumnGroup.add(thuNganTable.getColumn(8));
		thuNganTable.addColumnGroup(khachHangColumnGroup);
		
		pnTabTN = new JScrollPane(thuNganTable);
//		pnTabTN.add(thuNganTable);
		
		this.add(pnTabTN, BorderLayout.CENTER);
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
