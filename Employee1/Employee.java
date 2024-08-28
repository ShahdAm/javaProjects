/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee1;

/**
 *
 * @author ood32
 */
public class Employee {
    // creat instance field
    private String name;
    private int ID;
    private double baseSalary;
    public String Tel;
    
 
    // creat a constructor

    public Employee(String name, int ID, double baseSalary, String Tel) {
        this.name = name;
        this.ID = ID;
        this.baseSalary = baseSalary;
        this.Tel = Tel;
    }

    

    
   
    // creat a setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBaseSalary() 
    {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }
    
    public void print() {
        System.out.println("name= "+ name+ "ID ="+ ID+"baseSalary ="+ baseSalary+"Tel"+Tel ); 
    }// end of the method 
    
   
    
  public double calculatSalary() 
    {
      return this.baseSalary = this.calculatSalary();
    }// end of the method 
    
    
    
    
    
    
    
}//end 
