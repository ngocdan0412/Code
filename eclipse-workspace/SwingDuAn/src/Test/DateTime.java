package Test;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class DateTime extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel timeSystem;
    private JLabel calendarTK;
    
	public DateTime() {
		setSize(400, 200);
        timeSystem = new JLabel();
        timeSystem.setBounds(20, 40, 100, 20);
        timeSystem.setFont(new Font("", Font.BOLD, 20));
        
        calendarTK = new JLabel();
        calendarTK.setBounds(20, 60, 100, 20);
        calendarTK.setFont(new Font("", Font.BOLD, 20));

        add(timeSystem);
        add(calendarTK);
        setLayout(null);
        // dóng chương trình khi đóng của sổ
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        
        setVisible(true);
        
        // thiết lập lại đồng hồ sau mỗi 1 giây
        try {
            while (true) {
                Calendar cal = new GregorianCalendar();
                int second = cal.get(Calendar.SECOND);
                int minute = cal.get(Calendar.MINUTE);
                int hour = cal.get(Calendar.HOUR_OF_DAY);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int month = cal.get(Calendar.MONTH);
                int year = cal.get(Calendar.YEAR);

                timeSystem.setText(hour + ":" + minute + ":" + second);
                calendarTK.setText(day + "/" + (month + 1) + "/" + year);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
    /**
     * main
     * 
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) {
        new DateTime();
    }
}
