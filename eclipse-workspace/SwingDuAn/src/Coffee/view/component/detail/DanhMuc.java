package Coffee.view.component.detail;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import common.grouptable.JCustomTable;

public class DanhMuc extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JComboBox<String> cbBangGia;

	private JPanel pnC;
	private CardLayout cd;
	private JPanel pnBangGia;
	private DefaultTableModel bangGiaTableModel;
	private JCustomTable bangGiaTable;
	private JScrollPane pnTabBG;

	private JPanel pnKhuVuc;
	private DefaultTableModel khuVucTableModel;
	private JCustomTable khuVucTable;
	private JScrollPane pnTabKV;

	private JPanel pnDonViTinh;
	private DefaultTableModel donViTinhTableModel;
	private JCustomTable donViTinhTable;
	private JScrollPane pnTabDVT;

	private JButton btnLuu;
	private JButton btnXoa;
	private JButton btnSaoChep;
	private JButton btnESC;

	public DanhMuc() {
		setTitle("Danh mục dữ liệu");
		setModalityType(DEFAULT_MODALITY_TYPE);
		setSize(700, 375);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		ImageIcon img = new ImageIcon("src\\Coffee\\img\\cafe4.png");
		setIconImage(img.getImage());
		initScreen();
	}

	private void initScreen() {
		JPanel pnN = new JPanel();
		cbBangGia = new JComboBox<String>();
		cbBangGia.setPreferredSize(new Dimension(690, 28));
		cbBangGia.addItem("Bảng giá bán hàng");
		cbBangGia.addItem("Khu vực");
		cbBangGia.addItem("Đơn vị tính");
		cbBangGia.addActionListener(hd);

		pnN.add(cbBangGia);
		this.add(pnN, BorderLayout.NORTH);

		pnC = new JPanel();
		cd = new CardLayout();
		pnC.setLayout(cd);
		pnBangGia = new JPanel();
		pnBangGia.setLayout(new BorderLayout());

		// Table Bang Gia Ban Hang
		JPanel cardBangGia = new JPanel();
		cardBangGia.setBorder(BorderFactory.createEmptyBorder(-5, -5, -5, -5));
		bangGiaTableModel = new DefaultTableModel();
		bangGiaTableModel.addColumn("Ký hiệu");
		bangGiaTableModel.addColumn("Tên bảng giá");
		bangGiaTableModel.addColumn("Mặc định");
		bangGiaTableModel.addColumn("Sao chép");

		bangGiaTable = new JCustomTable(bangGiaTableModel);
		pnTabBG = new JScrollPane(bangGiaTable);
		pnTabBG.setPreferredSize(new Dimension(690, 273));
		cardBangGia.add(pnTabBG);
		pnBangGia.add(cardBangGia, BorderLayout.CENTER);

		JPanel menuBottom1 = new JPanel();
		btnLuu = new JButton();
		setButtonMenu(menuBottom1, btnLuu, "Lưu", "src\\Coffee\\img\\save.png");
		btnXoa = new JButton();
		setButtonMenu(menuBottom1, btnXoa, "Xóa", "src\\Coffee\\img\\close.png");
		btnSaoChep = new JButton();
		setButtonMenu(menuBottom1, btnSaoChep, "Sao chép", "src\\Coffee\\img\\copy.png");
		btnESC = new JButton();
		setButtonMenu(menuBottom1, btnESC, "ESC", "src\\Coffee\\img\\undo.png");

		pnBangGia.add(menuBottom1, BorderLayout.SOUTH);

		// Table Khu Vuc
		pnKhuVuc = new JPanel();
		pnKhuVuc.setLayout(new BorderLayout());

		JPanel cardKhuVuc = new JPanel();
		cardKhuVuc.setBorder(BorderFactory.createEmptyBorder(-5, -5, -5, -5));
		khuVucTableModel = new DefaultTableModel();
		khuVucTableModel.addColumn("Mã");
		khuVucTableModel.addColumn("Tên của hàng");

		khuVucTable = new JCustomTable(khuVucTableModel);
		pnTabKV = new JScrollPane(khuVucTable);
		pnTabKV.setPreferredSize(new Dimension(690, 273));
		cardKhuVuc.add(pnTabKV);
		pnKhuVuc.add(cardKhuVuc, BorderLayout.CENTER);

		JPanel menuBottom2 = new JPanel();
		btnLuu = new JButton();
		setButtonMenu(menuBottom2, btnLuu, "Lưu", "src\\Coffee\\img\\save.png");
		btnXoa = new JButton();
		setButtonMenu(menuBottom2, btnXoa, "Xóa", "src\\Coffee\\img\\close.png");
		btnESC = new JButton();
		setButtonMenu(menuBottom2, btnESC, "ESC", "src\\Coffee\\img\\undo.png");

		pnKhuVuc.add(menuBottom2, BorderLayout.SOUTH);

		// Table Don Vi Tinh
		pnDonViTinh = new JPanel();
		pnDonViTinh.setLayout(new BorderLayout());

		JPanel cardDonViTinh = new JPanel();
		cardDonViTinh.setBorder(BorderFactory.createEmptyBorder(-5, -5, -5, -5));
		donViTinhTableModel = new DefaultTableModel();
		donViTinhTableModel.addColumn("Ký hiệu");
		donViTinhTableModel.addColumn("Mặc định");

		donViTinhTable = new JCustomTable(donViTinhTableModel);
		pnTabDVT = new JScrollPane(donViTinhTable);
		pnTabDVT.setPreferredSize(new Dimension(690, 273));
		cardDonViTinh.add(pnTabDVT);
		pnDonViTinh.add(cardDonViTinh, BorderLayout.CENTER);

		JPanel menuBottom3 = new JPanel();
		btnLuu = new JButton();
		setButtonMenu(menuBottom3, btnLuu, "Lưu", "src\\Coffee\\img\\save.png");
		btnXoa = new JButton();
		setButtonMenu(menuBottom3, btnXoa, "Xóa", "src\\Coffee\\img\\close.png");
		btnESC = new JButton();
		setButtonMenu(menuBottom3, btnESC, "ESC", "src\\Coffee\\img\\undo.png");

		pnDonViTinh.add(menuBottom3, BorderLayout.SOUTH);

		pnC.add(pnBangGia, "bang gia");
		pnC.add(pnKhuVuc, "khu vuc");
		pnC.add(pnDonViTinh, "don vi tinh");

		this.add(pnC, BorderLayout.CENTER);
	}

	private void setButtonMenu(JPanel pn, JButton bt, String name, String img) {
		ImageIcon anh = new ImageIcon(img);
		Image image = anh.getImage();
		Image newimg = image.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		anh = new ImageIcon(newimg);
		bt.setIcon(anh);
		bt.setText(name);
		bt.setBorderPainted(false);
		bt.setContentAreaFilled(false);
		pn.add(bt);
		pn.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		pn.setPreferredSize(new Dimension(700, 30));
		pn.setBackground(new Color(202, 229, 232));
		JLabel kt = new JLabel();
		kt.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		kt.setPreferredSize(new Dimension(2, 20));
		if (!name.equals("ESC")) {
			pn.add(kt);
		} else {
			bt.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
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
			if (action == cbBangGia) {
				if (cbBangGia.getSelectedIndex() == 0) {
					cd.show(pnC, "bang gia");
				} else if (cbBangGia.getSelectedIndex() == 1) {
					cd.show(pnC, "khu vuc");
				} else if (cbBangGia.getSelectedIndex() == 2) {
					cd.show(pnC, "don vi tinh");
				}
			}
		}
	};
}