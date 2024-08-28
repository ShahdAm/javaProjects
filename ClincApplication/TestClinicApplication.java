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
import java.io.*;
import java.util.*;
import java.io.File;

public class TestClinicApplication {
  
 
    public static void main(String[] args) {
        // creat an object from doctor
        Doctor []drs=new Doctor[3];
        drs[1]=new Doctor("Raghad", "Nerves", "Master", 1237992463, 0563554753);
        drs[2]=new Doctor("Tif", "General Doctor", "Master", 1237882445,0554554751);
        drs[0]=new Doctor("Shahad", "Skin", "Bechelor", 148354,0503124453);
        
        // creat an object from staff
        Staff stf=new Staff("Aisha", 12345, "Assist", "Staff", "aisha@gmail.com", "123456");
        Staff dr=new Staff("Noof", 12345, "Doctor", "Staff", "noof@gmail.com", "123456");
        
         // creat an object from Appointment
        Appointment[]apps=new Appointment[3];
        apps[0]=new Appointment("18/5/2022","09.30AM", drs[1].getName());
        apps[2]=new Appointment("20/5/2022","17.00PM", drs[2].getName());
        apps[1]=new Appointment("19/5/2022", "12.00PM", drs[0].getName());
        
        // creat an object from Drugs
        Drugs dg=new Drugs();
       
        
         // creat an object from Patient
        Patient pat = new Patient();
        
        // creat an object from HealthTools
        HealthTools tools=new HealthTools();
        
        
        // display a list of serves
        List<Patient> pts = new ArrayList<Patient>();// polymorphysim 
         int l=0;
         Scanner input=new Scanner(System.in);
         
         try{
             
         do{
             
         System.out.println("enter 1 if you want to get help\n"
         + "press 2 to reserve an appointment\n"
         + "press 3 if you want to take advantage of the health tools"// يستفيد من الادوات الطبية 
         + "\npress 4 if you want to consult a doctor"
         + "\npress 5 to log in"
         + "\npress 0 to exit");
        
         
         
        l =input.nextInt();
        
         if(l==1)
         {
                      System.out.println();

         System.out.println("How can I helpe you?");
         System.out.println("1-View doctors working hours"
         + "\n2-Show clinic branches"
         + "\n3-Offers and prices"
         + "\nEnter your choise plase:");
         
         int a1= input.nextInt();
         System.out.println();
         
         if (a1 == 1)
         {
              try {
                  // part of file **
             File m = new File("doctors working hours.txt");
             
             Scanner in = new Scanner(m);
             
             while(in.hasNextLine())
             {
             String data = in.nextLine();
             System.out.println(data);
  
             }// end while
             
              in.close();
              System.out.println();
              System.out.println("In order for us to assist you better, please contact us by email:"
              + "\n"+"Name: "+stf.getName()
              +"\n"+"Department: "+stf.getDepartment()
              +"\n"+"Email: "+stf.getEmail());
                 }// end of try 
              
              
             catch (Exception e)
                 {
                 System.out.println("An error occured!");
                 }// end of catch
              
                 }// end 2nd if
         
         else if (a1 == 2)
         {
               try{
                   
            File myfile = new File("clinic branches.txt");
            Scanner myReader = new Scanner(myfile);
            
            while (myReader.hasNextLine())
             {
            String data = myReader.nextLine();
             System.out.println(data);
             }// end while 2nd 
            
              myReader.close();
            //  System.out.println();
              //System.out.println("In order for us to assist you better, please contact us by email:\n"
              //+"Name: "+stf.getName()
             // +"\n"+"Department: "+stf.getDepartment()
             // +"\n"+"Email: "+stf.getEmail());
                 }// end of try 2nd
               
               
                 catch (Exception e)
                 {
                 System.out.println("An error occured!");
                 }// end of catch
               
         }// end else if 1st
         
         
         else if(a1==3)
         {
              try{
                     
             File m3=new File("Offers and prices.txt");
             Scanner r3=new Scanner(m3);
             
             while (r3.hasNextLine())
             {
            String data = r3.nextLine();
             System.out.println(data);
             }// end while 3rd
             
              r3.close();
              System.out.println();
              System.out.println("In order for us to assist you better, please contact us by email:\n"
              +"Name: "+stf.getName()
              +"\n"+"Department: "+stf.getDepartment()
              +"\n"+"Email: "+stf.getEmail());
               
                 }// end of 3rd try
              
                 catch (Exception e)
                 {
                 System.out.println("An error occured!");
                 }// end of catch 3rd 
                
         }// end 3rd if 
         }// end if 1st
         
         else if (l==2)
         {
             System.out.println();
             System.out.println("please enter doctor name");
             String drName=input.next();
             System.out.println("please enter the time HH:MM AM/PM");
             String time=input.next();
             System.out.println("please enter the date DD/MM/YYYY");
             String dt=input.next();
             int av=0;
             for(int i=0;i<apps.length;i++)
             {
                 
             if(apps[i].CheckAvailability(drName,dt, time)== true)
             {
                 apps[i].SendConfirmationMail();
               av=1;
             }// end if inner 
            
             }// end for 
             
          if (av==0)
         {
              System.out.println("sorry appointmtnt not available");
         }// end 4th if 
          
         }// end else if 
         
         
        else if (l ==3 )
        {
        System.out.println();
        
   do {
       
    System.out.println("1-birthCalculator"
    + "\n2-proteinIntakeCalculator"
    + "\n3-waterConsumpionCalculator"
    + "\n4-bodyMassIndexCalculator");
    
    l=input.nextInt();
    
    if (l==1)
    {
    System.out.println("Enter the date of your last menstrual period DD/MM/YYYY");
    tools.setDate(input.nextInt());tools.setMonth(input.nextInt());tools.setYear(input.nextInt());
    System.out.println("Estimated date of birth is");
    tools.birthCalculator(tools.getDate(),tools.getMonth(), tools.getYear());
    }// end 5th if 
    
    else if (l==2)
    {
        int ch;
    System.out.println("Choose the right number for your activist"
     + "\n1-Little\n2-middle\n3-High");
    
    ch=input.nextInt();
    System.out.println("enter your length");
    tools.setLength(input.nextFloat());
    System.out.println("Your protein consumption=");
    tools.proteinIntakeCalculator(tools.getLength(),ch);
    }// end else if inner 
    
    
    else if(l==3)
    {
    System.out.println("enter your weight");
    tools.setWeight(input.nextFloat());
    System.out.println("Your water consumption=");
    tools.waterConsumpionCalculator(tools.getWeight());
   }// end if else 
    
    else if(l==4)
    {
    System.out.println("enter your length");
    tools.setLength(input.nextFloat());
    System.out.println("enter your weight");
    tools.setWeight(input.nextFloat());
    tools.bodyMassIndexCalculator(tools.getWeight(), tools.getLength());
    }// end if else 
    
    }// end do 
    while(l==0);
    } // end else if 
        
     else if(l==4)
     {
    System.out.println();
    System.out.println("Hello I am dr. "+drs[0].getName()+"Choose the number of the disease your child suffers from: ");
    System.out.println("1-sore throat\n" +
    "2-diarrhea\n" +
    "3-constipation\n" +
    "4-stiff neck\n" +
    "5-breathing difficulties\n" +
    "6-your baby's skin color changes to a pale color");
        //إلتهاب الحلق-1
        // اسهال-2
        //امساك -3
        //تصلب الرقبة-4
        //صعوبات في التنفس5
        //يتغير لون بشرة طفلك إلى لون شاحب¨-6
        
        int c;
        System.out.println("Enter choise plase: ");
        c= input.nextInt();
        //pat.descrbtion(c);
        
        switch (c)
        {
        case 1: System.out.println("Warning: Aspirin should never be given to children or teenagers due to its association with Reye's syndrome, which, although rare, can be life-threatening and cause swelling of the liver and brain."
        + "\nyour child can take Tylenol or Advil or Morton\n"
        + "\nClick on the drug number to view its information and check its availability in our pharmacy");dg.Drugs();
        System.out.println("Enter children age:");
        pat.setAge(input.nextInt());
        pat.ResiveDrug(pat.getAge());       
    break;
    case 2: System.out.println("Note: Rapid treatment of diarrhea in children is to replace lost fluids to prevent dehydration"
    + "\nyour child can take Nanazoxid or Flagyl"
    + "\nClick on the drug number to view its information and check its availability in our pharmacy");dg.Drugs();
    System.out.println("Enter children age:");
    pat.setAge(input.nextInt());
    pat.ResiveDrug(pat.getAge());
    break;
    case 3: System.out.println("\nyour child can take Metamucil or Citrucel");dg.Drugs();
    System.out.println("Enter children age:");
    pat.setAge(input.nextInt());
    pat.ResiveDrug(pat.getAge());
    break;
    case 4: System.out.println("You must bring your child to us for a diagnosis");break;
    case 5: System.out.println("You must bring your child to us for a diagnosis");break;
    case 6: System.out.println("You must bring your child to us for a diagnosis");break;
    }// end of switch
    }// end else if 5th
        
     else if(l==5)
     {
        System.out.println();
        System.out.println("Log in as:\n1-Staff\n2-Doctor\nEnter your chois: ");
        int c=input.nextInt();
        if (c==1)
        {
        String log = stf.login(stf.getEmail(), stf.getPassword());
        if(log.equals("T"))
        {
        stf.assistPatient(pat);
        addPatient(pts,pat);
        }// end if statment
        }// end if statment 2
        else if(c==2)
        {
        String login = dr.login(dr.getEmail(), dr.getPassword());
        if(login.equals("T"))
        {
        pat.reciveReport();
        }// end else if inner 2
        
        }// end else if inner
        
        }// end else if 6th
        
        
        
        else if(l==0)
        {
        System.exit(0);
        }// else if 
         
         System.out.println();
        }
         while(l!=0);
        
         
        }// try 1st 
         
         catch(Exception ex)
         {
        // ex.printStackTrace();
             System.out.println("An error occurd");
         }// end catch
    
    }// end of main 
    
   
// creat a method of addPatient with decumentation 
    /**
     * @param pts the command line arguments
     * @param p
     */
    public static void addPatient(List<Patient> pts, Patient p){
        pts.add(p);
        System.out.println("you have added a new patient"); 
        System.out.println(p.toString());
            
    
    }//end of addPatient
    
      
     
}// end of class TestClinicApplication

    
         

      
 


