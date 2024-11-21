/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author senju
 */
public class Login extends JFrame implements ActionListener {

    String defUser = "Admin";
    String defPass = "123";
    ArrayList<user> users = new ArrayList();

    //Labels-Login
    JLabel LoginLabel = new JLabel("Log-in Form");
    JLabel UserNLabel = new JLabel("Username");
    JLabel passLabel = new JLabel("Password");

    //Panels-Login
    JPanel Fr1Panel = new JPanel();

    //Fields-Login
    JTextField userNfield = new JTextField();
    JPasswordField passField = new JPasswordField();

    //Buttons-Login
    JButton logButton = new JButton("Log-in");
    JButton signButton = new JButton("Sign-up");


    UserM um;

    public Login(UserM um) {
        this.um = um;
        
        //Login
        add(LoginLabel);
        add(UserNLabel);
        add(passLabel);
        add(Fr1Panel);
        add(userNfield);
        add(passField);
        add(logButton);
        add(signButton);

        //Panel-Login
        Fr1Panel.setLayout(null);
        Fr1Panel.setBackground(new Color(255, 165, 82));
        Fr1Panel.setSize(450, 300);

        //Labels-Login
        LoginLabel.setBounds(161, 45, 200, 30);
        LoginLabel.setFont(new Font("Consolas", Font.BOLD, 20));
        LoginLabel.setForeground(new Color(23, 23, 23));
        UserNLabel.setBounds(73, 97, 100, 15);
        passLabel.setBounds(73, 142, 100, 15);

        //Fields-Login
        userNfield.setBounds(150, 95, 200, 20);
        passField.setBounds(150, 140, 200, 20);

        //Buttons-Login
        logButton.setBounds(113, 190, 93, 23);
        logButton.setBackground(new Color(250, 131, 52));
        logButton.setForeground(new Color(23, 23, 23));
        logButton.setBorder(BorderFactory.createEtchedBorder());
        logButton.setFocusable(false);
        logButton.addActionListener(this);
        signButton.setBounds(242, 190, 93, 23);
        signButton.setBackground(new Color(250, 131, 52));
        signButton.setForeground(new Color(23, 23, 23));
        signButton.setBorder(BorderFactory.createEtchedBorder());
        signButton.setFocusable(false);
        signButton.addActionListener(this);

        //Frame1-Login
        this.setSize(450, 300);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.add(Fr1Panel);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String pass = new String(passField.getPassword());
        String user = userNfield.getText();

        if (e.getSource() == logButton) {
            if (um.loginUser(user, pass)) {
                JOptionPane.showMessageDialog(this, "Successfully LogIn", "message", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new DashB();
                
            } else if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both Username and Password", "message", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Invalid UserName or Password", "message", JOptionPane.ERROR_MESSAGE);

            }
        } else if (e.getSource() == signButton) {
            this.setVisible(false);
            new Signup();
        }
    }

}
