package Application;

import java.awt.Font;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import Game.CharacterData;
import Game.Characters.Jake;
import Game.Characters.Trump;
import Main.Game;
import Main.ShortNumber;
import net.miginfocom.swing.MigLayout;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;

public class MoneyShopTab extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JButton[] btnBuy = new JButton[8];
	private static JLabel[] lblInfo = new JLabel[8];
	private JFormattedTextField textField = new JFormattedTextField();
	JLabel lblConvertCells = new JLabel("Sell Cells");
	JButton btnConvert = new JButton("Sell");
	OperationsList list = new OperationsList();
	
	public MoneyShopTab() {
		setLayout(new MigLayout("insets 0 0 0 0", "[grow][grow][grow][grow][grow]", "[grow][grow][grow][grow]"));
		for(int i = 0; i < lblInfo.length; i++) {
			lblInfo[i] = new JLabel();
			lblInfo[i].setFont(new Font("Tahoma", Font.BOLD, 15));
			lblInfo[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int i = 0; i < btnBuy.length; i++) {
			btnBuy[i] = new JButton("Buy");
			btnBuy[i].setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		add(list.getList(), "cell 2 2 0 2,grow");
		
		lblInfo[0].setText("<html><center>Jake</center><center>$" + new ShortNumber(CharacterData.Jake.getPrice().getMoney(), true) + "</center></html>");
		lblInfo[1].setText("<html><center>Lance</center><center>$" + new ShortNumber(CharacterData.Lance.getPrice().getMoney(), true) + "</center></html>");
		lblInfo[2].setText("<html><center>Nhan</center><center>$" + new ShortNumber(CharacterData.Nhan.getPrice().getMoney(), true) + "</center></html>");
		lblInfo[3].setText("<html><center>Amine's<br>Patreon</center><center>$" + new ShortNumber(CharacterData.Patreon.getPrice().getMoney(), true) + "</center></html>");		
		lblInfo[4].setText("<html><center>BP</center><center>$" + new ShortNumber(CharacterData.BP.getPrice().getMoney(), true) + "</center></html>");		
		lblInfo[5].setText("<html><center>Alex</center><center>$" + new ShortNumber(CharacterData.Alex.getPrice().getMoney(), true) + "</center></html>");
		lblInfo[6].setText("<html><center>Apple</center><center>$" + new ShortNumber(CharacterData.Apple.getPrice().getMoney(), true) + "</center></html>");
		lblInfo[7].setText("<html><center>Donald<br>Trump</center><center>$" + new ShortNumber(CharacterData.Trump.getPrice().getMoney(), true) + "</center></html>");
		
		add(lblInfo[0], "cell 0 0,grow");
		add(lblInfo[1], "cell 1 0,grow");
		add(lblInfo[2], "cell 3 0,grow");
		add(lblInfo[3], "cell 4 0,grow");
		add(lblInfo[4], "cell 0 2,grow");
		add(lblInfo[5], "cell 1 2,grow");
		add(lblInfo[6], "cell 3 2,grow");
		add(lblInfo[7], "cell 4 2,grow");
		
		//add(OperationsList.getList(), "cell 2 2 0 2,grow");
		add(btnBuy[0], "cell 0 1,grow");
		add(btnBuy[1], "cell 1 1,grow");
		add(btnBuy[2], "cell 3 1,grow");
		add(btnBuy[3], "cell 4 1,grow");
		add(btnBuy[4], "cell 0 3,grow");
		add(btnBuy[5], "cell 1 3,grow");
		add(btnBuy[6], "cell 3 3,grow");
		add(btnBuy[7], "cell 4 3,grow");
		
		lblConvertCells.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblConvertCells, "flowy,cell 2 0,alignx center");
		
		add(btnConvert, "cell 2 1,grow");
		
		add(textField, "cell 2 0,growx");
		btnConvert.addActionListener(event -> Game.convert(Integer.parseInt(textField.getText())));
		
		btnBuy[0].addActionListener(event -> Game.buyCharacter(new Jake(), list.getSelected()));
		btnBuy[1].addActionListener(event -> Game.buyCharacter(new Trump(), list.getSelected()));
		btnBuy[2].addActionListener(event -> Game.buyCharacter(new Trump(), list.getSelected()));
		btnBuy[3].addActionListener(event -> Game.buyCharacter(new Trump(), list.getSelected()));
		btnBuy[4].addActionListener(event -> Game.buyCharacter(new Trump(), list.getSelected()));
		btnBuy[5].addActionListener(event -> Game.buyCharacter(new Trump(), list.getSelected()));
		btnBuy[6].addActionListener(event -> Game.buyCharacter(new Trump(), list.getSelected()));
		btnBuy[7].addActionListener(event -> Game.buyCharacter(new Trump(), list.getSelected()));
	}
}
