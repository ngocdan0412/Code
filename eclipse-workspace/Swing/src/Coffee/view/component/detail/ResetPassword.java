package Coffee.view.component.detail;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class ResetPassword extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResetPassword() {
		setUndecorated(true);
		setSize(400, 200);
		setLocationRelativeTo(null);
//		ImageIcon img = new ImageIcon("src\\Coffee\\img\\cafe4.png");
//		setIconImage(img.getImage());
		resetPass();
	}
	
	public void resetPass() {
		JLabel tieuDe = new JLabel("ĐỔI MẬT KHẨU", SwingConstants.CENTER);
		tieuDe.setFont(new Font("", Font.BOLD, 25));
		
		this.setLayout(new BorderLayout());
		this.add(tieuDe, BorderLayout.NORTH);
		
		JPanel pnC = new JPanel();
		pnC.setLayout(null);
		
		JLabel lbMK = new JLabel("Nhập mật khẩu cũ");
		lbMK.setFont(new Font("", Font.PLAIN, 15));
		lbMK.setBounds(50, 10, 120, 30);
		JPasswordField txtMK = new JPasswordField(15);
		txtMK.setFont(new Font("", Font.PLAIN, 15));
		txtMK.setBounds(180, 10, 180, 30);
		pnC.add(lbMK);
		pnC.add(txtMK);
		
		JLabel lbNewMK = new JLabel("Nhập mật khẩu mới");
		lbNewMK.setFont(new Font("", Font.PLAIN, 15));
		lbNewMK.setBounds(40, 45, 130, 30);
		JPasswordField txtNewMK = new JPasswordField(15);
		txtNewMK.setFont(new Font("", Font.PLAIN, 15));
		txtNewMK.setBounds(180, 45, 180, 30);
		pnC.add(lbNewMK);
		pnC.add(txtNewMK);
		
		JLabel lbEnterMK = new JLabel("Nhập lại mật khẩu");
		lbEnterMK.setFont(new Font("", Font.PLAIN, 15));
		lbEnterMK.setBounds(52, 80, 120, 30);
		JPasswordField txtEnterMK = new JPasswordField(15);
		txtEnterMK.setFont(new Font("", Font.PLAIN, 15));
		txtEnterMK.setBounds(180, 80, 180, 30);
		pnC.add(lbEnterMK);
		pnC.add(txtEnterMK);
		this.add(pnC, BorderLayout.CENTER);
		
		JPanel bt = new JPanel();
		JButton done = new JButton("Chấp nhận");
		JButton exit = new JButton("       Hủy       ");
		bt.add(done);
		bt.add(exit);
		this.add(bt, BorderLayout.SOUTH);
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		done.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtMK.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}else if(txtNewMK.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập mật khẩu mới", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}else if(txtNewMK.getText().equals(txtMK.getText())) {
					JOptionPane.showMessageDialog(null, "Mật khẩu đã từng được sử dụng", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}else if(txtEnterMK.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập lại mật khẩu mới", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}else if(!txtNewMK.getText().equals(txtEnterMK.getText())) {
					JOptionPane.showMessageDialog(null, "Mật khẩu nhập lại không trùng", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}else {
					try {
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeft", "root",
								"");
						String sql = "SELECT * FROM users WHERE Username";
						PreparedStatement ps = conn.prepareStatement(sql);
						JOptionPane.showMessageDialog(null, ps, "", JOptionPane.NO_OPTION);
						
					} catch (Exception e1) {
						System.out.println(e1);
					}
				}
			}
		});
	}
	
	public static void main(String[] args) {
		ResetPassword ui = new ResetPassword();
		ui.setVisible(true);
	}
}
