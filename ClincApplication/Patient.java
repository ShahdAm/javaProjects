/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicapplication;

/**
 *
 * @author Shod
 */
//
import java.util.*;// to call all of the package utility
public class Patient {
    
// creat an instance field 

private String Name; 
private long ID;
private int Phone; 
private String address;
private int age;
private String gender;


    
// creat a defult conrtuctors

    public Patient() {}

// creat a conrtuctors with argument

    public Patient(String Name, long ID, int Phone, String address, int age, String gender)
    {
        this.Name = Name;
        this.ID = ID;
        this.Phone = Phone;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }// end conrtuctors
    


    // creat a toString method

    @Override
    public String toString() {
        return("Name: "+Name+"ID"+ID+"phone: "+Phone+"address: "+address+"age: "+age+"gender: "+gender);
    }
    
// creat a reciveDrug method
    
    public  void ResiveDrug(int age)   
          {
          if (age <= 2)
            {
         System.out.println("5 ml 3 times in day");
            }// end if 
    
           if (age <= 8 && age > 2) 
           {
         System.out.println("10 ml 3 times in day");
           }// end if 
    
           else if (age <=12 && age>8) 
         System.out.println("15 ml 3 times in day");
          }// end method ResiveDrug 
         
      
    
    
    // creat a reciveReport method
    
    public void reciveReport()    
    {
     Scanner input=new Scanner (System.in);
     System.out.println("Name of hospital :");
     String numH =input.next();
     System.out.println("the Date : DD/MM/YYYY");
     String dat =input.next();
     System.out.println("name of patient:");
     String numP=input.next();
     System.out.println("age of patient:");
     int agP =input.nextInt();
     System.out.println("hospital review date :");
     String hRd =input.next();
     System.out.println("prescription :");
     String pR =input.next();
     System.out.println();
     System.out.println("The report was written successfully");
     }// end method reciveReport
    
    // creat a setter method

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setID(long ID) 
    {
        this.ID = ID;
    }

    public void setPhone(int Phone)
    {
        this.Phone = Phone;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }
    
   // creat a geter method

    public String getName()
    {
        return Name;
    }

    public long getID()
    {
        return ID;
    }

    public int getPhone() 
    {
        return Phone;
    }

    public String getAddress()
    {
        return address;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender() 
    {
        return gender;
    }




}// end of Patientclass


