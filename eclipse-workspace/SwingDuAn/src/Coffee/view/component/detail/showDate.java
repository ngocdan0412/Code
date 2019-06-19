package Coffee.view.component.detail;

import java.awt.Dimension;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;

import javax.swing.JPanel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Test.DateLabelFormatter;

public class showDate extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public showDate() {
		setBackground(null);
		initScreen();
	}
	
	private void initScreen() {
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		
		Calendar cal = new GregorianCalendar();
		model.setYear(cal.get(Calendar.YEAR));
		model.setMonth(cal.get(Calendar.MONTH));
		model.setDay(cal.get(Calendar.DAY_OF_MONTH));
		
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setPreferredSize(new Dimension(150, 25));
//		datePicker.setTextEditable(true);// ~~~ chỉnh sửa
		datePicker.setShowYearButtons(true);// ~~~ thêm nút tua năm
		datePanel.getModel().setSelected(true);
		this.add(datePicker);
	}
}
