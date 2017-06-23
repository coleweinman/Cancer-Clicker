package Application;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import net.miginfocom.swing.MigLayout;

public class GameTab extends JPanel {
	private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JPanel tabCellShop = new CellShopTab();
	private JPanel tabMoneyTab = new MoneyShopTab();
	private JPanel tabPuppet = new PuppetTab();
	private JPanel tabOperations = new OperationsTab();
	private final JLabel lblCells = new JLabel("Cells");
	private final JLabel lblMoney = new JLabel("Money");
	private final static JLabel disMoney = new JLabel("0");
	private final JLabel lblSuperCells = new JLabel("Super Cells");
	private final static JLabel disSuperCell = new JLabel("0");
	private final static JLabel disCells = new JLabel("0");
	
	public GameTab() {
		super();
		setLayout(new MigLayout("insets 0 0 0 0", "[grow][grow][grow][grow][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow][grow][grow][][][grow][][grow][grow]"));
		lblCells.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		add(lblCells, "cell 2 1 3 1,alignx center");
		lblMoney.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		add(lblMoney, "cell 1 4 2 1,alignx center,aligny center");
		lblSuperCells.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		add(lblSuperCells, "cell 4 4 2 1,alignx center");
		disMoney.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		add(disMoney, "cell 1 5 2 1,alignx center,aligny center");
		disSuperCell.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		add(disSuperCell, "cell 4 5 2 1,alignx center,aligny center");
		
		add(tabbedPane, "cell 0 8 7 6,grow");
		
		tabbedPane.addTab("Cell Shop", tabCellShop);

		tabbedPane.addTab("Money Shop", tabMoneyTab);
		
		tabbedPane.addTab("Puppet Panel", tabPuppet);
		
		tabbedPane.addTab("Operations", tabOperations);
		
		disCells.setFont(new Font("Tahoma", Font.PLAIN, 40));
		add(disCells, "cell 1 2 5 2,alignx center,aligny center");
		
	}
	
	public static void setCells(long c) {
		disCells.setText(new Long(c).toString());
	}
}
