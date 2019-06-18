package Coffee.view.component;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel pnC;
	private JButton heThong;
	private JButton thuNgan;
	private JLabel ft;
	private CardLayout cdLayout;
	private HeThongPanel heThongPanel;
	private ThuNganPanel thuNganPanel;
	private DefaultPanel defaultPanel;
	
	public HeThongPanel getHeThongPanel() {
		return heThongPanel;
	}
	public ThuNganPanel getThuNganPanel() {
		return thuNganPanel;
	}
	
	public TopPanel() {
		setPreferredSize(new Dimension(Integer.MAX_VALUE, 135));
		setBackground(null); 
		tab();
	}

	private void tab() {
		JPanel pnN = new JPanel();
		pnN.setLayout(new BorderLayout());

		JPanel tab = new JPanel();
		heThong = new JButton("Hệ Thống");
		setButton(heThong);

		thuNgan = new JButton("Thu Ngân");
		setButton(thuNgan);

		tab.add(heThong);
		tab.add(thuNgan);

		ft = new JLabel("FT Coffee   ");
		ft.setFont(new Font("", Font.BOLD, 20));

		pnN.add(ft, BorderLayout.EAST);
		pnN.add(tab, BorderLayout.WEST);

		pnC = new JPanel();
		cdLayout = new CardLayout();
		pnC.setLayout(cdLayout);
		
		defaultPanel = new DefaultPanel();
		heThongPanel = new HeThongPanel();
		thuNganPanel = new ThuNganPanel();

		pnC.add(defaultPanel);
		pnC.add(heThongPanel, "heThong");
		pnC.add(thuNganPanel, "thuNgan");

		this.setLayout(new BorderLayout());
		this.add(pnN, BorderLayout.NORTH);
		this.add(pnC, BorderLayout.CENTER);
		
		heThong.addActionListener(this);
		thuNgan.addActionListener(this);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object action = e.getSource();
		if(action == heThong) {
			cdLayout.show(pnC, "heThong");
			thuNgan.setBackground(Color.LIGHT_GRAY);
			heThong.setBackground(new Color(202, 229, 232));
		}else if(action == thuNgan) {
			cdLayout.show(pnC, "thuNgan");
			heThong.setBackground(Color.LIGHT_GRAY);
			thuNgan.setBackground(new Color(202, 229, 232));
		}
	}
	
	private void setButton(JButton bt) {
		bt.setBackground(Color.LIGHT_GRAY);
		bt.setBorderPainted(false);
		bt.setFont(new Font("", Font.BOLD, 15));
	}
}
