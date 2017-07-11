package Application;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Game.CharacterData;
import Game.Characters.Tinky;
import Game.Characters.Trump;
import Main.Game;
import Main.ShortNumber;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class MoneyShopTab extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JButton[] btnBuy = new JButton[8];
	private static JLabel[] lblInfo = new JLabel[8];
	private JTextField textField;
	
	public MoneyShopTab() {
		setLayout(new MigLayout("insets 0 0 0 0", "[grow][grow][grow][grow][grow][grow]", "[grow][grow][grow][grow]"));
		
		for(int i = 0; i < lblInfo.length; i++) {
			lblInfo[i] = new JLabel();
			lblInfo[i].setFont(new Font("Tahoma", Font.BOLD, 15));
			lblInfo[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int i = 0; i < btnBuy.length; i++) {
			btnBuy[i] = new JButton("Buy");
			btnBuy[i].setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		
		lblInfo[0].setText("<html><center>Jake</center><center>" + new ShortNumber(CharacterData.Brian.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[1].setText("<html><center>Lance</center><center>" + new ShortNumber(CharacterData.Garrett.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[2].setText("<html><center>Nhan</center><center>" + new ShortNumber(CharacterData.Noah.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[3].setText("<html><center>Alex</center><center>" + new ShortNumber(CharacterData.Trump.getPrice().getCells(), true) + "c</center></html>");		
		lblInfo[4].setText("<html><center>BP</center><center>" + new ShortNumber(CharacterData.Trump.getPrice().getCells(), true) + "c</center></html>");		
		lblInfo[5].setText("<html><center>Brandon</center><center>" + new ShortNumber(CharacterData.Trump.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[6].setText("<html><center>Puppet</center><center>" + new ShortNumber(CharacterData.Trump.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[7].setText("<html><center>Donald Trump</center><center>" + new ShortNumber(CharacterData.Trump.getPrice().getCells(), true) + "c</center></html>");
		
		add(lblInfo[0], "cell 0 0,grow");
		add(lblInfo[1], "cell 1 0,grow");
		add(lblInfo[2], "cell 4 0,grow");
		add(lblInfo[3], "cell 5 0,grow");
		add(lblInfo[4], "cell 0 2,grow");
		add(lblInfo[5], "cell 1 2,grow");
		add(lblInfo[6], "cell 4 2,grow");
		add(lblInfo[7], "cell 5 2,grow");
		
		add(OperationsList.getList(), "cell 2 2 2 2,grow");
		
		add(btnBuy[0], "cell 0 1,grow");
		add(btnBuy[1], "cell 1 1,grow");
		add(btnBuy[2], "cell 4 1,grow");
		add(btnBuy[3], "cell 5 1,grow");
		add(btnBuy[4], "cell 0 3,grow");
		add(btnBuy[5], "cell 1 3,grow");
		add(btnBuy[6], "cell 4 3,grow");
		add(btnBuy[7], "cell 5 3,grow");
		
		JLabel lblConvertCells = new JLabel("Convert Cells");
		lblConvertCells.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblConvertCells, "flowy,cell 2 0,alignx center");
		
		textField = new JTextField();
		add(textField, "cell 2 0,growx");
		textField.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		add(btnConvert, "cell 2 0,growx");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		add(rdbtnNewRadioButton, "flowy,cell 2 1");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		add(rdbtnNewRadioButton_1, "cell 2 1");
		
		
		btnBuy[7].addActionListener(event -> Game.buyCharacter(new Trump(), Main.Game.getOperations().get(0)));
	}
}
