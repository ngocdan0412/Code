package org.kah;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class Application {

	/**
	 * Bản đồ để lưu trữ các tùy chọn được chọn cuối cùng. Điều này sẽ lưu trữ hiệu
	 * quả cài đặt cho từng mục trong cây, khi chúng đang được đặt.
	 */
	private static Map<TreeNode, Set<String>> optionsMap = new HashMap<TreeNode, Set<String>>();

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		JFrame frame = new JFrame();
		JSplitPane contentPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

		final OptionsSelector optionsPanel = new OptionsSelector();
		JTree view = new JTree(getSampleStructure());
		view.setPreferredSize(new Dimension(150, 400));

		TreeSelectionModel selectionModel = view.getSelectionModel();
		selectionModel.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

		// Sử dụng một bộ lắng nghe để tìm hiểu khi lựa chọn thay đổi trong cây.
		selectionModel.addTreeSelectionListener(new TreeSelectionListener() {

			@Override
			public void valueChanged(TreeSelectionEvent e) {
				// Lưu trữ các tùy chọn liên quan đến đường dẫn cũ.
				TreePath oldPath = e.getOldLeadSelectionPath();
				if (oldPath != null) {
					Object oldSelected = oldPath.getLastPathComponent();
					if (oldSelected instanceof TreeNode) {
						optionsMap.put((TreeNode) oldSelected, optionsPanel.getSelected());
					}
				}

				// Bây giờ, đặt các tùy chọn để phản ánh các cài đặt được lưu trữ.
				TreePath newPath = e.getNewLeadSelectionPath();
				if (newPath != null) {
					Object newSelected = newPath.getLastPathComponent();
					if (newSelected instanceof TreeNode) {
						optionsPanel.setSelected(optionsMap.get(newSelected));
					}
				}
			}
		});

		contentPane.add(view);
		contentPane.add(optionsPanel);

		frame.setPreferredSize(new Dimension(250, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(contentPane);
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * @return một cấu trúc cây mẫu cho khung nhìn cây của chúng ta
	 */
	public static DefaultMutableTreeNode getSampleStructure() {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Inventory", true);

		DefaultMutableTreeNode fruitsNode = new DefaultMutableTreeNode("Fruits", true);
		root.add(fruitsNode);
		fruitsNode.add(new DefaultMutableTreeNode("Orange", false));
		fruitsNode.add(new DefaultMutableTreeNode("Grapes", false));
		fruitsNode.add(new DefaultMutableTreeNode("Plum", false));

		DefaultMutableTreeNode bakeryNode = new DefaultMutableTreeNode("Bakery", true);
		root.add(bakeryNode);

		DefaultMutableTreeNode breadNode = new DefaultMutableTreeNode("Bread", true);
		bakeryNode.add(breadNode);
		breadNode.add(new DefaultMutableTreeNode("White", false));
		breadNode.add(new DefaultMutableTreeNode("Wholemean", false));
		breadNode.add(new DefaultMutableTreeNode("Multigrain", false));

		bakeryNode.add(new DefaultMutableTreeNode("Cake", false));
		bakeryNode.add(new DefaultMutableTreeNode("Donoughts", false));

		return root;
	}
}
