/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicapplication;

/**
 *
 * @author ood32
 */

//import java.util.*;// to call all of the package utility

public class HealthTools implements Calculators {
    
    // creat an instance field
    
    private float weight,length;
    private String activity;
    private int date,month,year;

   
    // creat a defualt constructor
    public HealthTools() {}
    
    
     // creat a constructor with argument
    public HealthTools(float weight, float length, String activity) 
    {
    this.weight = weight;
    this.length = length;
    this.activity = activity;
    }

    // creat a setters & getters
    public float getWeight()
    {
        return weight;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public float getLength() 
    {
        return length;
    }

    public void setLength(float length) 
    {
        this.length = length;
    }

    public String getActivity() 
    {
        return activity;
    }

    public void setActivity(String activity)
    {
        this.activity = activity;
    }

    public int getDate() 
    {
        return date;
    }

    public void setDate(int date)
    {
        this.date = date;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month) 
    {
        this.month = month;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    // creat a method birthCalculator
    public void birthCalculator(int day,int month,int year) { // comput the last menstual period
        
        int y;
         if(month>3)
         {
                 y = year + 1;
         }// end if 1
         
         else
         {
                 y = year;
         }// end else1
         
         if (month>3)
         {
                 month=month-3;
         }// end if 2
         
        else
             month = 9 + month;
            System.out.println((date + 7)+"/"+month+"/"+y);
        }// end method birthCalculator


    // creat a method proteinIntakeCalculator

    @Override
    public void proteinIntakeCalculator(float length, int activity) { // comput a protin and activity of user
        
        if(activity == 1) // activity is low 
        {
            System.out.println( 23*Math.pow((length/100),2)*0.8);
        }// end if
        
        else if(activity == 2) // activity is middle
        {
            System.out.println(23*Math.pow((length/100),2)*1.2);
        }// end else if
    
        else
            System.out.println( 23*Math.pow((length/100),2)*1.5);  // activity is high
        }// end method proteinIntakeCalculator

    
         // creat a method waterConsumpionCalculator    
        @Override
        public void waterConsumpionCalculator(float weight) // comput a water in body 
             {
            System.out.println((weight/1000.0)/0.024);
             }// end method waterConsumpionCalculator

        
          // creat a method bodyMassIndexCalculator 
        @Override
        public void bodyMassIndexCalculator(float weight, float length) // comput a mass of user
        {
               double mass=((weight/1000.0)/Math.pow((length/100.0),2));
               System.out.println("bodyMassIndex= "+ mass);
        }// end method bodyMassIndexCalculator

   
    }// end of HealthTools class
