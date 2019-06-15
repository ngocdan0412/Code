package Coffee.view.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class DefaultPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel bangGia;
	private JComboBox<String> cbBangGia;
	private JLabel thuNgan;
	private JComboBox<String> cbThuNgan;
	private JLabel nhanVien;
	private JComboBox<String> cbNhanVien;
	
	private ButtonGroup language;
	private JRadioButton tiengViet;
	private JRadioButton tiengNN;
	private JCheckBox xemTHD;

	public DefaultPanel() {
		setBackground(new Color(202, 229, 232));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		tab();
	}

	private void tab() {

		JPanel bang1 = new JPanel();
//		bang1.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPanel(bang1);

		bangGia = new JLabel("Bảng giá:");
		cbBangGia = new JComboBox<String>();
		cbBangGia.addItem("Mặc định");
		cbBangGia.addItem("Phòng lạnh");
		setComboBox(cbBangGia);

		thuNgan = new JLabel("Thu ngân:");
		cbThuNgan = new JComboBox<String>();
		cbThuNgan.addItem("Tất cả");
		setComboBox(cbThuNgan);

		nhanVien = new JLabel("Nhân viên:");
		cbNhanVien = new JComboBox<String>();
		setComboBox(cbNhanVien);

		bang1.add(bangGia);
		bang1.add(cbBangGia);
		bang1.add(thuNgan);
		bang1.add(cbThuNgan);
		bang1.add(nhanVien);
		bang1.add(cbNhanVien);
		
		this.add(bang1);

		JPanel baoCao = new JPanel();
		setPanel(baoCao);
		setBorder(baoCao, " Báo cáo ");
		
		this.add(baoCao);

		JPanel inHoaDon = new JPanel();
		setPanel(inHoaDon);
		setBorder(inHoaDon, " In hóa đơn ");

		language = new ButtonGroup();
		tiengViet = new JRadioButton("Tiếng Việt", true);
		tiengViet.setBackground(null);
		tiengNN = new JRadioButton("Tiếng nước ngoài", false);
		tiengNN.setBackground(null);
		language.add(tiengViet);
		language.add(tiengNN);
		
		xemTHD = new JCheckBox("Xem trước hóa đơn", true);
		xemTHD.setBackground(null);
		
		inHoaDon.add(tiengViet);
		inHoaDon.add(tiengNN);
		inHoaDon.add(xemTHD);
		
		this.add(inHoaDon);
	}

	private void setPanel(JPanel pn) {
		pn.setBackground(null);
		pn.setMaximumSize(new Dimension(350, 100));
		pn.setMinimumSize(new Dimension(350, 100));
	}

	private void setBorder(JPanel pn, String name) {
		Border bd = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		TitledBorder tb = BorderFactory.createTitledBorder(bd, name);
		pn.setBorder(tb);
	}

	private void setComboBox(JComboBox<String> cbb) {
		cbb.setPreferredSize(new Dimension(260, 25));
	}
}
