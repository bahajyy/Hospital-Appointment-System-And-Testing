/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.korhangui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author kemer
 */
public class DateControl {
    
    HashMap<String,Integer> months = new HashMap();
    HashMap<String,String> monthIndex = new HashMap();
    
    void assignMonthIndex()
    {
       monthIndex.put("JAN","01");
       monthIndex.put("FEB","02");
       monthIndex.put("MARCH","03");
       monthIndex.put("APRIL","04");
       monthIndex.put("MAY","05");
       monthIndex.put("JUNE","06");
       monthIndex.put("JULY","07");
       monthIndex.put("AUG","08");
       monthIndex.put("SEPT","09");
       monthIndex.put("OCT","10");
       monthIndex.put("NOV","11");
       monthIndex.put("DEC","12");
    }
    
    void assignMonth()
    {
       months.put("JAN",31);
       months.put("FEB",29);
       months.put("MARCH",31);
       months.put("APRIL",30);
       months.put("MAY",31);
       months.put("JUNE",30);
       months.put("JULY",31);
       months.put("AUG",31);
       months.put("SEPT",30);
       months.put("OCT",31);
       months.put("NOV",30);
       months.put("DEC",31);
    }
    
    private String yearText;
    private String dayText;
    private String monthText;
    
    

    DateControl(String yearText, String dayText, String monthText) 
    {
        this.yearText = yearText;
        this.dayText = dayText;
        this.monthText = monthText;
    }
    
    public boolean dateControl() throws ParseException
    { 
      assignMonth();
      assignMonthIndex();
      if(yearText.length() != 4)
      {
          //System.out.print("YEAR IS NOT 4 CHARS");
          return false;
      } 
        
      int selectedMonthDeadline=months.get(monthText);
      String selectedMonth = monthIndex.get(monthText);
      int selectedDay = Integer.parseInt(dayText);
      int selectedYear = Integer.parseInt(yearText);
      String date =dayText + "/" + selectedMonth + "/" + yearText;
      if(isValid_year(selectedYear) && isValid_date(date))
      {   
          //System.out.print("YEAR IS VALID\n");
          if(dayCheck(selectedDay, selectedYear, monthText, selectedMonthDeadline))
          {
              //System.out.print("DAY IS VALID");
              return true;
          }
      }
      
      
      return false;
      
    }
    
    public boolean dateControlForAppointments() throws ParseException
    { assignMonth();
      assignMonthIndex();
      if(yearText.length() != 4)
      {
          //System.out.print("YEAR IS NOT 4 CHARS");
          return false;
      } 
        
      int selectedMonthDeadline=months.get(monthText);
      String selectedMonth = monthIndex.get(monthText);
      int selectedDay = Integer.parseInt(dayText);
      int selectedYear = Integer.parseInt(yearText);
      String date =dayText + "/" + selectedMonth + "/" + yearText;
      if(!isValid_date(date))
      {   
          //System.out.print("YEAR IS VALID\n");
          if(dayCheck(selectedDay, selectedYear, monthText, selectedMonthDeadline))
          {
              //System.out.print("DAY IS VALID");
              return true;
          }
      }
      
      
      return false;
      
    }
    
    //1904 is oldest person alive right now. ( can be updated lated)
    public boolean isValid_year(int year)
    { 
      Calendar cal = new GregorianCalendar();
      int curr_year = cal.get(Calendar.YEAR);
      return (year >1904) && (year <= curr_year);      
    }
    
    
    //is later than today or no
    public boolean isValid_date(String date) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date curr_date = new Date();
        Date test_date = sdf.parse(date);
        
        if(test_date.compareTo(curr_date) <= 0) //older date
        {
            return true;
        }
        else // newer date
        {
            return false;
        }
    }
    
    //checking leap year to control whether february ends with 28 or 29
    public boolean isLeap_year(int year)
    {        
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
    
    //checking incorrect dates.
    public boolean dayCheck (int day, int year, String month, int monthDeadline)
    {
        boolean result = true;
        if(isLeap_year(year))
      {
          if(month.equals("FEB"))
          {
            if(day > monthDeadline-1)
            {
                result = false;
            }  
          }
          else
          {
            if(day > monthDeadline)
            {
                result = false;
            }
          }
      }
      
      else
      {
          if(month.equals("FEB"))
          {
              if(day > monthDeadline)
              {
                  result = false;
              }
          }
          else 
          {
              if(day > monthDeadline)
              {
                  result = false;
              }
          }
      }
        
        return result;
    }
    
    
    
}
