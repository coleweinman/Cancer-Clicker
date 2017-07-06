package Application;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Game.Operations.Operation;
import Game.Characters.Character;
import net.miginfocom.swing.MigLayout;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;

public class ManageTab extends JPanel {
	private JList<String> listOperations;
	private JList<String> listCharacters;
	private List<Operation> operations;
	
	JSeparator separator = new JSeparator();
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	JPanel operationsTabStats = new JPanel();
	JLabel lblSpace = new JLabel("Space");
	JSeparator separator_1 = new JSeparator();
	JLabel lblMultipliers = new JLabel("Multipliers");
	JLabel disSpace = new JLabel("0/0");
	JLabel disMultipliers = new JLabel("<html>Cell: 0.0%<br>Money: 0.0%<br>Supercell: 0.0%</html>");
	JLabel lblCellRate = new JLabel("Cells");
	JLabel lblMoneyRate = new JLabel("Money");
	JLabel disCellRate = new JLabel("<html>Gross: 0<br>Cost: 0<br>Net: 0</html");
	JLabel disMoneyRate = new JLabel("<html>Gross: 0<br>Cost: 0<br>Money: 0</html");
	JPanel operationsSettingsTab = new JPanel();
	JSeparator separator_2 = new JSeparator();
	JButton btnSettings = new JButton("Settings");
	JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	private final JSeparator separator_3 = new JSeparator();
	private final JSeparator separator_4 = new JSeparator();
	private final JSeparator separator_5 = new JSeparator();
	private final JSeparator separator_6 = new JSeparator();
	private final JSeparator separator_7 = new JSeparator();
	private final JLabel lblCSpace = new JLabel("Space");
	private final JLabel lblCMultipliers = new JLabel("Multipliers");
	private final JLabel disCMultiplier = new JLabel("<html>Cell: 0.0%<br>Money: 0.0%<br>Supercell: 0.0%</html>");
	private final JLabel disCSpace = new JLabel("0");
	private final JLabel label_2 = new JLabel("Cells");
	private final JLabel label_3 = new JLabel("Money");
	private final JLabel disCCells = new JLabel("0");
	private final JLabel disCMoney = new JLabel("0");
	private Operation o;
	
	
	public ManageTab() {
		setLayout(new MigLayout("insets 0 0 0 0", "[grow][][]", "[grow][grow][grow][grow][grow][grow]"));
		
		DefaultListModel<String> modelOperations = new DefaultListModel<>();
		Application.getTabbedPane().addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				modelOperations.clear();
				operations = Main.Game.getOperations();
				for(Operation o : operations)
					modelOperations.addElement(o.getType());
			}
		});
		
		JLabel lblOperations = new JLabel("Operations");
		lblOperations.setFont(new Font("Tahoma", Font.BOLD, 24));
		add(lblOperations, "cell 0 0,alignx center,growy");
		
		JLabel lblCharacters = new JLabel("Characters");
		lblCharacters.setFont(new Font("Tahoma", Font.BOLD, 24));
		add(lblCharacters, "cell 2 0 4 1,alignx center,growy");
		
		listOperations = new JList<>(modelOperations);
		listOperations.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listOperations.setLayoutOrientation(JList.VERTICAL);
		add(new JScrollPane(listOperations), "cell 0 1 1 2,grow");
		
		DefaultListModel<String> modelCharacters = new DefaultListModel<>();
		listCharacters = new JList<>(modelCharacters);
		listCharacters.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				Character c = o.getCharacters().get(listOperations.getSelectedIndex());
				disCMultiplier.setText("<html>Cell: " + c.getCellMult() + "%<br>Money: " + c.getMoneyMult() + "%<br>Supercell: " + c.getSuperCellMult() + "</html>");
				disCCells.setText(c.getCellRate()+"");
				disCMoney.setText(c.getMoneyRate()+"");
				disCSpace.setText(c.getSpace()+"");
			}
		});
		
		listOperations.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(listOperations.getSelectedIndex() != -1) {
					modelCharacters.clear();
					o = operations.get(listOperations.getSelectedIndex());
					for(Character c : operations.get(listOperations.getSelectedIndex()).getCharacters())
						modelCharacters.addElement(c.getType());
					disSpace.setText(o.getSpace()+"/"+o.getCapacity());
					int cGross = 0;
					int mGross = 0;
					for(Character c : o.getCharacters()) {
						cGross += c.getCellRate();
						mGross += c.getMoneyRate();
					}
					disMultipliers.setText("<html>Cell: " + o.getCellMult() + "%<br>Money: " + o.getMoneyMult() + "%<br>Supercell: " + o.getSuperCellMult() + "</html>");
					disCellRate.setText("<html>Gross: " + cGross + "<br>Cost: " + o.getCellCost() + "<br>Net: " + (cGross-o.getCellCost()) + "</html>");
					disMoneyRate.setText("<html>Gross: " + mGross + "<br>Cost: " + o.getCellCost() + "<br>Net: " + (mGross-o.getMoneyCost()) + "</html>");
				}
			}
		});
		add(new JScrollPane(listCharacters), "cell 2 1 4 2,grow");
		
		
		separator.setOrientation(SwingConstants.VERTICAL);
		add(separator, "cell 1 0 1 8,alignx center,growy");
		
		
		add(tabbedPane, "cell 0 3 1 5,grow");
		
		
		tabbedPane.addTab("Stats", null, operationsTabStats, null);
		operationsTabStats.setLayout(new MigLayout("insets 0 0 0 0", "[grow][][grow]", "[grow][grow][][grow][grow]"));
		
		
		operationsTabStats.add(lblSpace, "flowy,cell 0 0,alignx center");
		lblSpace.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		separator_1.setOrientation(SwingConstants.VERTICAL);
		operationsTabStats.add(separator_1, "cell 1 0 1 5,grow");
		
		
		operationsTabStats.add(lblMultipliers, "flowy,cell 2 0,alignx center");
		lblMultipliers.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		disSpace.setFont(new Font("Tahoma", Font.PLAIN, 15));
		operationsTabStats.add(disSpace, "cell 0 1,alignx center,aligny top");
		
		
		disMultipliers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		operationsTabStats.add(disMultipliers, "cell 2 1,alignx center,aligny top");
		
		operationsTabStats.add(separator_3, "cell 0 2,grow");
		operationsTabStats.add(separator_4, "cell 2 2,grow");
		
		
		operationsTabStats.add(lblCellRate, "cell 0 3,alignx center");
		lblCellRate.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		lblMoneyRate.setFont(new Font("Tahoma", Font.BOLD, 16));
		operationsTabStats.add(lblMoneyRate, "cell 2 3,alignx center");
		
		
		disCellRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		operationsTabStats.add(disCellRate, "cell 0 4,alignx center,aligny top");
		
		
		disMoneyRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		operationsTabStats.add(disMoneyRate, "cell 2 4,alignx center,aligny top");
		
		
		tabbedPane.addTab("WIP", null, operationsSettingsTab, null);
		operationsSettingsTab.setLayout(new MigLayout("insets 0 0 0 0", "[grow][grow][grow]", "[grow][grow][grow][grow]"));
		
		
		separator_2.setOrientation(SwingConstants.VERTICAL);
		operationsSettingsTab.add(separator_2, "cell 1 0 1 4,grow");
		
		
		operationsSettingsTab.add(btnSettings, "cell 2 0 1 4,alignx center,aligny center");
		
		
		add(tabbedPane_1, "cell 2 3 1 3,grow");
		
		
		tabbedPane_1.addTab("Stats", null, panel_1, null);
		panel_1.setLayout(new MigLayout("insets 0 0 0 0", "[grow][][grow]", "[grow][grow][][grow][grow]"));
		lblCSpace.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		panel_1.add(lblCSpace, "cell 0 0,alignx center");
		separator_5.setOrientation(SwingConstants.VERTICAL);
		
		panel_1.add(separator_5, "cell 1 0 1 5,alignx center,growy");
		lblCMultipliers.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		panel_1.add(lblCMultipliers, "cell 2 0,alignx center");
		disCSpace.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		panel_1.add(disCSpace, "cell 0 1,alignx center,aligny top");
		disCMultiplier.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		panel_1.add(disCMultiplier, "cell 2 1,aligny top");
		
		panel_1.add(separator_6, "cell 0 2,growx,aligny center");
		
		panel_1.add(separator_7, "cell 2 2,growx,aligny center");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		panel_1.add(label_2, "cell 0 3,alignx center");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		panel_1.add(label_3, "cell 2 3,alignx center");
		disCCells.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		panel_1.add(disCCells, "cell 0 4,alignx center,aligny top");
		disCMoney.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		panel_1.add(disCMoney, "cell 2 4,alignx center,aligny top");
		panel_2.setLayout(new MigLayout("insets 0 0 0 0", "[grow][][grow]", "[grow][grow][grow][grow]"));
		
		
		tabbedPane_1.addTab("WIP", null, panel_2, null);
		
		
		
		
	}
	
}
