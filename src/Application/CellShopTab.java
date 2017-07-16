package Application;

import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Game.CharacterData;
import Game.Characters.*;
import Main.Game;
import Main.ShortNumber;

import net.miginfocom.swing.MigLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;



public class CellShopTab extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JButton[] btnBuy = new JButton[8];
	private static JLabel[] lblInfo = new JLabel[8];
	OperationsList list = new OperationsList();

	public CellShopTab() {		
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
		
		add(list.getList(), "cell 2 2 2 2,grow");
		
		lblInfo[0].setText("<html><center>Brian</center><center>" + new ShortNumber(CharacterData.Brian.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[1].setText("<html><center>Garrett</center><center>" + new ShortNumber(CharacterData.Garrett.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[2].setText("<html><center>Noah</center><center>" + new ShortNumber(CharacterData.Noah.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[3].setText("<html><center>Andrew</center><center>" + new ShortNumber(CharacterData.Andrew.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[4].setText("<html><center>Daniel</center><center>" + new ShortNumber(CharacterData.Daniel.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[5].setText("<html><center>Amine</center><center>" + new ShortNumber(CharacterData.Amine.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[6].setText("<html><center>Chris</center><center>" + new ShortNumber(CharacterData.Chris.getPrice().getCells(), true) + "c</center></html>");
		lblInfo[7].setText("<html><center>Tinky</center><center>" + new ShortNumber(CharacterData.Tinky.getPrice().getCells(), true) + "c</center></html>");
	
		add(lblInfo[0], "cell 0 0,grow");
		add(lblInfo[1], "cell 1 0,grow");
		add(lblInfo[2], "cell 4 0,grow");
		add(lblInfo[3], "cell 5 0,grow");
		add(lblInfo[4], "cell 0 2,grow");
		add(lblInfo[5], "cell 1 2,grow");
		add(lblInfo[6], "cell 4 2,grow");
		add(lblInfo[7], "cell 5 2,grow");
		
		add(btnBuy[0], "cell 0 1,grow");
		add(btnBuy[1], "cell 1 1,grow");
		add(btnBuy[2], "cell 4 1,grow");
		add(btnBuy[3], "cell 5 1,grow");
		add(btnBuy[4], "cell 0 3,grow");
		add(btnBuy[5], "cell 1 3,grow");
		add(btnBuy[6], "cell 4 3,grow");
		add(btnBuy[7], "cell 5 3,grow");
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.addCell(1);
			}
		});
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCreate.setMargin(new Insets(1,1,1,1));
		add(btnCreate, "cell 2 0 2 2,grow");
		
		
		
		//Buy Listeners

		btnBuy[0].addActionListener(event -> Game.buyCharacter(new Brian(), list.getSelected()));
		btnBuy[1].addActionListener(event -> Game.buyCharacter(new Garrett(), list.getSelected()));
		btnBuy[2].addActionListener(event -> Game.buyCharacter(new Noah(), list.getSelected()));
		btnBuy[3].addActionListener(event -> Game.buyCharacter(new Andrew(), list.getSelected()));
		btnBuy[4].addActionListener(event -> Game.buyCharacter(new Daniel(), list.getSelected()));
		btnBuy[5].addActionListener(event -> Game.buyCharacter(new Amine(), list.getSelected()));
		btnBuy[6].addActionListener(event -> Game.buyCharacter(new Chris(), list.getSelected()));
		btnBuy[7].addActionListener(event -> Game.buyCharacter(new Tinky(), list.getSelected()));
		
		//Info Listeners
		
		lblInfo[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Brian");
			}
		});
		
		lblInfo[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Garrett");
			}
		});
		
		lblInfo[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Noah");
			}
		});
		
		lblInfo[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Andrew");
			}
		});
		
		lblInfo[4].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Daniel");
			}
		});
		
		lblInfo[5].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Amine");
			}
		});
		
		lblInfo[6].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Chris");
			}
		});
		
		lblInfo[7].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Tinky");
			}
		});
	}
}
