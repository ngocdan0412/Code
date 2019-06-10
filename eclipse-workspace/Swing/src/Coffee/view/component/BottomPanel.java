package Coffee.view.component;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BottomPanel extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public BottomPanel() {
		setPreferredSize(new Dimension(Integer.MAX_VALUE, 30));
		setBackground(Color.BLUE);
		date();
	}

	public void date() {
		JPanel showDate = new JPanel();
		showDate.setBackground(Color.YELLOW);
		
		JLabel timeSystem = new JLabel();
		JLabel calendarTK = new JLabel();

		showDate.add(timeSystem);
		showDate.add(calendarTK);
		
		this.setLayout(new BorderLayout());
		this.add(showDate, BorderLayout.EAST);
		
//		try {
//            while (true) {
//                Calendar cal = new GregorianCalendar();
//                int second = cal.get(Calendar.SECOND);
//                int minute = cal.get(Calendar.MINUTE);
//                int hour = cal.get(Calendar.HOUR_OF_DAY);
//                int day = cal.get(Calendar.DAY_OF_MONTH);
//                int month = cal.get(Calendar.MONTH);
//                int year = cal.get(Calendar.YEAR);
//
//                timeSystem.setText(hour + ":" + minute + ":" + second);
//                calendarTK.setText(day + "/" + (month + 1) + "/" + year);
//                Thread.sleep(1000);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
	}
}
