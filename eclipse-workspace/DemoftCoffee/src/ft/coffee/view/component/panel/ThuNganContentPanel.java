package ft.coffee.view.component.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class ThuNganContentPanel extends JSplitPane {

	private static final long serialVersionUID = 1L;

	private JScrollPane leftScrollContainer;
	private JPanel leftContainer;
	private JScrollPane rightScrollContainer;
	private JPanel rightContainer;

	public ThuNganContentPanel() {
		setBackground(Color.WHITE);
		leftContainer = new JPanel();
		leftScrollContainer = new JScrollPane(leftContainer, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		rightContainer = new JPanel();
		rightScrollContainer = new JScrollPane(rightContainer, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		setLeftComponent(leftScrollContainer);
		setRightComponent(rightScrollContainer);
		setOneTouchExpandable(true);
		setDividerLocation(250);

	}
}
