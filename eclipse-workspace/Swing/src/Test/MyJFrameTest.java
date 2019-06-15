package Test;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class MyJFrameTest extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private CardLayout cardLayout;
	private JPanel centerPanel;
	private JButton btnCard1;
	private JButton btnCard2;
	private JTextArea jTextArea;

	public MyJFrameTest() {
		super("demo windown");
		initScreen();
		addItem();
	}

	private void addItem() {
		// tao ra 4 check box
		JCheckBox javaCheckbox = new JCheckBox("Java");
		JCheckBox rubyCheckBox = new JCheckBox("Ruby");
		JCheckBox pythonCheckbox = new JCheckBox("Python");
		JCheckBox javaScriptCheckbox = new JCheckBox("JavaScript");
		JPanel languagePanel = new JPanel();
		languagePanel.setLayout(new GridLayout(2, 2));
		languagePanel.add(javaScriptCheckbox);
		languagePanel.add(rubyCheckBox);
		languagePanel.add(pythonCheckbox);
		languagePanel.add(javaCheckbox);
		
		Border border1 = BorderFactory.createLineBorder(Color.RED, 2);
		TitledBorder titledBorder2 = BorderFactory.createTitledBorder(border1, "language");
		languagePanel.setBorder(titledBorder2);

		// tạo lable
		JLabel lblemo = new JLabel("aaaa b c");
		lblemo.setForeground(Color.BLUE);
		ImageIcon imageIcon = new ImageIcon(
				new ImageIcon("time.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		lblemo.setIcon(imageIcon);

		// tabo text box
		JTextField jTextField = new JTextField(20);

		// tao 2 button dieu khien hien thi cho card layout
		btnCard1 = new JButton("Card 1");
		btnCard2 = new JButton("Card 2");
		btnCard2.setIcon(new ImageIcon("time.png"));
		btnCard1.setForeground(Color.RED);
		btnCard2.setBackground(Color.GREEN);

		jTextArea = new JTextArea(3, 20);
		JScrollPane jScrollPaneArea = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		// tao 1 khung chinh voi card layout
		centerPanel = new JPanel();
		cardLayout = new CardLayout();
		centerPanel.setLayout(cardLayout);

		// tao border cho centerPanel
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
		TitledBorder titledBorder = BorderFactory.createTitledBorder(border, "demo");
		centerPanel.setBorder(titledBorder);

		// tao 2 card panel con
		JPanel card1Panel = new JPanel();
		card1Panel.setBackground(Color.GRAY);
		card1Panel.add(lblemo);
		JPanel card2Panel = new JPanel();
		card2Panel.setBackground(Color.PINK);
		card2Panel.add(jTextField);

		// them 2 card vao khung chinh
		centerPanel.add(card1Panel, "card1");
		centerPanel.add(card2Panel, "card2");

		// set layout cho container
		Container container = getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

		// them khung chinh vao content panel
		container.add(languagePanel);
		container.add(centerPanel);

		// them 2 button vào
		container.add(btnCard1);
		container.add(btnCard2);

		// add text area scroll vao
		container.add(jScrollPaneArea);

		// xy ly hien thi card 1
		btnCard1.addActionListener(this);

		// xy ly hien thi card 2
		btnCard2.addActionListener(this);
	}

	private void initScreen() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		if (object == btnCard1) {
			cardLayout.show(centerPanel, "card1");
		} else if (object == btnCard2) {
			cardLayout.show(centerPanel, "card2");
		} else {
			System.out.println("not support");
		}
	}

	public static void main(String[] args) {
		MyJFrameTest myJFrame = new MyJFrameTest();
		myJFrame.setVisible(true);
	}

}
