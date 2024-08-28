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

//import java.util.*;// to call all of the package utility
public  abstract class UserAccount  {
    
    // creat an insnace field
    String category;
    String email;
    String password;
   
     
   // creat a constructor with argument
    public UserAccount(String category, String email, String password) 
    {
        this.category = category;
        this.email = email;
        this.password = password;
    }

     // creat a defualt constructor
    public UserAccount() {}
    
    
    // creat a setters & getters
    
     public void setEmail(String email) 
     {
        this.email = email;
     }
     
    public String getEmail()
    {
     return email;
    }

    public String getCategory() 
    
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    // creat an abstract method
    public  abstract String login( String email,String Password);    

    
}// end of UserAccount class 
