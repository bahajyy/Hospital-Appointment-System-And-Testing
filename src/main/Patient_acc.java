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
public class Patient_acc 
{
    private String username;
    private String password;
    private String birthdate;
    private String address = "PatientAccountDatabase.txt";
    Patient_acc(String username, String password, String birthdate)
    {
       this.username = username;
       this.password = password;
       this.birthdate = birthdate; 
       
       RecordAccount();
    }
    
    void RecordAccount()
    {
       try
      {
        
        File file = new File(address);    
        BufferedWriter bw = new BufferedWriter(new FileWriter(address,true));
        bw.write(username + ", " + password + ", " + birthdate + "\n");
        bw.close();
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
      
    }
}
