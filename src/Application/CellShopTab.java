package Application;

import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import javax.swing.Action;

import net.miginfocom.swing.MigLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class CellShopTab extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JButton[] btnBuy = new JButton[8];

	public CellShopTab() {
		setLayout(new MigLayout("insets 0 0 0 0", "[grow][grow][grow][grow][grow][grow]", "[grow][grow,baseline][grow][grow]"));

		
		JLabel lblCSL1 = new JLabel("<html><center>Brian</center><center>1,000c</center></html>");
		lblCSL1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Message.InfoPanel info = new Message.InfoPanel("Brian", "100c", "1c/s");
			}
		});
		lblCSL1.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL1, "cell 0 0,alignx center,aligny center");
		
		JLabel lblCSL2 = new JLabel("<html><center>Garrett</center><center>100c</center></html>");
		lblCSL2.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL2, "cell 1 0,alignx center,aligny center");
		
		JLabel lblCSL3 = new JLabel("<html><center>Noah</center><center>100c</center></html>");
		lblCSL3.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL3, "cell 4 0,alignx center,aligny center");
		
		JLabel lblCSL4 = new JLabel("<html><center>Andrew</center><center>100c</center></html>");
		lblCSL4.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL4, "cell 5 0,alignx center,aligny center");
		
		JLabel lblCSL5 = new JLabel("<html><center>Daniel</center><center>100c</center></html>");
		lblCSL5.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL5, "cell 0 2,alignx center,aligny center");
		
		JLabel lblCSL6 = new JLabel("<html><center>Amine</center><center>100c</center></html>");
		lblCSL6.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL6, "cell 1 2,alignx center,aligny center");
		
		JLabel lblCSL7 = new JLabel("<html><center>Chris</center><center>100c</center></html>");
		lblCSL7.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblCSL7, "cell 4 2,alignx center,aligny center");
		
		JLabel lblCSL8 = new JLabel("<html><center>Tinky</center><center>100c</center></html>");
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
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCreate.setMargin(new Insets(1,1,1,1));
		add(btnCreate, "cell 2 0 2 2,grow");
		
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
