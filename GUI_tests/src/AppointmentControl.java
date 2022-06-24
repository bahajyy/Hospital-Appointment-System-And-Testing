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
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author kemer
 */
public class AppointmentControl
{
     private String patientUsername;
    private String doctorUsername;
    private String appointmentDate;
    private String appointmentSubject;
    private String appointmentTime;

     AppointmentControl(String patientUsername, String doctorUsername, String appointmentSubject, String appointmentDate, String appointmentTime) 
    {
        this.patientUsername = patientUsername;
        this.doctorUsername = doctorUsername;
        this.appointmentDate = appointmentDate;
        this.appointmentSubject = appointmentSubject;
        this.appointmentTime = appointmentTime;
    }
    
   
    
    boolean controlForPatient()
    {
     try{
     String filePath = "AppointmentDatabase.txt";   
     File file = new File(filePath);    
     BufferedReader br = new BufferedReader(new FileReader(filePath));
     String s;
        
        while((s=br.readLine())!=null)
        {
            String var[] = s.split(", ");
            if(PatientAppointmentCheck(var[1],var[3],var[4]))
            {
              return false;
            }            
        } 
        
        br.close();
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
     
     return true;
     
     }
    
        
   
    
    
    boolean PatientAppointmentCheck(String selectedDoctor,String selectedDate, String selectedTime)
    {  System.out.println(appointmentDate + "  //  " + selectedDate);
       if(appointmentDate.equals(selectedDate) && selectedDoctor.equals(doctorUsername) && Current_account.username.equals(patientUsername))
       {
           return true;
       }
       
       return  appointmentDate.equals(selectedDate) && appointmentTime.equals(selectedTime); 
       
    }
    
    void cancelAppointment()
    {
     String cancellingAppointment = (patientUsername + ", " + doctorUsername + ", " + appointmentSubject + ", " + appointmentDate + ", " + appointmentTime).trim();
      
     String tempFilePath = "temp.txt";
     String originalFile = "AppointmentDatabase.txt";
     
    
     String s;
     
     try
     { 
         
          
         
        File inputFile = new File(originalFile);
        File tempFile = new File(tempFilePath);

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String lineToRemove = cancellingAppointment;
        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            if(!trimmedLine.equals(lineToRemove))
            {
              System.out.println(lineToRemove+"///"+currentLine);
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

/*while( (s = br.readLine()) != null)
         { System.out.println((cancellingAppointment.equals(s)));
         
             if(!(cancellingAppointment.equals(s)))
             {  
                 
                 bw.write(s + "\n");
             }
         }
         

         br.close();
         bw.close();
         fr.close();
         fw.close();
         
         System.out.println(oldFile.delete());
         File dump = new File(originalFile);
         System.out.println(newFile.renameTo(dump));*/
    
    

   
    

