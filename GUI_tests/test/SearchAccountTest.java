import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class SearchAccountTest {

    @ParameterizedTest
    @CsvSource({"Hasta_1,pARoLa,24/04/2002",
            "Hasta_2,Yilmaz,password,22/03/2000",
    })
    void searchResult(String username, String password, String birthdate)
    {
        String path = "PatientAccountDatabase.txt";
        File file = new File(path);
        boolean result = false;
        String expectedSentence = username + ", " + password + ", " + birthdate;
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            String s;

            bw.write(expectedSentence);

        }
        catch (IOException e)
        {
          e.printStackTrace();
        }

        SearchAccount search = new SearchAccount(path,username,password);
        result = search.SearchResult();

        assertFalse(result);
    }


    @ParameterizedTest
    @CsvSource({"Hasta_1,pARoLa,24/04/2002",
            "Hasta_2,Yilmaz,password,22/03/2000",
    })
    void searchSameUsername(String username, String password, String birthdate)
    {
        String path = "PatientAccountDatabase.txt";
        File file = new File(path);
        boolean result = false;
        String expectedSentence = username + ", " + password + ", " + birthdate;
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            String s;

            bw.write(expectedSentence);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        SearchAccount search = new SearchAccount(path,username,password);
        result = search.searchSameUsername();
        assertFalse(result);
    }
}