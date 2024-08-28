/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicapplication;


import java.util.*;// to call all of the package utility

/**
 *
 * @author Shad
 */

public class Staff extends UserAccount{
    
    // creat an insnace field
    private String name;
    private long ID;
    private String department;


   
  // creat a defualt constructor
    public Staff() {}

    
 // creat a constructor with argument
   public Staff(String name, long ID, String department, String category, String email, String password) 
   {
        super(category, email, password);
        this.name = name;
        this.ID = ID;
        this.department = department;
    }

   
    // creat a method assistPatient
    public void assistPatient( Patient p){
        // enter of info about patient
    Scanner input = new Scanner(System.in);
    System.out.println("please enter patient name");
    p.setName(input.next());
    System.out.println("please enter patient age");
    p.setAge(input.nextInt());
    System.out.println("please enter patient address");
    p.setAddress(input.next());
    System.out.println("please enter patient Id");
    p.setID(input.nextLong());
    System.out.println("enter patient phone");
    p.setPhone(input.nextInt());
    
      System.out.println("plase Choose the gander 1 if female or 2 for male ");
         int gander = input.nextInt();
         if(gander == 1)
             
         p.setGender("Female");
         
         else if(gander == 2)
             
          p.setGender("Male");
         
         else
             
      System.out.println("Exit");
            }// end method assistPatient

    
    
//   /* 
//    System.out.println("Enter the qualification: ");
//    String diploma = input.next();
//    if(diploma.equals(diploma)){
//       System.out.println("the salary is 1000");    
//    }
//        
//    String Bachelor = input.next();
//    else if (Bachelor.equals(Bachelor))
//        System.out.println("the salary is 2000");
//        */
    
  


   // creat a setters & getters
        public void setName(String name) 
        {
        this.name = name;
        }
        public void setID(long ID)
        {
        this.ID = ID;
        }
        public void setDepartment(String department) 
        {
        this.department = department;
        }
        public String getName() 
        {
        return name;
        }
        public long getID() 
        {
        return ID;
        }
        public String getDepartment() 
        {
        return department;
        }

        
       // creat a method login
    @Override
    public String login(String email,String Password) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your email");
        String E=in.next();
        System.out.println("Enter your password");
        String p=in.next();
        
        if(email.equals(E)&&Password.equals(p))
        {
            System.out.println("Successful Login"+toString());
            return "T";
        }// enf if 
        
        else
        {
            System.out.println("wrong data");
            return "w";
        }// end else
    }// end method login

    
    // creat a method toString
    @Override
    public String toString() 
    {
        return "Staff{" + "name=" + name + ", ID=" + ID + ", department=" + department + '}';
    }// end method toString

}// end of StaffClass
