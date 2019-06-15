package Test;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class GiaiPhuongTrinhJFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	float coefficientA;
	float coefficientB;
	float coefficientC;

	private JLabel lblCoefficientA;
	private JLabel lblCoefficientB;
	private JLabel lblCoefficientC;

	private JTextField tfCoefficientA;
	private JTextField tfCoefficientB;
	private JTextField tfCoefficientC;

	private JButton btnResolve;
	private JButton btnClean;

	private JLabel lblresult;

	public GiaiPhuongTrinhJFrame() {
		initScreen();
	}

	private void initScreen() {
		// các label cho hệ số
		lblCoefficientA = new JLabel("a :");
		lblCoefficientB = new JLabel("b :");
		lblCoefficientC = new JLabel("c :");

		// các textfield cho hệ số
		tfCoefficientA = new JTextField(5);
		tfCoefficientB = new JTextField(5);
		tfCoefficientC = new JTextField(5);

		// vùng div cho phần input hệ số
		JPanel inputCoefficientPanel = new JPanel();
		inputCoefficientPanel.setMaximumSize(new Dimension(500, 100));
		TitledBorder border = BorderFactory.createTitledBorder("Input coefficient");
		inputCoefficientPanel.setBorder(border);

		inputCoefficientPanel.add(lblCoefficientA);
		inputCoefficientPanel.add(tfCoefficientA);
		inputCoefficientPanel.add(lblCoefficientB);
		inputCoefficientPanel.add(tfCoefficientB);
		inputCoefficientPanel.add(lblCoefficientC);
		inputCoefficientPanel.add(tfCoefficientC);

		// các button của màn hình
		btnResolve = new JButton("Giải");
		btnResolve.addActionListener(this);
		btnClean = new JButton("Xóa");
		btnClean.addActionListener(this);

		// vùng div cho các button
		JPanel actionPanel = new JPanel();
		actionPanel.setMaximumSize(new Dimension(200, 50));
		actionPanel.add(btnResolve);
		actionPanel.add(btnClean);

		// kết quả hiển thị
		lblresult = new JLabel();
		// vùng div cho phần hiển thị kết quả
		JPanel resultPanel = new JPanel();
		resultPanel.setMaximumSize(new Dimension(500, 100));
		TitledBorder border2 = BorderFactory.createTitledBorder("Result");
		resultPanel.setBorder(border2);

		resultPanel.add(lblresult);

		// thêm các div vào container
		Container container = getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

		container.add(inputCoefficientPanel);
		container.add(actionPanel);
		container.add(resultPanel);

		// setting common
		this.setSize(500, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	/**
	 * action các button trên màn hình
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		// nếu bấm nút giải
		if (object == btnResolve) {
			// kiểm tra data input
			if (!validateInputCoefficient()) {
				lblresult.setText("hệ số nhập vào sai");
				return;
			}

			if (coefficientA == 0) {
				if (coefficientB == 0) {
					if (coefficientC == 0) {
						lblresult.setText("Vô số nghiệm");
					} else {
						lblresult.setText("vô nghiệm");
					}
				} else {
					lblresult.setText("co nghiem x = " + (-coefficientC / coefficientB));
				}
			} else {
				double delta = coefficientB * coefficientB - 4 * coefficientA * coefficientC;
				if (delta == 0) {
					lblresult.setText("có nghiệm kép x = " + (-coefficientB / (2 * coefficientA)));
				} else if (delta > 0) {
					double x1 = (-coefficientB + Math.sqrt(delta)) / (2 * coefficientA);
					double x2 = (-coefficientB - Math.sqrt(delta)) / (2 * coefficientA);
					lblresult.setText("có 2 nghiệm: x1 = " + x1 + " và x2 = " + x2);
				} else {
					lblresult.setText("vô nghiệm");
				}
			}
		} else if (object == btnClean) { // nếu bấm nút xóa
			tfCoefficientA.setText("");
			tfCoefficientB.setText("");
			tfCoefficientC.setText("");
			lblresult.setText("");
		}
	}

	/**
	 * Conver data và kiểm tra hợp lệ dữ liệu
	 * 
	 * @return true nếu hợp lệ và ngược lại
	 */
	private boolean validateInputCoefficient() {
		try {
			coefficientA = Integer.parseInt(tfCoefficientA.getText());
			coefficientB = Integer.parseInt(tfCoefficientB.getText());
			coefficientC = Integer.parseInt(tfCoefficientC.getText());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void main(String[] args) {
		GiaiPhuongTrinhJFrame giaiPhuongTrinhJFrame = new GiaiPhuongTrinhJFrame();
		giaiPhuongTrinhJFrame.setVisible(true);
	}

}
