/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicapplication;

/**
 *
 * @author Shod55
 */
//import java.util.*;// call the utilty package

public class Doctor {

    // creat an instance field
    
    private String name;
    private String speciality;
    private String qualification;
    private long ID;
    private int phoneNumber;



    // creat a defualt constructor
    Doctor() {}

    
    // creat a constructor with argum
    public Doctor(String name, String speciality, String qualification, long ID, int phoneNumber) 
    {
        this.name = name;
        this.speciality = speciality;
        this.qualification = qualification;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
    }

    
     // creat a setter & getter
    public void setName(String name) 
    {

        this.name = name;
    }

    public void setSpeciality(String speciality)
    {    
     this.speciality = speciality;
    }  

    public void setQualification(String qualification) 
    {
        this.qualification = qualification;
    }

       
    public long getID() 
    {
        return ID;
    }

    public void setID(long ID)
    {
        this.ID = ID;
    }
    
    
    public void setPhoneNumber(int phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() 
    {

        return phoneNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getSpeciality()
    {
        return speciality;
    }

    public String getQualification()
    {
        return qualification;
    }

   

    public String toString() 
    {
        return name + ", " + speciality + ", "
      + qualification + ", " + ID + ", " + phoneNumber;
    }


    
    
}// end of Doctor class
