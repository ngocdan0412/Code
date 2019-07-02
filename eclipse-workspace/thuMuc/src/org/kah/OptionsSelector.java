package org.kah;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class OptionsSelector extends JPanel {
	private static final long serialVersionUID = 1L;

	private static final String options[] = { "in stock", "popular",
			"reviewed", "in season" };

	/**
	 * Maintains a mapping of the options and their corresponding checkboxes for
	 * easy manipulation.
	 */
	private final Map<String, JCheckBox> controlMap = new HashMap<String, JCheckBox>();

	public OptionsSelector() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		for (String item : options) {
			JCheckBox control = new JCheckBox(item);
			add(control);
			controlMap.put(item, control);
		}
	}

	/**
	 * Changes the selected checkboxes.
	 * 
	 * @param selected
	 *            the options that should be selected
	 */
	public void setSelected(Set<String> selected) {
		for (Map.Entry<String, JCheckBox> controlPair : controlMap.entrySet()) {
			boolean makeSelected = false;
			if (selected != null) {
				makeSelected = selected.contains(controlPair.getKey());
			}
			controlPair.getValue().setSelected(makeSelected);
		}
	}

	/**
	 * @return the {@link Set} of selected options
	 */
	public Set<String> getSelected() {
		Set<String> selectedSet = new HashSet<String>();
		for (Map.Entry<String, JCheckBox> controlPair : controlMap.entrySet()) {
			if (controlPair.getValue().isSelected()) {
				selectedSet.add(controlPair.getKey());
			}
		}
		return selectedSet;
	}
}
