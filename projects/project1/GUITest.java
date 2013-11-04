package project1;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class GUITest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public GUITest() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.setBorder(new EmptyBorder(new Insets(80, 100, 50, 80)));
		panel.add(new JTextArea("Username"));
		panel.add(Box.createRigidArea(new Dimension(0, 10)));
		panel.add(new JTextArea("Password"));
		panel.add(Box.createRigidArea(new Dimension(0, 10)));
		panel.add(new JButton("Login"));
		panel.add(Box.createRigidArea(new Dimension(0, 10)));

		add(panel);
		pack();

		setTitle("Chocoholics Anonymous");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);        
	}


	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				GUITest guitest = new GUITest();
				guitest.setVisible(true);
			}
		});
	}
}
