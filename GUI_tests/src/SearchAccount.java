/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kemer
 */
public class SearchAccount {
    private String address;
    private String username;
    private String password;
    
    public SearchAccount(String address, String username, String password)
    {
        this.address = address;
        this.password = password;
        this.username = username;
    }
    
    boolean SearchResult()
    { 
         try
      {
        String filePath = address;  
        File file = new File(filePath);   
        
        BufferedReader br = new BufferedReader(new FileReader(address));
        String s;
        
        while((s=br.readLine())!=null)
        {
            String var[] = s.split(", ");
            if((var[0].equals(username)) && (var[1].equals(password)))
            {
               return true;
            }            
        } 
        
        
        br.close();
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
         
      
      return false;   
      
    }
    
    boolean searchSameUsername()
    { 
         try
      {
        
        BufferedReader br = new BufferedReader(new FileReader(address));
        String s;
        
        while((s=br.readLine())!=null)
        {
            String var[] = s.split(", ");
            if((var[0].equals(username)))
            {
               return true;
            }            
        }               
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
         
      
      return false;   
      
    }
    
}

     
