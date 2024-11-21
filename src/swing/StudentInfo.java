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
public class StudentInfo {
    
      private ArrayList<Info> info;
      
      public StudentInfo(){
           info = new ArrayList<>();
           
      }
      
      public void addUser(String picture, String studentId, String lastName, String firstName, String middleName, String gender, String course, String year, String section) {
        info.add(new Info(picture,studentId,lastName,firstName,middleName,gender,course,year,section));
        System.out.println("User registered successfully!");
          System.out.println(info.getFirst().toString());
    }
    
}
