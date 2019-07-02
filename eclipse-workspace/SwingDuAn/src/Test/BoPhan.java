package Test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

public class BoPhan extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ThemBP themBP;
	
	private JPanel pnN;
	private JButton btnThemBoPhan;
	private JButton btnXoaBoPhan;

	private JPanel pnC;
	private JPanel pnL;
	private JTree tree;

	private JPanel pnR;
	
	private String nameBP;

	public void setNameBP(String nameBP) {
		this.nameBP = nameBP;
	}

	public BoPhan() {
//		this.nameBP = nameBP;
		setSize(900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		initScreen();
	}

	private void initScreen() {
		themBP = new ThemBP();
		themBP.getBtnSave().addActionListener(hd);
		
		pnN = new JPanel();
		pnN.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		btnThemBoPhan = new JButton();
		setBT(pnN, btnThemBoPhan, "Thêm BP");
		btnXoaBoPhan = new JButton();
		setBT(pnN, btnXoaBoPhan, "Xóa BP");

		pnC = new JPanel();
		pnC.setLayout(new BorderLayout());
		pnL = new JPanel();
		pnL.setBackground(Color.WHITE);
		pnL.setPreferredSize(new Dimension(250, 0));
		pnL.setLayout(new BorderLayout());

//		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root Node");
//		DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);
//		treeModel.addTreeModelListener(new MyTreeModelListener());
//
//		tree = new JTree(treeModel);
//		tree.setEditable(true);
//		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
//		tree.setShowsRootHandles(true);

		pnR = new JPanel();
		pnR.setBackground(Color.GREEN);
		pnC.add(pnL, BorderLayout.WEST);
		pnC.add(pnR, BorderLayout.CENTER);

		this.add(pnN, BorderLayout.NORTH);
		this.add(pnC, BorderLayout.CENTER);
//		System.out.println(themBP.getTfNhapBP().getText());
	}

	private void setBT(JPanel pn, JButton btn, String name) {
		btn.setPreferredSize(new Dimension(90, 26));
		btn.setText(name);
		btn.addActionListener(hd);
		pn.add(btn);
	}

//	@SuppressWarnings("unused")
//	private Object BookInfo(String name) {
//		return name;
//	}

	private ActionListener hd = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object ac = e.getSource();
			if (ac == btnThemBoPhan) {
				ThemBP ui = new ThemBP();
				ui.setVisible(true);
//				System.out.println(themBP.getTfNhapBP().getText());
			}else if(ac == themBP.getBtnSave()) {
				System.out.println(themBP.getTfNhapBP().getText());
				dispose();
			}
		}
	};

	public static void main(String[] args) {
		BoPhan ui = new BoPhan();
		ui.setVisible(true);
	}
}
