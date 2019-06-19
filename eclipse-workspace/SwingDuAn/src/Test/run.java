package Test;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author kynangcntt.info
 */
public class run {
    private JLabel lblKetQua,lblResult;
    private JComboBox cboTraiCay;
    private DefaultComboBoxModel<String> mdlCboTraiCay;
    private JButton btnThem,btnXoa,btnSua;
    private JTextField txtMoi,txtCapNhat;

    public run() {
        initComponents();
    }

    private void initComponents() {
        JFrame frmMainWindow = new JFrame("JComboBox Demo");
        frmMainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMainWindow.setSize(255, 190);
        frmMainWindow.setResizable(false);
        frmMainWindow.setAlwaysOnTop(true);
        
        frmMainWindow.setContentPane(createGUI());
        
        frmMainWindow.setLocationRelativeTo(null);
        frmMainWindow.setVisible(true);
    }
    
    private void doThem(){
        mdlCboTraiCay.addElement(txtMoi.getText().trim());
    }
    
    private int findItemInCombo(String str){
        for (int i = 0; i < mdlCboTraiCay.getSize(); i++) {
            if (str.equalsIgnoreCase(mdlCboTraiCay.getElementAt(i))) {
                return i;
            }
        }
        
        return -1;
    }
    
    private void doXoa(){
        String str = txtMoi.getText().trim();
        int index = findItemInCombo(str);
        
        if (index !=-1) {
            mdlCboTraiCay.removeElementAt(index);
        }
    }
    
    private void doSua(){
        String str = txtMoi.getText().trim();
        String strMoi = txtCapNhat.getText().trim();
        
        int index = findItemInCombo(str);
        
        if (index !=-1) {            
            mdlCboTraiCay.removeElementAt(index);
            mdlCboTraiCay.insertElementAt(strMoi, index);
        }
    }
    
    private void btnClickHandler(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn==btnThem) {
            doThem();
        }else{
            if (btn == btnXoa) {
                doXoa();
            } else {
                doSua();
            }
        }
    }
    
    private void cboTraiCayItemStateChangedHandler(ItemEvent e){
        lblResult.setText(cboTraiCay.getSelectedItem().toString());
    }
    
    private JPanel createGUI(){
        JPanel myGUI = new JPanel();
        myGUI.setLayout(null);  // Không chỉ định layout
        // do đó các control đưa vào theo hệ thống tạo độ
        
        lblKetQua = new JLabel("Kết quả:");
        lblKetQua.setBounds(10, 10, 50, 20);
        
        lblResult = new JLabel();
        lblResult.setBounds(70, 10, 150, 20);
        
        mdlCboTraiCay = new DefaultComboBoxModel<String>();
        
        cboTraiCay = new JComboBox();
        cboTraiCay.setBounds(70, 40, 150, 20);
        cboTraiCay.setModel(mdlCboTraiCay);
        cboTraiCay.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                cboTraiCayItemStateChangedHandler(e);
            }
        });
        
        btnThem = new JButton("Thêm");
        btnThem.setBounds(10, 70, 70, 20);
        
        btnXoa = new JButton("Xóa");
        btnXoa.setBounds(90, 70, 70, 20);
        
        btnSua = new JButton("Sửa");
        btnSua.setBounds(170, 70, 70, 20);
                
        txtMoi = new JTextField();
        txtMoi.setBounds(10, 100, 230, 20);
        
        txtCapNhat = new JTextField();
        txtCapNhat.setBounds(10, 130, 230, 20);
        
        myGUI.add(lblKetQua);
        myGUI.add(lblResult);
        myGUI.add(cboTraiCay);
        myGUI.add(btnThem);
        myGUI.add(btnXoa);
        myGUI.add(btnSua);
        myGUI.add(txtMoi);
        myGUI.add(txtCapNhat);
        
        for (Component component : myGUI.getComponents()) {
            if (component instanceof JButton) {
                JButton btn = (JButton) component;
                btn.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btnClickHandler(e);
                    }            
                });
            }
        }
        
        return myGUI;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new run();
            }
        });
    }
}