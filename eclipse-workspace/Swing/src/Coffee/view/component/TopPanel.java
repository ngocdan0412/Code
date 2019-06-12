package Coffee.view.component;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class TopPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HeThongPanel heThongPanel;
	private ThuNganPanel thuNganPanel;
	
	public HeThongPanel getHeThongPanel() {
		return heThongPanel;
	}
	public ThuNganPanel getThuNganPanel() {
		return thuNganPanel;
	}
	
	public TopPanel() {
		setPreferredSize(new Dimension(Integer.MAX_VALUE, 135));
		setBackground(Color.RED); 
		tab();
	}

	public void tab() {
		JPanel pnN = new JPanel();
		pnN.setLayout(new BorderLayout());

		JPanel tab = new JPanel();
		JButton heThong = new JButton("Hệ Thống");
		heThong.setBackground(Color.LIGHT_GRAY);
		heThong.setBorderPainted(false);
		heThong.setFont(new Font("", Font.BOLD, 15));

		JButton thuNgan = new JButton("Thu Ngân");
		thuNgan.setBackground(Color.LIGHT_GRAY);
		thuNgan.setBorderPainted(false);
		thuNgan.setFont(new Font("", Font.BOLD, 15));

		tab.add(heThong);
		tab.add(thuNgan);

		JLabel ft = new JLabel("FT Coffee   ");
		ft.setFont(new Font("", Font.BOLD, 20));

		pnN.add(ft, BorderLayout.EAST);
		pnN.add(tab, BorderLayout.WEST);

		JPanel pnC = new JPanel();
		pnC.setLayout(new CardLayout());

		JPanel tabGoc = new JPanel();
		tabGoc.setLayout(new BoxLayout(tabGoc, BoxLayout.X_AXIS));

		JPanel bangGia = new JPanel();
		Border bd = BorderFactory.createLineBorder(Color.BLUE, 2);
		TitledBorder tb = BorderFactory.createTitledBorder(bd, "demo");
		// bangGia.setSize(400, 100);
		bangGia.setBorder(tb);
		// bangGia.setPreferredSize(new Dimension(10, 10));
		JPanel baoCao = new JPanel();
		baoCao.setBorder(tb);
		JPanel inHoaDon = new JPanel();
		inHoaDon.setBorder(tb);
		tabGoc.add(bangGia);
		tabGoc.add(baoCao);
		tabGoc.add(inHoaDon);

		heThongPanel = new HeThongPanel();
		thuNganPanel = new ThuNganPanel();

		pnC.add(tabGoc);
		pnC.add(heThongPanel, "heThong");
		pnC.add(thuNganPanel, "thuNgan");

		this.setLayout(new BorderLayout());
		this.add(pnN, BorderLayout.NORTH);
		this.add(pnC, BorderLayout.CENTER);

		heThong.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) pnC.getLayout();
				cl.show(pnC, "heThong");
			}
		});
		thuNgan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) pnC.getLayout();
				cl.show(pnC, "thuNgan");
			}
		});
	}
}
