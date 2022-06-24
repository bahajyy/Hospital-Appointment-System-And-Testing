import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DoctorAppointmentControlTest {
    PrintAppointments p_a;
    DoctorAppointmentControl a_c;
    @ParameterizedTest
    @CsvSource({"Ahmet ,Kerem Irmak, Surgeon, 21/02/2023, 8:00",//Shakespeare birthdate
            "Mehmet, Baha Yilmaz, Dentist, 26/06/2022, 9:30",//Nikola tesla birthdate
    })
    void cancelAppointment(String patient, String doctor, String subject, String date, String time)
    {

        p_a = new PrintAppointments(patient, doctor, subject, date, time);
        p_a.RecordAppointment();

        a_c = new DoctorAppointmentControl(patient, doctor, date, time);
        Current_account.username = doctor;
        a_c.cancelAppointment();
        boolean result = true;
        String expectedSentence = patient + ", " + doctor + ", " + ", " + date + ", " + time;

        try{
            String filePath = "AppointmentDatabase.txt";
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String s;

            while((s=br.readLine())!=null)
            {
                if(s.equals(expectedSentence))
                {
                    result = false;
                }
            }

            br.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        assertTrue(result);

    }
}