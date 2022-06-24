/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.korhangui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kemer
 */
public class Doctor_acc 
{
    private String name;
    private String surname;
    private String password;
    private String birthdate;
    private String subject;
    private String address = "DoctorAccountDatabase.txt";
    Doctor_acc(String name, String surname, String password,String subject, String birthdate)
    {
       this.name = name;
       this.surname = surname;
       this.password = password;
       this.birthdate = birthdate; 
       this.subject = subject;
       RecordAccount();
    }
    
    void RecordAccount()
    {
       try
      {
        
        File file = new File(address);    
        BufferedWriter bw = new BufferedWriter(new FileWriter(address,true));
        bw.write(name + " " + surname + ", " + password + ", "+ subject+ ", " + birthdate + "\n");
        bw.close();
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
      
    }
}
