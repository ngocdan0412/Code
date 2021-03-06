package Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jdatepicker.JDateComponentFactory;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;

public class ShowLich extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ShowLich() {
		super("Demo Lịch");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		date();
	}
	private void date() {
		JPanel jPanel = new JPanel();

	    JDatePicker picker = new JDateComponentFactory().createJDatePicker();
	    picker.setTextEditable(true);
	    picker.setShowYearButtons(true);
//	    ((JComponent) picker).setPreferredSize(new Dimension(150, 26));
	    jPanel.add((JComponent) picker);
	    
	    Calendar cal = new GregorianCalendar();
	    picker.getModel().setYear(cal.get(Calendar.YEAR));
	    picker.getModel().setMonth(cal.get(Calendar.MONTH));
	    picker.getModel().setDay(cal.get(Calendar.DAY_OF_MONTH));
	    
	    picker.getModel().setSelected(true);
	    this.add(jPanel);
		

	}
	public static void main(String[] args) {
		ShowLich ui = new ShowLich();
		ui.setVisible(true);
	}
}