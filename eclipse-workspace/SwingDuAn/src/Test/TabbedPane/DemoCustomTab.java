package Test.TabbedPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.metal.MetalIconFactory;
 
/**
 * --------------------- @author nguyenvanquan7826 ---------------------
 * ------------------ website: cachhoc.net -------------------
 * ---------- date: Jul 24, 2014 - filename: DemoButtonTab.java ----------
 */
public class DemoCustomTab extends JPanel {
	private static final long serialVersionUID = 1L;
	DemoCustomJTabbedPane customJTabbedPane;
 
    /** JPanel contain a JLabel and a JButton to close */
    public DemoCustomTab(DemoCustomJTabbedPane customJTabbedPane) {
        this.customJTabbedPane = customJTabbedPane;
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        setBorder(new EmptyBorder(5, 2, 2, 2));
        setOpaque(false);
        addLabel();
        add(new CustomButton("✕"));// ✕	✖
    }
 
    private void addLabel() {
        JLabel label = new JLabel() {
			private static final long serialVersionUID = 1L;

			/** set text for JLabel, it will title of tab */
            public String getText() {
                int index = customJTabbedPane.tabbedPane
                        .indexOfTabComponent(DemoCustomTab.this);
                if (index != -1) {
                    return customJTabbedPane.tabbedPane.getTitleAt(index);
                }
                return null;
            }
        };
        /** add more space between the label and the button */
        label.setBorder(new EmptyBorder(0, 0, 0, 10));
        add(label);
    }
 
    class CustomButton extends JButton implements MouseListener {
		private static final long serialVersionUID = 1L;

		public CustomButton(String text) {
            int size = 20;
            setText(text);
            /** set size for button close */
            setPreferredSize(new Dimension(size, size));
 
            setToolTipText("close the Tab");
 
            /** set transparent */
            setContentAreaFilled(false);
 
            /** set border for button */
            setBorder(new EtchedBorder());
            /** don't show border */
            setBorderPainted(false);
 
            setFocusable(false);
 
            /** add event with mouse */
            addMouseListener(this);
 
        }
 
        /** when click button, tab will close */
        @Override
        public void mouseClicked(MouseEvent e) {
            int index = customJTabbedPane.tabbedPane
                    .indexOfTabComponent(DemoCustomTab.this);
            if (index != -1) {
                customJTabbedPane.removeTab(index);
            }
        }
 
        @Override
        public void mousePressed(MouseEvent e) {
        	setBackground(Color.RED);
        }
        
        @Override
        public void mouseReleased(MouseEvent e) {
        }
 
        /** show border button when mouse hover */
        @Override
        public void mouseEntered(MouseEvent e) {
//            setBorderPainted(true);
            setForeground(Color.RED);
        }
 
        /** hide border when mouse not hover */
        @Override
        public void mouseExited(MouseEvent e) {
//            setBorderPainted(false);
            setForeground(Color.BLACK);
        }
    }
}