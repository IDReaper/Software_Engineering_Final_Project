package project1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ChocoholicFirstWindow extends JFrame implements ActionListener {

  private JButton toggleButton;
  private JButton submitButton;
  private JButton logoutButton, logout2Button, logout3Button, logout4Button, logout5Button;
  private JPanel topPanel, bottom, login;
  private JPanel mpanel, ppanel;
  private JPanel apanel, dpanel, upanel;
  private JTabbedPane member;
  private JLabel topPanel2;
  private static int state = 0;
  
  ImageIcon icon = new ImageIcon(getClass().getResource("ChocAnLogo.jpg"));

  public ChocoholicFirstWindow() {
  	
  	//Create the main panel
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    add(panel);
    
    //Login Dialog Box
    topPanel = new JPanel(new BorderLayout(0, 0));
    topPanel.setBorder(new EmptyBorder(new Insets(20, 25, 15, 25)));
    topPanel.add(new JTextField("User ID#"), BorderLayout.SOUTH);
    topPanel2 = new JLabel();
    topPanel2.setIcon(icon);
    topPanel2.setBorder(new EmptyBorder(new Insets(20, 0, 0, 0)));
    topPanel2.setAlignmentX(CENTER_ALIGNMENT);
    panel.add(topPanel2);
    panel.add(topPanel);
    
    //Radio Buttons Panel for member and provider
    bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
    ButtonGroup group = new ButtonGroup(); 
    
    //Member Radio Button
    JRadioButton mRadio = new JRadioButton("Member");
    mRadio.setActionCommand("Member");
    group.add(mRadio);
    bottom.add(mRadio);
    mRadio.addActionListener(this);
    bottom.add(Box.createRigidArea(new Dimension(0, 0)));
    
    //Provider Radio Button
    JRadioButton pRadio = new JRadioButton("Provider");
    pRadio.setActionCommand("Provider");
    group.add(pRadio);
    bottom.add(pRadio);
    pRadio.addActionListener(this);
    bottom.add(Box.createRigidArea(new Dimension(0, 0)));
    panel.add(bottom);
    
    //ChocAn Operator Button
    JRadioButton oRadio = new JRadioButton("ChocAn Operator");
    oRadio.setActionCommand("ChocAn Operator");
    group.add(oRadio);
    bottom.add(oRadio);
    oRadio.addActionListener(this);
    bottom.add(Box.createRigidArea(new Dimension(0, 0)));
    panel.add(bottom);

    //Login Button Panel
    login = new JPanel();
    toggleButton = new JButton("Login");
    toggleButton.setActionCommand("Login");
    login.add(toggleButton);
    toggleButton.addActionListener(this);
    login.add(Box.createRigidArea(new Dimension(0, 5)));
    panel.add(login);
    
    //Logout Button
    logoutButton = new JButton("Logout");
    logoutButton.setActionCommand("Logout");
    logoutButton.addActionListener(this);
    
    //Logout Button the sequel
    logout2Button = new JButton("Logout");
    logout2Button.setActionCommand("Logout2");
    logout2Button.addActionListener(this);
    
    //Logout Button the trilogy
    logout3Button = new JButton("Logout");
    logout3Button.setActionCommand("Logout3");
    logout3Button.addActionListener(this);
    
    //Logout Button the 4th?
    logout4Button = new JButton("Logout");
    logout4Button.setActionCommand("Logout4");
    logout4Button.addActionListener(this);
    
    //Logout Button the to many sequels
    logout5Button = new JButton("Logout");
    logout5Button.setActionCommand("Logout5");
    logout5Button.addActionListener(this);
    
    //Member update tab
    mpanel = new JPanel();
    mpanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    mpanel.setLayout(new GridLayout(8, 2, -200, 5));
    mpanel.add(new JLabel("Member name:"));
    mpanel.add(new JTextField("")); 
    mpanel.add(new JLabel("Member number:"));    
    mpanel.add(new JTextField(""));    
    mpanel.add(new JLabel("Member street address:"));    
    mpanel.add(new JTextField(""));    
    mpanel.add(new JLabel("Member city:"));    
    mpanel.add(new JTextField(""));    
    mpanel.add(new JLabel("Member state:"));    
    mpanel.add(new JTextField(""));    
    mpanel.add(new JLabel("Member ZIP code:"));    
    mpanel.add(new JTextField(""));    
    mpanel.add(Box.createRigidArea(new Dimension(0,0)));
    submitButton = new JButton("Submit");
    mpanel.add(submitButton);
    mpanel.add(Box.createRigidArea(new Dimension(0,0)));
    mpanel.add(logoutButton);
   
    //Provider update panel
    ppanel = new JPanel();
    ppanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    ppanel.setLayout(new GridLayout(8, 2, -200, 5));
    ppanel.add(new JLabel("Provider name:"));
    ppanel.add(new JTextField("")); 
    ppanel.add(new JLabel("Provider number:"));    
    ppanel.add(new JTextField(""));    
    ppanel.add(new JLabel("Provider street address:"));    
    ppanel.add(new JTextField(""));    
    ppanel.add(new JLabel("Provider city:"));    
    ppanel.add(new JTextField(""));    
    ppanel.add(new JLabel("Provider state:"));    
    ppanel.add(new JTextField(""));    
    ppanel.add(new JLabel("Provider ZIP code:"));    
    ppanel.add(new JTextField(""));    
    ppanel.add(Box.createRigidArea(new Dimension(0,0)));
    submitButton = new JButton("Submit");
    ppanel.add(submitButton);
    ppanel.add(Box.createRigidArea(new Dimension(0,0)));
    logoutButton = new JButton("Logout");
    ppanel.add(logout2Button);
    
    //ChocAn ADD panel
    apanel = new JPanel();
    apanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    apanel.setLayout(new GridLayout(8, 2, -200, 5));
    apanel.add(new JLabel("Member/Provider name:"));
    apanel.add(new JTextField("")); 
    apanel.add(new JLabel("Member/Provider number:"));    
    apanel.add(new JTextField(""));    
    apanel.add(new JLabel("Member/Provider street address:"));    
    apanel.add(new JTextField(""));    
    apanel.add(new JLabel("Member/Provider city:"));    
    apanel.add(new JTextField(""));    
    apanel.add(new JLabel("Member/Provider state:"));    
    apanel.add(new JTextField(""));    
    apanel.add(new JLabel("Member/Provider ZIP code:"));    
    apanel.add(new JTextField(""));    
    apanel.add(Box.createRigidArea(new Dimension(0,0)));
    submitButton = new JButton("ADD");
    apanel.add(submitButton);
    apanel.add(Box.createRigidArea(new Dimension(0,0)));
    logoutButton = new JButton("Logout");
    apanel.add(logout3Button);
    
    //ChocAn DELETE panel
    dpanel = new JPanel();
    dpanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    dpanel.setLayout(new GridLayout(8, 2, -200, 5));
    dpanel.add(new JLabel("Member/Provider name:"));
    dpanel.add(new JTextField("")); 
    dpanel.add(new JLabel("Member/Provider number:"));    
    dpanel.add(new JTextField(""));    
    dpanel.add(new JLabel("Member/Provider street address:"));    
    dpanel.add(new JTextField(""));    
    dpanel.add(new JLabel("Member/Provider city:"));    
    dpanel.add(new JTextField(""));    
    dpanel.add(new JLabel("Member/Provider state:"));    
    dpanel.add(new JTextField(""));    
    dpanel.add(new JLabel("Member/Provider ZIP code:"));    
    dpanel.add(new JTextField(""));    
    dpanel.add(Box.createRigidArea(new Dimension(0,0)));
    submitButton = new JButton("DELETE");
    dpanel.add(submitButton);
    dpanel.add(Box.createRigidArea(new Dimension(0,0)));
    logoutButton = new JButton("Logout");
    dpanel.add(logout4Button);
    
    //ChocAn UPDATE panel
    upanel = new JPanel();
    upanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    upanel.setLayout(new GridLayout(8, 2, -200, 5));
    upanel.add(new JLabel("Member/Provider name:"));
    upanel.add(new JTextField("")); 
    upanel.add(new JLabel("Member/Provider number:"));    
    upanel.add(new JTextField(""));    
    upanel.add(new JLabel("Member/Provider street address:"));    
    upanel.add(new JTextField(""));    
    upanel.add(new JLabel("Member/Provider city:"));    
    upanel.add(new JTextField(""));    
    upanel.add(new JLabel("Member/Provider state:"));    
    upanel.add(new JTextField(""));    
    upanel.add(new JLabel("Member/Provider ZIP code:"));    
    upanel.add(new JTextField(""));    
    upanel.add(Box.createRigidArea(new Dimension(0,0)));
    submitButton = new JButton("UPDATE");
    upanel.add(submitButton);
    upanel.add(Box.createRigidArea(new Dimension(0,0)));
    logoutButton = new JButton("Logout");
    upanel.add(logout5Button);

    //Create tab pane 
    member = new JTabbedPane();
    panel.add(member, BorderLayout.NORTH);
        
    pack();

    //Set window properties
    setTitle("Chocoholics Anonymous");
    setSize(640, 400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);        
  }

	public void actionPerformed(ActionEvent event) {
		
    //Print out the action retrieved
    System.out.println(event.getActionCommand());
    
    //Changes state to zero if member is selected
    if ("Member".equals(event.getActionCommand())){
      state = 0;
    }
    
    //Changes state to one if Provider is selected
    if ("Provider".equals(event.getActionCommand())){
      state = 1;
    }
    
    //Changes state to two if ChocAn Operator is selected
    if ("ChocAn Operator".equals(event.getActionCommand())){
      state = 2;
    }
    
    //Logout button
    if ("Logout".equals(event.getActionCommand())){
    	member.setVisible(false);
    	member.removeAll();
    	topPanel.setVisible(true);
      topPanel2.setVisible(true);
      bottom.setVisible(true);
      login.setVisible(true);
    }
    
    //Logout button the sequel
    if ("Logout2".equals(event.getActionCommand())){
    	member.setVisible(false);
    	member.removeAll();
    	topPanel.setVisible(true);
      topPanel2.setVisible(true);
      bottom.setVisible(true);
      login.setVisible(true);
    }
    
    //Logout button 3
    if ("Logout3".equals(event.getActionCommand())){
    	member.setVisible(false);
    	member.removeAll();
    	topPanel.setVisible(true);
      topPanel2.setVisible(true);
      bottom.setVisible(true);
      login.setVisible(true);
    }
    
    //Logout button 4
    if ("Logout4".equals(event.getActionCommand())){
    	member.setVisible(false);
    	member.removeAll();
    	topPanel.setVisible(true);
      topPanel2.setVisible(true);
      bottom.setVisible(true);
      login.setVisible(true);
    }
    
    //Logout button 5
    if ("Logout5".equals(event.getActionCommand())){
    	member.setVisible(false);
    	member.removeAll();
    	topPanel.setVisible(true);
      topPanel2.setVisible(true);
      bottom.setVisible(true);
      login.setVisible(true);
    }
    
    //When login is selected, depending on the state switch, a set of tabbed panes are added
    if ("Login".equals(event.getActionCommand())){
      if (state == 0){         
      	member.setVisible(true);
        topPanel.setVisible(false);
        topPanel2.setVisible(false);
        bottom.setVisible(false);
        login.setVisible(false);
        
        member.addTab("Member Information", mpanel);         
      }
      else if (state == 1){
      	member.setVisible(true);
        topPanel.setVisible(false);
        topPanel2.setVisible(false);
        bottom.setVisible(false);
        login.setVisible(false);
        
        member.addTab("Provider Information", ppanel);        
      }
      else{
      	member.setVisible(true);
        topPanel.setVisible(false);
        topPanel2.setVisible(false);
        bottom.setVisible(false);
        login.setVisible(false);
        
        member.addTab("Add Member/Provider", apanel);
        member.addTab("Delete Member/Provider", dpanel);
        member.addTab("Update Member/Provider", upanel);
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
