package Coffee.view;

import java.awt.*;

import javax.swing.*;

public class LoginTest extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public LoginTest() {
        setUndecorated(true);
        setSize(700, 500);
        setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("src\\Coffee\\img\\cafe4.png");
        setIconImage(img.getImage());
        initScreen();
    }

    public void initScreen() {
        ImageIcon background_img = new ImageIcon("src\\Coffee\\img\\bgcf.jpg");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_img, JLabel.CENTER);

        JPanel pnLogo = new JPanel();
        ImageIcon logo = new ImageIcon("src\\Coffee\\img\\logo.png");
        Image img_logo = logo.getImage();
        Image temp_logo = img_logo.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        logo = new ImageIcon(temp_logo);
        JLabel lbLogo = new JLabel("");
        lbLogo.setIcon(logo);
        pnLogo.add(lbLogo);
        pnLogo.setBounds(0, 0, 150, 150);
        pnLogo.setBackground(new Color(0, 0, 0, 0));
        background.add(pnLogo);

//		background.setBounds(0, 0, 900, 600);
        Container con = getContentPane();
        con.add(background);
    }

    public static void main(String[] args) {
        LoginTest ui = new LoginTest();
        ui.setVisible(true);
    }
}
