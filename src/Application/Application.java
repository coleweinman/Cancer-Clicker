package Application;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Insets;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

public class Application extends JFrame {

	private static JPanel contentPane = new JPanel();
	public static JTabbedPane mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private static JPanel tabGame = new GameTab();
	private final JLabel lblTitle = new JLabel();
	private static JPanel tabManage = new ManageTab();
	
	public Application() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 500, 650);
		setMinimumSize(new Dimension(300,300));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int shouldClose = JOptionPane.showConfirmDialog(contentPane,
						"Are you sure you want to exit Cancer Clicker?",
						"Confirm close",
						JOptionPane.YES_NO_OPTION);
				if(shouldClose == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblTitle.setText("<html><center>CANCER CLICKER v2</center></html>");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(mainTabbedPane, BorderLayout.CENTER);
		
		mainTabbedPane.addTab("Game", null, tabGame, null);
		mainTabbedPane.addTab("Manage", tabManage);
		JPanel tabSettings = new JPanel();
		mainTabbedPane.addTab("Settings", null, tabSettings, null);
		
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		contentPane.add(lblTitle, BorderLayout.NORTH);		
	}
	
	public static JTabbedPane getTabbedPane() {
		return mainTabbedPane;
	}

}
