/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicapplication;

/**
 *
 * @author Shad
 */
import java.util.*;// call the utilty package

public class Appointment {
    
    // creat an instance field
    
     String Date ;
     String Time;
     String DoctorName ;
    
     
     
    // creat a defulat constructor 
    public Appointment() {}

    
    // creat a constructor with agrument
    public Appointment(String Date, String Time, String DoctorName)
    {
        this.Date = Date;
        this.Time = Time;
        this.DoctorName = DoctorName;
    }// end 
    
    
    // creat a toString method 
   @Override
    public String toString()
    {
        return "Appointments{" + "Date=" + Date + ", Time=" + Time + ", DoctorName=" + DoctorName + '}';
    }// end toString

    
    // creat a setter & getter 
    public String getDate() 
    {
        return Date;
    }

    public void setDate(String Date) 
    {
        this.Date = Date;
    }

    public String getTime()
    {
        return Time;
    }

    public void setTime(String Time)
    {
        this.Time = Time;
    }

    public String getDoctorName()
    {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName)
    {
        this.DoctorName = DoctorName;
    }
   
 
    // creat a CheckAvailability method 
    
  public boolean CheckAvailability (String DoctorName,String Date,String Time)
  {
         if(this.DoctorName.equals(DoctorName)&&this.Date.equals(Date)&&this.Time.equals(Time))
         {
          return true;
         }// end if 
         else
         {
            // System.out.println("sorry appointmant is not available");
      return false;
         }// end of else
     
    }// end of CheckAvailability
  
  
  // creat a SendConfirmationMail method
  public void SendConfirmationMail ()
    {
    System.out.println("Dear references: We would like to inform you that your appointment has been confirmed");
    }// end of SendConfirmationMail

  
}// end of AppointmentClass
