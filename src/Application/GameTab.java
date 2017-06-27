package Application;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import Game.ShortNumber;

import javax.swing.JButton;

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
	private final JLabel lblCellRate = new JLabel("Cells per Tick");
	private final static JLabel disCellRate = new JLabel("0");
	private final JLabel lblSpace = new JLabel("Space");
	private final static JLabel disSpace = new JLabel("0/0");
	private final JSeparator sepTop = new JSeparator();
	private final JSeparator sepBottom = new JSeparator();
	
	public GameTab() {
		super();
		setLayout(new MigLayout("insets 0 0 0 0", "[grow][grow][grow][grow][grow][grow]", "[grow][grow][][grow][grow][][grow][][][][grow][][grow][grow]"));
		lblCells.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		add(lblCells, "cell 2 0 2 1,alignx center,aligny center");
		
		add(sepTop, "cell 0 2 6 1");
		lblMoney.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		add(lblMoney, "cell 0 3 2 1,alignx center,aligny center");
		lblCellRate.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		add(lblCellRate, "cell 2 3 2 1,alignx center,aligny center");
		lblSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		add(lblSpace, "cell 4 3 2 1,alignx center,aligny center");
		disMoney.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		add(disMoney, "cell 0 4 2 1,alignx center,aligny center");
		disCellRate.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		add(disCellRate, "cell 2 4 2 1,alignx center,aligny center");
		disSpace.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		add(disSpace, "cell 4 4 2 1,alignx center,aligny center");
		
		add(sepBottom, "cell 0 5 6 1");
		lblSuperCells.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		add(lblSuperCells, "cell 2 6 2 1,alignx center,aligny center");
		disSuperCell.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		add(disSuperCell, "cell 2 7 2 1,alignx center,aligny center");
		
		add(tabbedPane, "cell 0 8 6 6,grow");
		
		tabbedPane.addTab("Cell Shop", tabCellShop);

		tabbedPane.addTab("Money Shop", tabMoneyTab);
		
		tabbedPane.addTab("Puppet Panel", tabPuppet);
		
		tabbedPane.addTab("Operations", tabOperations);
		
		disCells.setFont(new Font("Tahoma", Font.PLAIN, 40));
		add(disCells, "cell 0 1 6 1,alignx center,aligny center");
		
	}
	
	public static void setCells(long c) {
		String s = (new ShortNumber(c, false)).toString();
		disCells.setText(s);
	}
	
	public static void setCellRate(long c) {
		disCellRate.setText(new Long(c).toString());
	}
	
	public static void setSpace(int f, int c) {
		disSpace.setText(f+"/"+c);
	}
}
