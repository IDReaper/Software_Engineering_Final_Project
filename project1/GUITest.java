import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class ChocoholicsFirstWindow extends JFrame {

  public ChocoholicsFirstWindow() {
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
        ChocoholicsFirstWindow chocowindow = new ChocoholicsFirstWindow();
        chocowindow.setVisible(true);
      }
    });
  }
}
