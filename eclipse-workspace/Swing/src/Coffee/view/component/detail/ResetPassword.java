package Coffee.view.component.detail;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ResetPassword extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResetPassword() {
		setUndecorated(true);
		setSize(400, 230);
		setLocationRelativeTo(null);
		resetPass();
	}

	public void resetPass() {
		JLabel tieuDe = new JLabel("ĐỔI MẬT KHẨU", SwingConstants.CENTER);
		tieuDe.setFont(new Font("", Font.BOLD, 25));

		this.setLayout(new BorderLayout());
		this.add(tieuDe, BorderLayout.NORTH);

		JPanel pnC = new JPanel();
		pnC.setLayout(null);
		
		JLabel lbName = new JLabel("Tên tài khoản");
		lbName.setFont(new Font("", Font.PLAIN, 15));
		lbName.setBounds(82, 10, 120, 30);
		JTextField txtName = new JTextField("admin");
		txtName.setEditable(false);
		txtName.setFont(new Font("", Font.BOLD, 15));
		txtName.setBounds(180, 10, 180, 30);
		pnC.add(lbName);
		pnC.add(txtName);
		
		JLabel lbMK = new JLabel("Nhập mật khẩu cũ");
		lbMK.setFont(new Font("", Font.PLAIN, 15));
		lbMK.setBounds(50, 45, 120, 30);
		JPasswordField txtMK = new JPasswordField(15);
		txtMK.setFont(new Font("", Font.PLAIN, 15));
		txtMK.setBounds(180, 45, 180, 30);
		pnC.add(lbMK);
		pnC.add(txtMK);

		JLabel lbNewMK = new JLabel("Nhập mật khẩu mới");
		lbNewMK.setFont(new Font("", Font.PLAIN, 15));
		lbNewMK.setBounds(40, 80, 130, 30);
		JPasswordField txtNewMK = new JPasswordField(15);
		txtNewMK.setFont(new Font("", Font.PLAIN, 15));
		txtNewMK.setBounds(180, 80, 180, 30);
		pnC.add(lbNewMK);
		pnC.add(txtNewMK);

		JLabel lbEnterMK = new JLabel("Nhập lại mật khẩu");
		lbEnterMK.setFont(new Font("", Font.PLAIN, 15));
		lbEnterMK.setBounds(52, 115, 120, 30);
		JPasswordField txtEnterMK = new JPasswordField(15);
		txtEnterMK.setFont(new Font("", Font.PLAIN, 15));
		txtEnterMK.setBounds(180, 115, 180, 30);
		pnC.add(lbEnterMK);
		pnC.add(txtEnterMK);
		this.add(pnC, BorderLayout.CENTER);

		JPanel bt = new JPanel();
		JButton done = new JButton("Chấp nhận");
		done.setPreferredSize(new Dimension(100, 30));
		done.setBackground(Color.LIGHT_GRAY);
		JButton exit = new JButton("Hủy bỏ");
		exit.setPreferredSize(new Dimension(100, 30));
		exit.setBackground(Color.LIGHT_GRAY);
		bt.add(done);
		bt.add(exit);
		this.add(bt, BorderLayout.SOUTH);
		
		txtEnterMK.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					done.doClick();
				}
			}
		});
		
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		done.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtMK.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
				} else if (txtNewMK.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập mật khẩu mới", "Lỗi", JOptionPane.ERROR_MESSAGE);
				} else if (txtNewMK.getText().equals(txtMK.getText())) {
					JOptionPane.showMessageDialog(null, "Mật khẩu đã từng được sử dụng", "Lỗi",
							JOptionPane.ERROR_MESSAGE);
				} else if (txtEnterMK.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập lại mật khẩu mới", "Lỗi",
							JOptionPane.ERROR_MESSAGE);
				} else if (!txtNewMK.getText().equals(txtEnterMK.getText())) {
					JOptionPane.showMessageDialog(null, "Mật khẩu nhập lại không trùng", "Lỗi",
							JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeft", "root",
								"");
						String sql = "SELECT * FROM user WHERE Username=? AND Password=?";
						PreparedStatement ps = conn.prepareStatement(sql);
						ps.setString(1, txtName.getText());
						ps.setString(2, txtMK.getText());

						ResultSet rs = ps.executeQuery();
						if (rs.next()) {
							String sql2 = "UPDATE `user` SET `Password`=? WHERE `Username`=?";
							PreparedStatement ps2 = conn.prepareStatement(sql2);
							ps2.setString(1, txtEnterMK.getText());
							ps2.setString(2, txtName.getText());
							
							ps2.executeUpdate();
								JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công");
								dispose();
						} else {
							JOptionPane.showMessageDialog(null, "Mật khẩu không chính xác!!", "Lỗi", JOptionPane.ERROR_MESSAGE);

						}
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
