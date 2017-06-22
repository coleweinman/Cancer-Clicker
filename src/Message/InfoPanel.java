package Message;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class InfoPanel {
	JFrame frame = new JFrame();
	
	public InfoPanel(String name, String price, String cells) {
		frame.setTitle(name);
		JOptionPane optionPane = new JOptionPane();
		JLabel lineName = new JLabel("<html><b>Name: </b>" + name + "</html>");
		lineName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel linePrice = new JLabel("<html><b>Price: </b>" + price + "</html>");
		linePrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lineCells = new JLabel("<html><b>Cells: </b>" + cells + "</html>");
		lineCells.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		optionPane.setMessage(new Object[] {lineName, linePrice, lineCells});
		optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
		JDialog dialog = optionPane.createDialog(frame, name);
		dialog.setVisible(true);
	}
}
