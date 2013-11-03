import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io. *;

public class ChocoholicFirstWindow extends JFrame implements ActionListener {

  private JButton toggleButton;
  private JPanel topPanel, bottom, login;
  private JPanel mpanel, ppanel, spanel;
  private JPanel apanel, dpanel, upanel, vpanel;
  private JTabbedPane member;
  private JTabbedPane provider;
  private static int state = 0;

  public ChocoholicFirstWindow() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    add(panel);

    //Login Dialog Box
    topPanel = new JPanel(new BorderLayout(0, 0));
    topPanel.setBorder(new EmptyBorder(new Insets(20, 25, 15, 25)));
    topPanel.add(new JTextArea("Username"), BorderLayout.CENTER);
    panel.add(topPanel);

    //Radio Buttons Panel for member and provider
    bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    ButtonGroup group = new ButtonGroup(); 
      
    JRadioButton mRadio = new JRadioButton("Member");
    mRadio.setActionCommand("Member");
    group.add(mRadio);
    bottom.add(mRadio);
    mRadio.addActionListener(this);
    bottom.add(Box.createRigidArea(new Dimension(10, 0)));
    
    JRadioButton pRadio = new JRadioButton("Provider");
    pRadio.setActionCommand("Provider");
    group.add(pRadio);
    bottom.add(pRadio);
    pRadio.addActionListener(this);
    bottom.add(Box.createRigidArea(new Dimension(10, 0)));
    panel.add(bottom);

    //Login Button Panel
    login = new JPanel();
    toggleButton = new JButton("Login");
    toggleButton.setActionCommand("Login");
    login.add(toggleButton);
    toggleButton.addActionListener(this);
    login.add(Box.createRigidArea(new Dimension(0, 5)));
    panel.add(login);
    
    /*
    //NEW PANELS START HERE______________________________________________________________
    //___________________________________________________________________________________
    //These are the new panels for the tabbed panes. Most of them still need edits. The first
    //four lines of member information panel may serve as a template for everything else.
    
    //Member Information Panel
    panel1 = new JPanel(new BorderLayout(0, 0));
    panel1.setBorder(new EmptyBorder(new Insets(20, 25, 15, 25)));
    panel1.add(new JTextArea("Current Date: 11/2/2013\nService Date: 10/14/2013\nName: Myself I"), BorderLayout.NORTH);
    mpanel.add(panel1);

    //Provider Information Panel
    bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    ButtonGroup group = new ButtonGroup(); 
      
    JRadioButton mRadio = new JRadioButton("Member");
    mRadio.setActionCommand("Member");
    group.add(mRadio);
    bottom.add(mRadio);
    mRadio.addActionListener(this);
    bottom.add(Box.createRigidArea(new Dimension(10, 0)));
    
    JRadioButton pRadio = new JRadioButton("Provider");
    pRadio.setActionCommand("Provider");
    group.add(pRadio);
    bottom.add(pRadio);
    pRadio.addActionListener(this);
    bottom.add(Box.createRigidArea(new Dimension(10, 0)));
    panel.add(bottom);

    //Services Provided Panel
    login = new JPanel();
    toggleButton = new JButton("Login");
    toggleButton.setActionCommand("Login");
    login.add(toggleButton);
    toggleButton.addActionListener(this);
    login.add(Box.createRigidArea(new Dimension(0, 5)));
    panel.add(login);
    
    //___________________________________________________________________________________
    //___________________________________________________________________________________
    */

    //Member information tabbed pane 1
    member = new JTabbedPane();
    panel.add(member, BorderLayout.NORTH);
    //member.remove(panel1);
    
    //Provider information tabbed pane 2
    //provider = new JTabbedPane();
    //panel.add(provider, BorderLayout.NORTH);
    //provider.remove(panel1);
    
    pack();

    setTitle("Chocoholics Anonymous");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);        
  }

  public void actionPerformed(ActionEvent event) {
    //Print out the action retrieved
    System.out.println(event.getActionCommand());
    
    //Changes a state switch is member or provider is selected
    if ("Member".equals(event.getActionCommand())){
      state = 0;
    }
    
    if ("Provider".equals(event.getActionCommand())){
      state = 1;
    }
    
    //When login is selected, depending on the state switch, a set of tabbed panes are added
    if ("Login".equals(event.getActionCommand())){
      if (state == 0){         
        topPanel.setVisible(false);
        bottom.setVisible(false);
        login.setVisible(false);
        
        member.addTab("Member Information", mpanel);        
        member.addTab("Provider Informataion", ppanel);
        member.addTab("Services Provided", spanel);
        
      }
      else{
        topPanel.setVisible(false);
        bottom.setVisible(false);
        login.setVisible(false);
        
        member.addTab("ADD", apanel);        
        member.addTab("DELETE", dpanel);        
        member.addTab("UPDATE", upanel);        
        member.addTab("VIEW", vpanel);
        
      }
    } 
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
