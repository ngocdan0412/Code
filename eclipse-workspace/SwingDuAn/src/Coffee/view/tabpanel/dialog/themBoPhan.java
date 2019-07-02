package Coffee.view.tabpanel.dialog;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class themBoPhan extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel lbBoPhan;
	private JTextField tfNhapBP;

	private JButton btnSave;
	private JButton btnExit;
	
	public JTextField getTfNhapBP() {
		return tfNhapBP;
	}
	
	public themBoPhan() {
		setTitle("Nhóm dữ liệu");
		setModalityType(DEFAULT_MODALITY_TYPE);
		setSize(300, 150);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		ImageIcon img = new ImageIcon("src\\Coffee\\img\\cafe4.png");
		setIconImage(img.getImage());
		initScreen();
	}
	
	private void initScreen() {
		JPanel pnC = new JPanel();
		lbBoPhan = new JLabel("Bộ phận: ");
		tfNhapBP = new JTextField();
		tfNhapBP.setPreferredSize(new Dimension(150, 26));
		pnC.add(lbBoPhan);
		pnC.add(tfNhapBP);
		
		JPanel pnS = new JPanel();
		btnSave = new JButton("Lưu");
		btnSave.addActionListener(hd);
		btnExit = new JButton("Hủy");
		btnExit.addActionListener(hd);
		pnS.add(btnSave);
		pnS.add(btnExit);
		
		this.add(pnC, BorderLayout.CENTER);
		this.add(pnS, BorderLayout.SOUTH);
	}
	
	private ActionListener hd = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object action = e.getSource();
			if(action == btnSave) {
				
				dispose();
			}else if(action == btnExit) {
				dispose();
			}
		}
	};
	
	public static void main(String[] args) {
		themBoPhan ui = new themBoPhan();
		ui.setVisible(true);
	}
}
