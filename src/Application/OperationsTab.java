package Application;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Game.OperationData;
import Game.ShortNumber;
import Main.Game;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;

public class OperationsTab extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JButton[] btnBuy = new JButton[6];
	private static JLabel[] lblInfo = new JLabel[6];
	
	public OperationsTab() {
		setLayout(new MigLayout("insets 0 0 0 0", "[grow][grow][grow]", "[grow][grow][grow]"));

		for(int i = 0; i < lblInfo.length; i ++) {
			lblInfo[i] = new JLabel();
			lblInfo[i].setFont(new Font("Tahoma", Font.BOLD, 15));
			lblInfo[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int i = 0; i < btnBuy.length; i++) {
			btnBuy[i] = new JButton("Buy");
			btnBuy[i].setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		
		lblInfo[0].setText("<html><center>Box</center><center>" + new ShortNumber(OperationData.Box.getPrice().getCells(), true) + "</center></html>");
		lblInfo[1].setText("<html><center>Garage</center><center>" + new ShortNumber(OperationData.Garage.getPrice().getCells(), true) + "</center></html>");
		lblInfo[2].setText("<html><center>Office</center><center>" + new ShortNumber(OperationData.Office.getPrice().getCells(), true) + "</center></html>");
		lblInfo[3].setText("<html><center>Cole</center><center>" + new ShortNumber(OperationData.Cole.getPrice().getCells(), true) + "</center></html>");
		lblInfo[4].setText("<html><center>Nhan</center><center>" + new ShortNumber(OperationData.Nhan.getPrice().getCells(), true) + "</center></html>");
		lblInfo[5].setText("<html><center>School</center><center>" + new ShortNumber(OperationData.School.getPrice().getCells(), true) + "</center></html>");
		
		add(lblInfo[0], "cell 0 0,grow");
		add(lblInfo[1], "cell 1 0,grow");
		add(lblInfo[2], "cell 2 0,grow");
		add(lblInfo[3], "cell 0 2,grow");
		add(lblInfo[4], "cell 1 2,grow");
		add(lblInfo[5], "cell 2 2,grow");
		
		add(btnBuy[0], "cell 0 1,grow");
		add(btnBuy[1], "cell 1 1,grow");
		add(btnBuy[2], "cell 2 1,grow");
		add(btnBuy[3], "cell 0 3,grow");
		add(btnBuy[4], "cell 1 3,grow");
		add(btnBuy[5], "cell 2 3,grow");
		
		//Buy Listeners
		btnBuy[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Box", 1);
			}
		});
		btnBuy[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Garage", 1);
			}
		});
		btnBuy[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Office", 1);
			}
		});
		btnBuy[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Cole", 1);
			}
		});
		btnBuy[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("Nhan", 1);
			}
		});
		btnBuy[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.buy("School", 1);
			}
		});
		
		
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
