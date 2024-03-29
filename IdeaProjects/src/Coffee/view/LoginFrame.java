package Coffee.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Coffee.view.component.detail.ResetPassword;


public class LoginFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField txtTen;
	private ResetPassword resetPassword;
	private int dem = 0;

	public LoginFrame() {
		setUndecorated(true);// ~~~ Ẩn thanh tiêu đề
		setSize(900, 600);
		setLocationRelativeTo(null);
		ImageIcon img = new ImageIcon("src\\Coffee\\img\\cafe4.png");
		setIconImage(img.getImage());
		initScreen();
	}

	private void LoadMainFrame() {
		MainFrame ui = new MainFrame();
		ui.setVisible(true);
	}

	private void initScreen() {
		ImageIcon background_img = new ImageIcon("src\\Coffee\\img\\bgcf.jpg");
		Image img = background_img.getImage();
		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		background_img = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_img, JLabel.CENTER);
		background.setBounds(0, 0, 900, 600);

		JPanel pnLogo = new JPanel();
		ImageIcon logo = new ImageIcon("src\\Coffee\\img\\logo.png");
		Image img_logo = logo.getImage();
		Image temp_logo = img_logo.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		logo = new ImageIcon(temp_logo);
		JLabel lbLogo = new JLabel("");
		lbLogo.setIcon(logo);
		pnLogo.add(lbLogo);
		pnLogo.setBounds(0, 0, 200, 200);
		pnLogo.setBackground(new Color(0, 0, 0, 0));
		background.add(pnLogo);

		// loginForm
		JPanel pnC = new JPanel();
		pnC.setLayout(null);
		pnC.setBackground(new Color(0, 0, 0, 0));

		JLabel tieuDe = new JLabel("LOGIN");
		tieuDe.setBounds(155, 30, 100, 50);
		tieuDe.setFont(new Font("", Font.BOLD, 30));// ~~~ set font
		tieuDe.setForeground(new Color(104, 48, 37));
		pnC.add(tieuDe);

		JLabel lbTen = new JLabel("USERNAME");
		lbTen.setBounds(80, 100, 90, 30);
		lbTen.setFont(new Font("", Font.BOLD, 15));
		lbTen.setForeground(new Color(104, 48, 37));
		pnC.add(lbTen);

		txtTen = new JTextField(20);
		txtTen.setText("admin");
		txtTen.setBounds(180, 100, 150, 30);
		txtTen.setFont(new Font("", Font.PLAIN, 15));
		pnC.add(txtTen);

		JLabel lbMK = new JLabel("PASSWORD");
		lbMK.setBounds(80, 160, 90, 30);
		lbMK.setFont(new Font("", Font.BOLD, 15));
		lbMK.setForeground(new Color(104, 48, 37));
		pnC.add(lbMK);

		JPasswordField txtMK = new JPasswordField(20);
		txtMK.setBounds(180, 160, 150, 30);
		txtMK.setFont(new Font("", Font.PLAIN, 15));
		pnC.add(txtMK);

		JCheckBox showPassword = new JCheckBox("Show Password");
		showPassword.setBounds(180, 190, 150, 20);
		pnC.add(showPassword);

		JButton buttonLogin = new JButton("LOGIN");
		buttonLogin.setBounds(100, 230, 90, 30);
		buttonLogin.setBackground(Color.LIGHT_GRAY);
		pnC.add(buttonLogin);

		JButton buttonExit = new JButton("EXIT");
		buttonExit.setBounds(215, 230, 90, 30);
		buttonExit.setBackground(Color.LIGHT_GRAY);
		pnC.add(buttonExit);

		pnC.setBounds(250, 125, 400, 350);
		background.add(pnC);

		background.setBounds(0, 0, 900, 600);
		Container con = getContentPane();
		con.add(background);

		buttonLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtTen.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập tên!!");
				} else if (txtMK.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập mật khẩu!!");
				} else {
					try {
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeft", "root",
								"");
						String sql = "SELECT * FROM user WHERE Username=? AND Password=?";
						PreparedStatement ps = conn.prepareStatement(sql);
						ps.setString(1, txtTen.getText());
						ps.setString(2, txtMK.getText());

						ResultSet rs = ps.executeQuery();
						if (rs.next()) {
							resetPassword = new ResetPassword(null);
							resetPassword.setUsername(txtTen.getText());
							System.out.println(txtTen.getText());
							dispose();// ~~~ thoát trang
							LoadMainFrame();
						} else {
							JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không chính xác!!", "Lỗi",
									JOptionPane.ERROR_MESSAGE);
							dem++;
							if(dem == 3) {
								System.exit(0);
							}
						}
					} catch (Exception e2) {
						System.out.println(e2);
					}
				}
			}
		});
		buttonExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		showPassword.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == showPassword) {
					if (showPassword.isSelected()) {
						txtMK.setEchoChar((char) 0);
					} else {
						txtMK.setEchoChar('•');
					}
				}
			}
		});
		txtMK.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					buttonLogin.doClick();
				}
			}
		});
	}
}