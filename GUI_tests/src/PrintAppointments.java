/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kemer
 */
public class PrintAppointments {
    private String patientUsername;
    private String doctorUsername;
    private String appointmentDate;
    private String appointmentSubject;
    private String appointmentTime;

    public PrintAppointments(String patientUsername, String doctorUsername, String appointmentSubject, String appointmentDate, String appointmentTime) {
        this.patientUsername = patientUsername;
        this.doctorUsername = doctorUsername;
        this.appointmentDate = appointmentDate;
        this.appointmentSubject = appointmentSubject;
        this.appointmentTime = appointmentTime;
    }
    
    void RecordAppointment()
    {
       try
      {
        String filePath = "AppointmentDatabase.txt";  
        File file = new File(filePath);  
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        bw.write(patientUsername + ", " + doctorUsername + ", " + appointmentSubject + ", " + appointmentDate + ", " + appointmentTime+ "\n");
        bw.close();
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
      
    }
    
}
