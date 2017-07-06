package Application;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import Game.Operations.Operation;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperationsList {
	private static JPanel panel;
	private static JScrollPane scrollPane;
	private static JList<String> list;
	private static List<Operation> operations;
	private static DefaultListModel<String> model = new DefaultListModel<>();
	private static JCheckBox checkBox = new JCheckBox("Auto Select");
	private static Operation selectedOperation;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void initializeList() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		list = new JList<>(model);
		scrollPane = new JScrollPane(list);
		panel.add(scrollPane);
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox.isSelected())
					update();
			}
		});
		panel.add(checkBox, BorderLayout.SOUTH);
		
		list.setVisibleRowCount(2);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		checkBox.setSelected(true);
	}
	
	public static void update() {
		if(list.getSelectedIndex() != -1)
			selectedOperation = operations.get(list.getSelectedIndex());
		model.clear();
		operations = Main.Game.getOperations();
		for(Operation o : operations) {
			model.addElement(o.getType());
		}
		if(checkBox.isSelected()) {
			int max = 0;
			int maxIndex = -1;
			for(int i = 0; i < operations.size(); i++)
				if(operations.get(i).getCapacity()-operations.get(i).getSpace() > max) {
					System.out.println(operations.get(i).getCapacity()-operations.get(i).getSpace());
					max = operations.get(i).getCapacity()-operations.get(i).getSpace();
					maxIndex = i;
				}
			if(maxIndex == -1)
				list.setSelectedIndex(-1);
			else
				list.setSelectedIndex(maxIndex);
		} else {
			if(list.getSelectedIndex() != -1)
				System.out.println("f");
				list.setSelectedIndex(operations.indexOf(selectedOperation));
		}
	}
	
	public static JPanel getList() {
		return panel;
	}
	
	public static Operation getSelected() {
		if(list.getSelectedIndex() == -1)
			return null;
		return operations.get(list.getSelectedIndex());
	}
}
