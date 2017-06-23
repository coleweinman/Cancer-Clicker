package Application;

import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import Game.Data;
import Game.ShortNumber;
import Game.Characters.*;
import Main.Game;

import javax.swing.Action;

import net.miginfocom.swing.MigLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class CellShopTab extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JButton[] btnBuy = new JButton[8];

	public CellShopTab() {
		setLayout(new MigLayout("insets 0 0 0 0", "[grow][grow][grow][grow][grow][grow]", "[grow][grow,baseline][grow][grow]"));

		
		JLabel lblCSL1 = new JLabel("<html><center>Brian</center><center>" + new ShortNumber(Data.Brian.getPrice().getCells(), true) + "</center></html>");
		lblCSL1.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL1, "cell 0 0,alignx center,aligny center");

		JLabel lblCSL2 = new JLabel("<html><center>Garrett</center><center>" + new ShortNumber(Data.Garrett.getPrice().getCells(), true) + "</center></html>");
		lblCSL2.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL2, "cell 1 0,alignx center,aligny center");
		
		JLabel lblCSL3 = new JLabel("<html><center>Noah</center><center>" + new ShortNumber(Data.Noah.getPrice().getCells(), true) + "</center></html>");
		lblCSL3.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL3, "cell 4 0,alignx center,aligny center");
		
		JLabel lblCSL4 = new JLabel("<html><center>Andrew</center><center>" + new ShortNumber(Data.Andrew.getPrice().getCells(), true) + "</center></html>");
		lblCSL4.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL4, "cell 5 0,alignx center,aligny center");
		
		JLabel lblCSL5 = new JLabel("<html><center>Daniel</center><center>" + new ShortNumber(Data.Daniel.getPrice().getCells(), true) + "</center></html>");
		lblCSL5.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL5, "cell 0 2,alignx center,aligny center");
		
		JLabel lblCSL6 = new JLabel("<html><center>Amine</center><center>" + new ShortNumber(Data.Amine.getPrice().getCells(), true) + "</center></html>");
		lblCSL6.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL6, "cell 1 2,alignx center,aligny center");
		
		JLabel lblCSL7 = new JLabel("<html><center>Chris</center><center>" + new ShortNumber(Data.Chris.getPrice().getCells(), true) + "</center></html>");
		lblCSL7.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL7, "cell 4 2,alignx center,aligny center");
		
		JLabel lblCSL8 = new JLabel("<html><center>Tinky</center><center>" + new ShortNumber(Data.Tinky.getPrice().getCells(), true) + "</center></html>");
		lblCSL8.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL8, "cell 5 2,alignx center,aligny center");
		
		for(int i = 0; i < btnBuy.length; i++) {
			btnBuy[i] = new JButton("Buy");
			btnBuy[i].setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		
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
		btnBuy[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Brian");
			}
		});
		btnBuy[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Garrett");
			}
		});
		btnBuy[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Noah");
			}
		});
		btnBuy[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Andrew");
			}
		});
		btnBuy[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Daniel");
			}
		});
		btnBuy[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Amine");
			}
		});
		btnBuy[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Chris");
			}
		});
		btnBuy[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Tinky");
			}
		});
		
		
		//Info Listeners
		
		lblCSL1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Brian");
			}
		});
		
		lblCSL2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Garrett");
			}
		});
		
		lblCSL3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Noah");
			}
		});
		
		lblCSL4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Andrew");
			}
		});
		
		lblCSL5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Daniel");
			}
		});
		
		lblCSL6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Amine");
			}
		});
		
		lblCSL7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Chris");
			}
		});
		
		lblCSL8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanelCharacter info = new Message.InfoPanelCharacter("Tinky");
			}
		});
		
	}
	
	public static void shift() {
		for(JButton b : btnBuy)
			b.setText("Info");
	}
	
	public static void unshift() {
		for(JButton b : btnBuy)
			b.setText("Buy");
	}
}
