/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.util.ArrayList;

/**
 *
 * @author senju
 */
public class UserM {

    private ArrayList<user> users;

    public UserM() {
        users = new ArrayList<>();
    }

    public void addUser(String username, String password) {
        users.add(new user(username, password));
        System.out.println("User registered successfully!");
       
    }

    public boolean loginUser(String username, String password) {
        for (user User : users) {
            if (User.getuser().equals(username) && User.getpass().equals(password)) {
                return true;
            }
        }
        System.out.println("Invalid username or password.");
        return false;
    }
    
}
