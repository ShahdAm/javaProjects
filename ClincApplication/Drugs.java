/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicapplication;

/**
 *
 * @author Shahad
 */
import java.util.*;// to call all of the package utility

public class Drugs {

    // creat an insnace field
    String name;
    int cost;
    int quantity;
    
    
   // creat a constructor with argument
    
    public Drugs(String name, int cost, int quantity) 
    {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        
    }// end of constructor
    

    // creat a defualt constructor
    public Drugs() {}

   // creat a setters & getters
    public String getName()
    {
        return name;
    }//end getname

    public void setName(String name) 
    {
        this.name = name;
    }//end setname

    public int getCost() 
    {
        return cost;
    }// end getcost

    public void setCost(int cost) 
    {
        this.cost = cost;
    }// end setcost

    public int getQuantity() 
    {
        return quantity;
    }// end getquntity

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }// end setquntity

 
    // creat a method CheckAvailability
    public String CheckAvailability() 
    {
        if (quantity > 0) 
        {
            System.out.println( name +"  Available");
        }
        else
        {
            System.out.println(name +"  Not Available ");    
        }
         return "";
    }// end of method CheckAvailability

    
    //  get & set of instance payment
//    public int getPayment() 
//    {
//        return cost;
//    }// end of getpayment
//
//    public void setPayment() 
//    {
//        this.cost = cost;
//    }// end of setpayment

    // creat a toString method 
    @Override
    public String toString() 
    {
        return ("name=" + name + ", cost=" + cost + ", quantity=" + quantity)+CheckAvailability();
    }// end of method String
    
    
    // creat method of Drug
    
    public void Drugs()
    {
    Drugs[] drgs=new Drugs[7];
    drgs[0]=new Drugs("Tylenol", 25, 10);
    drgs[1]=new Drugs("Advil", 20, 2);
    drgs[2]=new Drugs("Morton", 30, 0);
    drgs[3]=new Drugs("Nanazoxid", 35, 30);
    drgs[4]=new Drugs("Flagyl", 40, 100);
    drgs[5]=new Drugs("Metamucil", 45, 5);
    drgs[6]=new Drugs("Citrucel", 50, 90);
    
    
    try{
        
System.out.println("To check the availability of the drug and inquire about its information,"
    + "\n click on its number \n" +
        "0-Tylenol\n" +
        "1-Advil\n" +
        "2-Morton\n"
        + "3-Nanazoxid\n"
        + "4-Flagyl\n"
        + "5-Metamucil\n"
        + "6-Citrucel" +
        "Or to view the list of medicines, press on the number 8.");

   Scanner input = new Scanner(System.in);
    int c = input.nextInt();
    if(c == 8)
    {
    for(int i=0;i<drgs.length;i++)
    {
        System.out.println(drgs[i]);
     
    }// end for loop
    }// end if statment
    
    else
    {
     System.out.println(drgs[c]);
    
    }// end else
    }// end try
    
    catch (ArrayIndexOutOfBoundsException ex)
    {
    System.out.println("Invalid, try agin");
    }// end catch
    
    
    }// end of method Durg 
    
}// end of DrugsClass
