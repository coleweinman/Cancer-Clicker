package Message;

import javax.swing.JDialog;
import Game.Characters.*;
import Game.Characters.Character;
import Main.Price;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class InfoPanelCharacter {
	private JFrame frame = new JFrame();
	private Price price = new Price(0,0,0,0);
	private int space = 0;
	private int cellRate = 0;
	private int moneyRate = 0;
	private double scMult = 0;
	
	public InfoPanelCharacter(String name) {
		
		Class<?> c = null;
		
		System.out.println(new Brian().getClass());
		
		try {
			c = Class.forName("Game.Characters." + name);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try {
			Character ch = (Character) c.newInstance();
			price = ch.getPrice();
			space = ch.getSpace();
			cellRate = ch.getCellRate();
			moneyRate = ch.getMoneyRate();
			scMult = ch.getSuperCellMult();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
		frame.setTitle(name);
		JOptionPane optionPane = new JOptionPane();
		JLabel lineName = new JLabel("<html><b>Name: </b>" + name + "</html>");
		lineName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineCells = new JLabel("<html><b>Cell Cost: </b>" + price.getCells() + "</html>");
		lineCells.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineMoney = new JLabel("<html><b>Money Cost: </b>" + "$" + price.getMoney() + "</html>");
		lineMoney.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineSC = new JLabel("<html><b>Super Cell Cost: </b>" + price.getSuperCell() + "</html>");
		lineMoney.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineSpace = new JLabel("<html><b>Space: </b>" + space + "</html>");
		lineSpace.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineMult = new JLabel("<html><b>Super Cell Multiplyer: </b>" + "+" + scMult/100 + "%</html>");
		lineMult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineCellRate = new JLabel("<html><b>Cell Rate: </b>" + cellRate + "c/t" + "%</html>");
		lineCellRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineMoneyRate = new JLabel("<html><b>Money Rate: </b>" + moneyRate + "m/t" + "%</html>");
		lineMoneyRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		optionPane.setMessage(new Object[] {lineName, lineCells, lineMoney, lineSC, lineSpace, lineMult, lineCellRate, lineMoneyRate});
		optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
		JDialog dialog = optionPane.createDialog(frame, name);
		dialog.setVisible(true);
	}
}
