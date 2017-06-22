package Application;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
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
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;

public class Application extends JFrame {

	private static JPanel contentPane = new JPanel();
	public static JTabbedPane mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private static JPanel tabGame = new GameTab();
	private Action shiftAction = new ShiftAction();
	private Action unshiftAction = new UnshiftAction();
	
	public Application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 550);
		this.setMinimumSize(new Dimension(300,300));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(mainTabbedPane, BorderLayout.CENTER);
		
		mainTabbedPane.addTab("Game", null, tabGame, null);

		JPanel tabSettings = new JPanel();
		mainTabbedPane.addTab("Settings", null, tabSettings, null);
		
		
		
		//Key Bindings
		
		//Shift Action
		//getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke("SHIFT"), "none");
		//getRootPane().getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0, false), "Info");
		//getRootPane().getActionMap().put("Info", shiftAction);
		//getRootPane().getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0, true), "Buy");
		//getRootPane().getActionMap().put("Buy", unshiftAction);
		
	}
	
	public static JTabbedPane getTabbedPane() {
		return mainTabbedPane;
	}

}
