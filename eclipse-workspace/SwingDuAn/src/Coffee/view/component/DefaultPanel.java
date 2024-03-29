package Coffee.view.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import Coffee.view.LoginFrame;
import Coffee.view.component.detail.showDate;

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

	private JPanel baoCaoDate;
	private JLabel fromDate;
	private showDate date1;
	private JLabel toDate;
	private showDate date2;
	private JPanel baoCaoKH;
	private JLabel khacHang;
	private JComboBox<String> cbKH;
	
	private ButtonGroup language;
	private JRadioButton tiengViet;
	private JRadioButton tiengNN;
	private JCheckBox xemTHD;

	public DefaultPanel() {
		setBackground(new Color(202, 229, 232));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		initScreen();
	}

	private void initScreen() {

		JPanel bang1 = new JPanel();
		bang1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, -10));
		bang1.setLayout(new BoxLayout(bang1, BoxLayout.Y_AXIS));
		setPanel(bang1, 0);

		JPanel pnBG = new JPanel();
		pnBG.setBackground(null);
		pnBG.setBorder(BorderFactory.createEmptyBorder(0, -5, 0, 0));
		bangGia = new JLabel("  Bảng giá:");
		bangGia.setBackground(null);
		cbBangGia = new JComboBox<String>();
		cbBangGia.addItem("Mặc định");
		cbBangGia.addItem("Phòng lạnh");
		setComboBox(cbBangGia);
		pnBG.add(bangGia);
		pnBG.add(cbBangGia);

		JPanel pnTN = new JPanel();
		pnTN.setBackground(null);
		pnTN.setBorder(BorderFactory.createEmptyBorder(-5, -5, 0, 0));
		thuNgan = new JLabel(" Thu ngân:");
		thuNgan.setBackground(null);
		cbThuNgan = new JComboBox<String>();
		cbThuNgan.addItem("Tất cả");
		setComboBox(cbThuNgan);
		pnTN.add(thuNgan);
		pnTN.add(cbThuNgan);

		JPanel pnNV = new JPanel();
		pnNV.setBackground(null);
		pnNV.setBorder(BorderFactory.createEmptyBorder(-5, -5, 0, 0));
		nhanVien = new JLabel("Nhân viên:");
		nhanVien.setBackground(null);
		cbNhanVien = new JComboBox<String>();
		cbNhanVien.addItem("");
		setComboBox(cbNhanVien);
		pnNV.add(nhanVien);
		pnNV.add(cbNhanVien);

		bang1.add(pnBG);
		bang1.add(pnTN);
		bang1.add(pnNV);

		this.add(bang1);

		JPanel baoCao = new JPanel();
		baoCao.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setPanel(baoCao, 1);
		setBorder(baoCao, " Báo cáo ");
		
		baoCaoDate = new JPanel();
		baoCaoDate.setBackground(null);
		baoCaoDate.setBorder(BorderFactory.createEmptyBorder(-5, 0, 0, -5));
		fromDate = new JLabel("Từ ngày:");
		date1 = new showDate();
		toDate = new JLabel("Đến:");
		date2 = new showDate();
		
		baoCaoDate.add(fromDate);
		baoCaoDate.add(date1);
		baoCaoDate.add(toDate);
		baoCaoDate.add(date2);
		
		baoCaoKH = new JPanel();
		baoCaoKH.setBackground(null);
		baoCaoKH.setBorder(BorderFactory.createEmptyBorder(-5, 0, -5, 0));
		khacHang = new JLabel("Khách hàng:");
		cbKH = new JComboBox<String>();
		setComboBox(cbKH);
		
		baoCaoKH.add(khacHang);
		baoCaoKH.add(cbKH);
		
		baoCao.add(baoCaoDate);
		baoCao.add(baoCaoKH);
		this.add(baoCao);

		JPanel inHoaDon = new JPanel();
		inHoaDon.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setPanel(inHoaDon, 2);
		setBorder(inHoaDon, " In hóa đơn ");

		JPanel changeLanguage = new JPanel();
		changeLanguage.setBackground(null);
		changeLanguage.setLayout(new BorderLayout());
		language = new ButtonGroup();
		tiengViet = new JRadioButton("Tiếng Việt", true);
		tiengViet.setBackground(null);
		tiengNN = new JRadioButton("Tiếng nước ngoài", false);
		tiengNN.setBackground(null);
		language.add(tiengViet);
		language.add(tiengNN);
		changeLanguage.add(tiengViet, BorderLayout.WEST);
		changeLanguage.add(tiengNN);

		xemTHD = new JCheckBox("Xem trước hóa đơn", true);
		xemTHD.setBackground(null);

		inHoaDon.add(changeLanguage);
		inHoaDon.add(xemTHD);

		this.add(inHoaDon);
		
		cbKH.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Được rồi nha!!");
			}
		});
	}

	private void setPanel(JPanel pn, int stt) {
		pn.setBackground(null);
		if(stt == 0) {
			pn.setMaximumSize(new Dimension(350, 100));
			pn.setMinimumSize(new Dimension(350, 100));
		}else if(stt == 1) {
			pn.setMaximumSize(new Dimension(430, 100));
			pn.setMinimumSize(new Dimension(430, 100));
		}else {
			pn.setMaximumSize(new Dimension(250, 100));
			pn.setMinimumSize(new Dimension(250, 100));
		}
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
