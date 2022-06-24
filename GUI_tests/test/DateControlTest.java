import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;
class DateControlTest {

    @ParameterizedTest
    @CsvSource({"24,APRIL,2002",
            "10,JULY,2003",      // All year values are 4 digits.
            "29,FEB,2002",

    })
    void dateControlTest(String day, String month, String year) throws ParseException, ParseException {
        DateControl d_Control = new DateControl(year,day,month);
        d_Control.assignMonth();
        d_Control.assignMonthIndex();
        boolean result = d_Control.dateControl();
        assertTrue(result);
    }
    @ParameterizedTest
    @CsvSource({"24,APRIL,200",
            "10,JULY,20",      //  year values are 2,3 digits.
            "29,FEB,202",

    })
    void dateControlTest2(String day, String month, String year) throws ParseException, ParseException {
        DateControl d_Control = new DateControl(year,day,month);
        d_Control.assignMonth();
        d_Control.assignMonthIndex();
        boolean result = d_Control.dateControl();
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"24,APRIL,2023",
            "10,JULY,2023",
            "29,FEB,2023",
            "28,FEB,2025",
            "17,MAY,2022"
    })
    void dateControlForAppointmentsTest(String day, String month, String year) throws ParseException {
        DateControl d_control = new DateControl(year,day,month);
        d_control.assignMonth();
        d_control.assignMonthIndex();
        assertEquals(true,d_control.dateControlForAppointments());
    }
    @ParameterizedTest
    @CsvSource({"24,APRIL,2015",
            "10,JULY,2013",
            "29,FEB,2021",      // You can not make appointment for the past.
            "25,JAN,2022",
            "15,MAY,2022"
    })
    void dateControlForAppointmentsTest2(String day, String month, String year) throws ParseException {
        DateControl d_control = new DateControl(year,day,month);
        d_control.assignMonth();
        d_control.assignMonthIndex();
        assertEquals(false,d_control.dateControlForAppointments());
    }

    @ParameterizedTest
    @CsvSource({"24,APRIL,1923",
            "10,JULY,1905",
            "28,FEB,2021",
            "10,JULY,2022"
    })
    void isValidYearTest(String day,String month,String year){
        DateControl d_control = new DateControl(year,day,month);
        d_control.assignMonth();
        d_control.assignMonthIndex();
        assertEquals(true,d_control.isValid_year(Integer.parseInt(year)));
    }
    @ParameterizedTest
    @CsvSource({"24,APRIL,1903",
            "10,JULY,1904",
            "28,FEB,2023",
            "10,JULY,2300"
    })
    void isValidYearTest2(String day,String month,String year){
        DateControl d_control = new DateControl(year,day,month);
        d_control.assignMonth();
        d_control.assignMonthIndex();
        assertEquals(false,d_control.isValid_year(Integer.parseInt(year)));
    }

    @ParameterizedTest
    @CsvSource({"24,APRIL,2002",
            "10,JULY,2003",
            "29,FEB,2002",
            "28,FEB,2000",
    })
    void isValidDateTest(String day,String month,String year) throws ParseException {
        DateControl d_control = new DateControl(year,day,month);
        d_control.assignMonth();
        d_control.assignMonthIndex();
        String monthv2 = Integer.toString(d_control.getMonth(month));
        String date =day + "/" + monthv2 + "/" + year;
        assertEquals(true,d_control.isValid_date(date));
    }
    @ParameterizedTest
    @CsvSource({"14,MAY,2022",
            "10,APRIL,2022",
    })
    void isValidDateTest2(String day,String month,String year) throws ParseException {
        DateControl d_control = new DateControl(year,day,month);
        d_control.assignMonth();
        d_control.assignMonthIndex();
        String monthv2 = Integer.toString(d_control.getMonth(month));
        String date =day + "/" + monthv2 + "/" + year;
        assertEquals(false,d_control.isValid_date(date));
    }

    @ParameterizedTest
    @CsvSource({"24,APRIL,2016",
            "10,JULY,2004",
            "29,FEB,2008",
            "28,FEB,2000",
            "10,NOV,1996"
    })
    void isLeapYearTest(String day,String month,String year) throws ParseException{
        DateControl d_control = new DateControl(year,day,month);
        d_control.assignMonth();
        d_control.assignMonthIndex();
        assertEquals(true,d_control.isLeap_year(Integer.parseInt(year)));
    }
    @ParameterizedTest
    @CsvSource({"24,APRIL,1999",
            "10,JULY,1887",
            "29,FEB,2001",
            "28,FEB,2019",
            "10,NOV,1983"
    })
    void isLeapYearTest2(String day,String month,String year) throws ParseException{
        DateControl d_control = new DateControl(year,day,month);
        d_control.assignMonth();
        d_control.assignMonthIndex();
        assertEquals(false,d_control.isLeap_year(Integer.parseInt(year)));
    }

    @ParameterizedTest
    @CsvSource({"27,FEB,2000,29",
            "28,FEB,2000,29",
            "30,JAN,2000,31",
            "31,JAN,2000,31",
            "28,FEB,2001,29",// NOT LEAP YEAR
            "29,FEB,2001,29" // NOT LEAP YEAR
    })
    void dayCheckTest(String day,String month,String year,String monthDeadline) throws ParseException{
        DateControl d_control = new DateControl(year,day,month);
        d_control.assignMonth();
        d_control.assignMonthIndex();
        assertEquals(true,d_control.dayCheck(Integer.parseInt(day),Integer.parseInt(year),month,Integer.parseInt(monthDeadline)));
    }

    @ParameterizedTest
    @CsvSource({"29,FEB,2000,29",
            "32,JAN,2000,31",
            "30,FEB,2001,29",
    })
    void dayCheckTest2(String day,String month,String year,String monthDeadline) throws ParseException{
        DateControl d_control = new DateControl(year,day,month);
        d_control.assignMonth();
        d_control.assignMonthIndex();
        assertEquals(false,d_control.dayCheck(Integer.parseInt(day),Integer.parseInt(year),month,Integer.parseInt(monthDeadline)));
    }

}