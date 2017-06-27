package Message;

import javax.swing.JDialog;

import Game.OperationData;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class InfoPanelOperation {
	private JFrame frame = new JFrame();
	
	public InfoPanelOperation(String name) {
		
		OperationData d = OperationData.valueOf(name);
		
		frame.setTitle(name);
		JOptionPane optionPane = new JOptionPane();
		JLabel lineName = new JLabel("<html><b>Name: </b>" + name + "</html>");
		lineName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineCells = new JLabel("<html><b>Cell Cost: </b>" + d.getPrice().getCells() + "</html>");
		lineCells.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineMoney = new JLabel("<html><b>Money Cost: </b>" + "$" + d.getPrice().getMoney() + "</html>");
		lineMoney.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineSC = new JLabel("<html><b>Super Cell Cost: </b>" + d.getPrice().getSuperCell() + "</html>");
		lineSC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineSpace = new JLabel("<html><b>Space: </b>" + d.getSpace() + "</html>");
		lineSpace.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineMult = new JLabel("<html><b>Super Cell Multiplyer: </b>" + d.getSuperCellMult() + "%</html>");
		lineMult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineCellRate = new JLabel("<html><b>Cell Cost per Tick: </b>" + d.getCellCost() + "c/t" + "</html>");
		lineCellRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineMoneyRate = new JLabel("<html><b>Money Cost per Tick: </b>" + d.getMoneyCost() + "m/t" + "</html>");
		lineMoneyRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineCellMult = new JLabel("<html><b>Cell Production Multiplyer: </b>" + d.getCellMult() + "m/t" + "</html>");
		lineCellMult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineMoneyMult = new JLabel("<html><b>Money Production Multiplyer: </b>" + d.getMoneyMult() + "m/t" + "</html>");
		lineMoneyMult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		optionPane.setMessage(new Object[] {lineName, lineCells, lineMoney, lineSC, lineSpace, lineMult, lineCellRate, lineMoneyRate, lineCellMult, lineMoneyMult});
		optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
		JDialog dialog = optionPane.createDialog(frame, name);
		dialog.setVisible(true);
	}
}