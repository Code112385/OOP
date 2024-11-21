/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

/**
 *
 * @author senju
 */
public class user {
    
    private static String username;
     private  String passw;
    
    public user(String name, String pass){
        this.username = name;
        this.passw = pass;
    }
    
    String getpass(){
        return passw;
    }
    String getuser(){
        return username;
    }
    
}

