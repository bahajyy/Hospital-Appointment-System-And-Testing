import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Doctor_accTest
{
    @ParameterizedTest
    @CsvSource({"Kerem,Irmak,parola,24/04/2002",//Shakespeare birthdate
            "Baha,Yilmaz,password,22/03/2000",//Nikola tesla birthdate
    })
    void recordAccount(String name, String surname, String password, String date)
    {
         Doctor_acc register = new Doctor_acc(name,surname,password,date);
         register.RecordAccount();
         boolean result = false;
         try
         {
             String full_register = name + " " + surname +", " +password +", "+date;
             String path = "DoctorAccountDatabase.txt";
             File file = new File(path);
             BufferedReader br = new BufferedReader(new FileReader(path));
             String s;

             while( (s = br.readLine()) != null )
             {
                 if(full_register.equals(s))
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