import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChocoholicFirstWindow extends JFrame implements ActionListener {

  private JButton toggleButton;
  private JPanel topPanel, bottom, login;
  private JPanel panel1, panel2, panel3;
  private JTabbedPane member;
  private static int state = 1;

  public ChocoholicFirstWindow() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    add(panel);

    topPanel = new JPanel(new BorderLayout(0, 0));
    topPanel.setBorder(new EmptyBorder(new Insets(20, 25, 15, 25)));
    topPanel.add(new JTextArea("Username"), BorderLayout.NORTH);
    topPanel.add(Box.createRigidArea(new Dimension(0, 5)));
    topPanel.add(new JTextArea("Password"), BorderLayout.SOUTH);
    topPanel.add(Box.createRigidArea(new Dimension(0, 5)));
    panel.add(topPanel);

    bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    bottom.add(new JRadioButton("Member"));
    bottom.add(Box.createRigidArea(new Dimension(10, 0)));
    bottom.add(new JRadioButton("Password"));
    bottom.add(Box.createRigidArea(new Dimension(10, 0)));
    panel.add(bottom);

    login = new JPanel();
    toggleButton = new JButton("Login");
    login.add(toggleButton);
    toggleButton.addActionListener(this);
    login.add(Box.createRigidArea(new Dimension(0, 5)));
    panel.add(login);

    member = new JTabbedPane();
    panel.add(member, BorderLayout.CENTER);
    member.remove(panel1);

    pack();

    setTitle("Chocoholics Anonymous");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);        
  }

  public void actionPerformed(ActionEvent event) {
      topPanel.setVisible(false);
      bottom.setVisible(false);
      login.setVisible(false);
      member.addTab("Member Information", panel1);
  }

  public static void main(String[] args) {

    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        ChocoholicFirstWindow chocowindow = new ChocoholicFirstWindow();
        chocowindow.setVisible(true);
      }
    });
  }
}
