package Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

//import org.jdatepicker.graphics.*;
public class ShowLich2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShowLich2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);// ~~~ không cho phóng lớn
		setLocationRelativeTo(null);
		setSize(300, 300);
		GUI();
	}

	private void GUI() {	
		JPanel show = new JPanel();
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		
		Calendar cal = new GregorianCalendar();
		model.setYear(cal.get(Calendar.YEAR));
		model.setMonth(cal.get(Calendar.MONTH));
		model.setDay(cal.get(Calendar.DAY_OF_MONTH));
		
//		model.setYear(2000);
//		model.setMonth(7);// ~~~ trừ 1 tháng
//		model.setDay(20);
		
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setTextEditable(true);// ~~~ chỉnh sửa
		datePicker.setShowYearButtons(true);// ~~~ thêm nút tua năm
		datePanel.getModel().setSelected(true);
		show.add(datePicker);
		this.add(show);
	}

	public static void main(String[] args) {
		ShowLich2 d1 = new ShowLich2();
		d1.setVisible(true);
	}
}