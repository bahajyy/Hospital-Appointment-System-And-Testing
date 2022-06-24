import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PrintAppointmentsTest {

    @ParameterizedTest
    @CsvSource({"Ahmet ,Kerem Irmak, Surgeon, 21/02/2023, 8:00",//Shakespeare birthdate
            "Mehmet, Baha Yilmaz, Dentist, 26/06/2022, 9:30",//Nikola tesla birthdate
    })
    void recordAppointment(String patient, String doctor, String subject, String date, String time)
    {
        PrintAppointments register_appointment = new PrintAppointments(patient, doctor, subject, date, time);
        register_appointment.RecordAppointment();
        boolean result = false;
        try
        {
            String expectedSentence = patient + ", " + doctor + ", " + subject +", " + date + ", " + time;
            String path = "AppointmentDatabase.txt";
            File file = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(path));
            String s;

            while( (s = br.readLine()) != null )
            {
                if(expectedSentence.equals(s))
                {
                    result = true;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        assertTrue(result);
    }
}