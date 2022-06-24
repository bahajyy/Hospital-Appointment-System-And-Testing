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
public class DoctorAppointmentControl
{
     private String patientUsername;
    private String doctorUsername;
    private String appointmentDate;
    private String appointmentSubject ="";
    private String appointmentTime;

     DoctorAppointmentControl(String patientUsername, String doctorUsername, String appointmentDate, String appointmentTime) 
    {
        this.patientUsername = patientUsername;
        this.doctorUsername = doctorUsername;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }    
    
    void cancelAppointment()
    {
     
      
     String tempFilePath = "temp.txt";
     String originalFile = "AppointmentDatabase.txt";
     
    
     String s;
     
     try
     { 
         
          
         
        File inputFile = new File(originalFile);
        File tempFile = new File(tempFilePath);

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            String var[] = trimmedLine.split(", ");
            if(Current_account.username.equals(var[1]))
            {
             appointmentSubject = var[2];   
            }
            String cancellingAppointment = (patientUsername + ", " + doctorUsername + ", " + appointmentSubject + ", " + appointmentDate + ", " + appointmentTime).trim();
            
            if(!trimmedLine.equals(cancellingAppointment))
            {
              System.out.println(cancellingAppointment+"///"+currentLine);
              writer.write(currentLine + System.getProperty("line.separator"));  
            }
            
        }
        writer.close(); 
        reader.close(); 
        inputFile.delete();
        File dump = new File(originalFile);        
        boolean successful = tempFile.renameTo(dump);
        System.out.println(successful);
         
     }
     catch(IOException e)
     {
         e.printStackTrace();
     }
  
    }        
   
    }
