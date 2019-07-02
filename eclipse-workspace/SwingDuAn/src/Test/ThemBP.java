package Test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ThemBP extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel lbBoPhan;
	private JTextField tfNhapBP;

	private JButton btnSave;
	private JButton btnExit;
	
	public JButton getBtnSave() {
		return btnSave;
	}

	public JTextField getTfNhapBP() {
		return tfNhapBP;
	}
	
	public ThemBP() {
		setTitle("Nhóm dữ liệu");
		setModalityType(DEFAULT_MODALITY_TYPE);
		setSize(300, 150);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
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
//		btnSave.addActionListener(hd);
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
//			if(action == btnSave) {
//				BoPhan ui = new BoPhan();
//				ui.setNameBP(tfNhapBP.getText());
//				System.out.println(tfNhapBP.getText());
//				dispose();
//			}else 
				if(action == btnExit) {
				dispose();
			}
		}
	};
}
