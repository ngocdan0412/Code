package Coffee.view.component;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class CenterPanel extends JTabbedPane{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> listTabName;

	public CenterPanel() {
		setTabLayoutPolicy(SCROLL_TAB_LAYOUT);
		listTabName = new ArrayList<String>();
	}

	private int getIndexTabByTitle(String title) {
		int index = -1;
		for (int i = 0; i < listTabName.size(); i++) {
			if (listTabName.get(i).equals(title)) {
				index = i;
				break;
			}
		}
		return index;
	}

	@Override
	public void addTab(String title, Component component) {
		int index = getIndexTabByTitle(title);
		if (index == -1) {
			super.addTab(title, component);
			listTabName.add(title);
			if (listTabName.size() != 1) {
				setTabComponentAt(listTabName.size() - 1, new CustomTab(title));
			}
			setSelectedIndex(listTabName.size() - 1);
		} else {
			setSelectedIndex(index);
		}
	}

	private class CustomTab extends JPanel implements ActionListener {

		private static final long serialVersionUID = 1L;

		private JLabel lblTitleTab;
		private JButton btnCloseTab;

		public CustomTab(String title) {
			setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			setOpaque(false);

			lblTitleTab = new JLabel(title);
			btnCloseTab = new JButton("✕");
			btnCloseTab.setMargin(new Insets(0, 0, 0, 0));
			btnCloseTab.setPreferredSize(new Dimension(18, 18));
			btnCloseTab.setOpaque(false);
			btnCloseTab.setContentAreaFilled(false);
			btnCloseTab.setBorderPainted(false);
			btnCloseTab.addActionListener(this);

			add(lblTitleTab);
			add(btnCloseTab);
			
			btnCloseTab.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					btnCloseTab.setForeground(Color.BLACK);
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					btnCloseTab.setForeground(Color.RED);
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			int index = getIndexTabByTitle(lblTitleTab.getText());
			CenterPanel.this.remove(index);
			listTabName.remove(index);
		}
	}
}
