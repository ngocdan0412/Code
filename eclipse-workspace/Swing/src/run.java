import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
public class run extends JFrame {
  public run() {

    getContentPane().setLayout(new FlowLayout());

    JPasswordField textField1 = new JPasswordField(2);
    JPasswordField textField2 = new JPasswordField("mm", 2);

    getContentPane().add(textField1);
    getContentPane().add(textField2);

    setSize(300, 190);
    setVisible(true);
  }

  public static void main(String argv[]) {
    new run();
  }
}