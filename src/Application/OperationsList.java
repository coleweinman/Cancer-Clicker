package Application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Game.Operations.Operation;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperationsList {
	private JPanel panel;
	private JScrollPane scrollPane;
	private JList<String> list;
	private static List<Operation> operations;
	private DefaultListModel<String> model = new DefaultListModel<>();
	private JCheckBox checkBox = new JCheckBox("Auto Select");
	private static Operation selectedOperation;
	private static int selected = 0;
	private static boolean checked = true;
	private static ArrayList<OperationsList> ol = new ArrayList<OperationsList>();

	public OperationsList() {
		ol.add(this);
		panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		list = new JList<>(model);
		scrollPane = new JScrollPane(list);
		panel.add(scrollPane);
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected()) {
					checked = true;
					update();
				} else {
					checked = false;
				}
			}
		});

		panel.add(checkBox, BorderLayout.SOUTH);

		list.setVisibleRowCount(2);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		checkBox.setSelected(true);
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (list.getSelectedIndex() != -1) {
					selected = list.getSelectedIndex();
					selectedOperation = operations.get(list.getSelectedIndex());
					for (OperationsList o : ol)
						o.getBase().setSelectedIndex(selected);
				}
			}
		});
		update();
	}

	public static void update() {
		for (OperationsList o : ol)
			o.getModel().clear();
		operations = Main.Game.getOperations();
		for (Operation o : operations) {
			for (OperationsList opl : ol)
				opl.getModel().addElement(o.getType());
		}
		if (checked) {
			int max = 0;
			int maxIndex = -1;
			for (int i = 0; i < operations.size(); i++)
				if (operations.get(i).getCapacity() - operations.get(i).getSpace() > max) {
					max = operations.get(i).getCapacity() - operations.get(i).getSpace();
					maxIndex = i;
				}
			if (maxIndex == -1)
				for (OperationsList o : ol) {
					if (o.getBase() == null)
						update();
					o.getBase().setSelectedIndex(-1);
				}
			else
				for (OperationsList o : ol) {
					if (o.getBase() == null)
						update();
					o.getBase().setSelectedIndex(maxIndex);
				}
		} else {
			for (OperationsList opl : ol)
				if (opl.getBase().getSelectedIndex() != -1)
					opl.getBase().setSelectedIndex(operations.indexOf(selectedOperation));
		}
	}

	public JPanel getList() {
		return panel;
	}

	public Operation getSelected() {
		if (list.getSelectedIndex() == -1)
			return null;
		return operations.get(list.getSelectedIndex());
	}

	public DefaultListModel<String> getModel() {
		return model;
	}

	public JList<String> getBase() {
		return list;
	}
}
