package Test;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;;

public class MyJFrame extends JFrame {
	public MyJFrame() {
		super("Demo Windows v0.1");
		// setUndecorated(true);// Ẩn thanh tiêu đề
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		// b1();
		// b2();
		// b3();
		// b4();
//		 b5();
//		 b6();
		b7();
		// initUI();
	}

	private void b1() {
		JPanel pnFlow = new JPanel();
		pnFlow.setLayout(new FlowLayout());
		pnFlow.setBackground(Color.PINK);

		JButton btn1 = new JButton("FlowLayout");
		JButton btn2 = new JButton("Add các control");
		JButton btn3 = new JButton("Trên 1 dòng");
		JButton btn4 = new JButton("Hết chỗ chứa");
		JButton btn5 = new JButton("Thì xuống dòng");
		pnFlow.add(btn1);
		pnFlow.add(btn2);
		pnFlow.add(btn3);
		pnFlow.add(btn4);
		pnFlow.add(btn5);
		Container con = getContentPane();
		con.add(pnFlow);
	}

	private void b2() {
		JPanel pnBox = new JPanel();
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
		JButton btn1 = new JButton("BoxLayout");
		btn1.setForeground(Color.RED);
		Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 25);
		btn1.setFont(font);
		pnBox.add(btn1);
		JButton btn2 = new JButton("X_AXIS");
		btn2.setForeground(Color.BLUE);
		btn2.setFont(font);
		pnBox.add(btn2);
		JButton btn3 = new JButton("Y_AXIS");
		btn3.setForeground(Color.ORANGE);
		btn3.setFont(font);
		pnBox.add(btn3);
		Container con = getContentPane();
		con.add(pnBox);
	}

	private void b3() {
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		JPanel pnNam = new JPanel();
		pnNam.setBackground(Color.RED);
		pnBorder.add(pnNam, BorderLayout.NORTH);
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.RED);
		pnBorder.add(pnSouth, BorderLayout.SOUTH);
		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.BLUE);
		pnBorder.add(pnWest, BorderLayout.WEST);
		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.BLUE);
		pnBorder.add(pnEast, BorderLayout.EAST);
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.YELLOW);
		pnBorder.add(pnCenter, BorderLayout.CENTER);
		getContentPane().add(pnBorder);
	}

	private void b4() {
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		JPanel pnNorth = new JPanel();
		JButton btnShowCard1 = new JButton("Show Card1");
		JButton btnShowCard2 = new JButton("Show Card2");
		// JButton btnShowCard3 = new JButton("Show Card3");

		pnNorth.add(btnShowCard1);
		pnNorth.add(btnShowCard2);
		// pnNorth.add(btnShowCard3);
		pnBorder.add(pnNorth, BorderLayout.NORTH);

		final JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new CardLayout());

		final JPanel pnCard1 = new JPanel();
		pnCard1.setBackground(Color.GREEN);
		final JPanel pnCard2 = new JPanel();
		pnCard2.setBackground(Color.YELLOW);
		// final JPanel pnCard3 = new JPanel();
		// pnCard3.setBackground(Color.RED);

		pnCenter.add(pnCard1, "mycard1");
		pnCenter.add(pnCard2, "mycard2");
		// pnCenter.add(pnCard3, "mycard3");

		pnBorder.add(pnCenter, BorderLayout.CENTER);
		Container con = getContentPane();
		con.add(pnBorder);
		btnShowCard1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout) pnCenter.getLayout();
				cl.show(pnCenter, "mycard1");
			}
		});
		btnShowCard2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout) pnCenter.getLayout();
				cl.show(pnCenter, "mycard2");
			}
		});
		// btnShowCard3.addActionListener(new ActionListener() {
		// @Override
		// public void actionPerformed(ActionEvent arg0) {
		// CardLayout cl = (CardLayout) pnCenter.getLayout();
		// cl.show(pnCenter, "mycard3");
		// }
		// });
	}

	private void b5() {
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());

		JPanel pnN = new JPanel();
		JButton showCard1 = new JButton("Card 1");
		// ImageIcon icon = new ImageIcon("src\\img\\mywatch.png");
		// showCard1.setMnemonic('C');
		JButton showCard2 = new JButton("Card 2");
		pnN.add(showCard1);
		pnN.add(showCard2);
		pnBorder.add(pnN, BorderLayout.NORTH);

		JPanel pnC = new JPanel();
		pnC.setLayout(new CardLayout());
		JPanel card1 = new JPanel();
		card1.setBackground(Color.GREEN);
		JPanel card2 = new JPanel();
		card2.setBackground(Color.RED);
		pnC.add(card1, "card_1");
		pnC.add(card2, "card_2");

		pnBorder.add(pnC, BorderLayout.CENTER);
		Container con = getContentPane();
		con.add(pnBorder);

		showCard1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) pnC.getLayout();
				cl.show(pnC, "card_1");
			}
		});
		showCard2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) pnC.getLayout();
				cl.show(pnC, "card_2");
			}
		});

		// JButton btn = new JButton("Watch");
		// btn.setIcon(new ImageIcon("mywatch.png"));
		// Container con = getContentPane();
		// con.add(btn);
		// btn.addActionListener(new ActionListener() {
		// @Override
		// public void actionPerformed(ActionEvent arg0) {
		// // do something here coding here
		// }
		// });
		// btn.setMnemonic('W');
	}

	private void b6() {
		JPanel login = new JPanel();
		login.setLayout(null);
		JLabel tk = new JLabel("Tài khoản");
		tk.setBounds(100, 100, 90, 30);
		JTextField inputTK = new JTextField();
		inputTK.setBounds(200, 100, 150, 30);
		JLabel mk = new JLabel("Mật khẩu");
		mk.setBounds(100, 200, 90, 30);
		JPasswordField inputMK = new JPasswordField();
		inputMK.setBounds(200, 200, 150, 30);
		JButton sm = new JButton("SUBMIT");
		sm.setBounds(150, 300, 100, 30);
		login.add(tk);
		login.add(inputTK);
		login.add(mk);
		login.add(inputMK);
		login.add(sm);
		Container con = getContentPane();
		con.add(login);
		inputMK.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					sm.doClick();
				}
			}
		});
		sm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = JOptionPane.showInputDialog(null, "Nhập tên nhá:", "Nhập tên vào đi!",
						JOptionPane.NO_OPTION);
				JOptionPane.showMessageDialog(null, ""+s+" con bện", "Con gì", JOptionPane.NO_OPTION);
				int n = JOptionPane.showConfirmDialog(null, "Nó là 1 con bện đúng không?", "Hỏi chơi thôi",
						JOptionPane.YES_NO_OPTION);
				if (n == 0) {
					System.exit(0);
				}
			}
		});
	}

	private void b7() {
		JPanel b7 = new JPanel();
//		b7.setBackground(Color.GREEN);
		b7.setLayout(null);
		JButton bt = new JButton("DATE");
//		bt.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		bt.setBorderPainted(false); //~~~~~~delete border
		bt.setContentAreaFilled(false); //~~~~~~delete background
		bt.setHorizontalAlignment(JButton.LEADING);
		
		bt.setBounds(10, 10, 90, 30);
		JTextField myTextField = new JTextField();
//		myTextField.setBackground(new Color(0, 0, 0, 0));
		myTextField.setBounds(110, 10, 200, 30);
		JLabel lb = new JLabel();
		lb.setBounds(320, 10, 200, 30);
		b7.add(bt);
		b7.add(myTextField);
		b7.add(lb);
		Container con = getContentPane();
		con.add(b7);
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				String dateTimeString = df.format(now);
				myTextField.setText(dateTimeString);
				lb.setText(dateTimeString);
			}
		});
//		lb.addAncestorListener(new AncestorListener() {
//			
//			@Override
//			public void ancestorRemoved(AncestorEvent event) {
//				Date now = new Date();
//				DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//				String dateTimeString = df.format(now);
//				lb.setText(dateTimeString);
//			}
//		});
	}

	private void initUI() {
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		createLayout(quitButton);
	}

	private void createLayout(JComponent... arg) {
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		gl.setAutoCreateContainerGaps(true);
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));
	}

	public static void main(String[] args) {
		MyJFrame ui = new MyJFrame();
		ui.setVisible(true);
	}
}