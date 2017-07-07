package Application;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

public class MoneyShopTab extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JButton[] btnBuy = new JButton[8];
	private static JLabel[] lblInfo = new JLabel[8];
	
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
	}
}
