package Coffee.view.component.detail;

import java.awt.BorderLayout;
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

public class DanhMuc extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JComboBox<String> cbBangGia;
	private DefaultTableModel thuNganTableModel;
	private JCustomTable thuNganTable;
	private JScrollPane pnTabTN;
	
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
		JPanel pnC = new JPanel();
//		pnC.setBackground(Color.BLACK);
		cbBangGia = new JComboBox<String>();
		cbBangGia.setPreferredSize(new Dimension(690, 28));
		cbBangGia.addItem("Bảng giá bán hàng");
		cbBangGia.addItem("Khu vực");
		cbBangGia.addItem("Đơn vị tính");
		
		pnC.add(cbBangGia);
		
		thuNganTableModel = new DefaultTableModel();
		thuNganTableModel.addColumn("Ký hiệu");
		thuNganTableModel.addColumn("Tên bảng giá");
		thuNganTableModel.addColumn("Mặc định");
		thuNganTableModel.addColumn("Sao chép");
		
		thuNganTable = new JCustomTable(thuNganTableModel);
		pnTabTN = new JScrollPane(thuNganTable);
		pnTabTN.setPreferredSize(new Dimension(690, 273));
		pnC.add(pnTabTN);
		
		this.add(pnC, BorderLayout.CENTER);
		
		JPanel pnS = new JPanel();
		pnS.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		pnS.setPreferredSize(new Dimension(Integer.MAX_VALUE, 30));
		pnS.setBackground(new Color(202, 229, 232));
		
		btnLuu = new JButton();
		setButtonMenu(pnS, btnLuu, "Lưu", "src\\Coffee\\img\\save.png");
		btnXoa = new JButton();
		setButtonMenu(pnS, btnXoa, "Xóa", "src\\Coffee\\img\\close.png");
		btnSaoChep = new JButton();
		setButtonMenu(pnS, btnSaoChep, "Sao chép", "src\\Coffee\\img\\copy.png");
		btnESC = new JButton();
		setButtonMenu(pnS, btnESC, "ESC", "src\\Coffee\\img\\undo.png");
		
		this.add(pnS, BorderLayout.SOUTH);
	}
	
	private void setButtonMenu(JPanel pn, JButton bt, String name, String img) {
		ImageIcon anh = new ImageIcon(img);
		Image image = anh.getImage();
		Image newimg = image.getScaledInstance(15, 15,  Image.SCALE_SMOOTH);
		anh = new ImageIcon(newimg);
		bt.setIcon(anh);
		bt.setText(name);
		bt.setBorderPainted(false);
		bt.setContentAreaFilled(false);
		bt.addActionListener(this);
		pn.add(bt);
		JLabel kt = new JLabel();
		kt.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		kt.setPreferredSize(new Dimension(2, 20));
		if(!name.equals("ESC")) {
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

	@Override
	public void actionPerformed(ActionEvent e) {
		Object action = e.getSource();
		if(action == btnESC) {
			dispose();
		}
	}
}
