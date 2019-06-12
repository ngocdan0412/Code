package Coffee.view.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Coffee.view.component.detail.ResetPassword;

public class DefaultPanel extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TopPanel topPanel;
	private CenterPanel centerPanel;
	private BottomPanel bottomPanel;
	
	public DefaultPanel() {
		super("DỰ ÁN FT COFFEE");
		setSize(1200, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		ImageIcon img = new ImageIcon("src\\Coffee\\img\\cafe4.png");
		setIconImage(img.getImage());
		pnN();
	}

	public void pnN() {
		topPanel = new TopPanel();
		topPanel.getHeThongPanel().getMatKhau().addActionListener(hd);
		
		centerPanel = new CenterPanel();

		bottomPanel = new BottomPanel();

		Container con = getContentPane();
		con.add(topPanel, BorderLayout.NORTH);
		con.add(centerPanel, BorderLayout.CENTER);
		con.add(bottomPanel, BorderLayout.SOUTH);
	}

	public ActionListener hd = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object action = e.getSource();
			if(action == topPanel.getHeThongPanel().getMatKhau()) {
				LoadResetPassword();
				System.out.println("done");
			}
		}
	};
	protected void LoadResetPassword() {
		ResetPassword ui = new ResetPassword();
		ui.setVisible(true);
	}
	/**
	 * Test Run!!!
	 */
	public static void main(String[] args) {
		DefaultPanel ui = new DefaultPanel();
		ui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
