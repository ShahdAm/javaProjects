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
public class Supervisor extends Employee {
    // creat an instance field
    private int expensive;
    public static int nameOfSupervisor;

    // creat a defualt constructor

    public Supervisor(String name, int ID, double baseSalary, String Tel) {
        super(name, ID, baseSalary, Tel);
    }

    public Supervisor(int expensive, String name, int ID, double baseSalary, String Tel) {
        super(name, ID, baseSalary, Tel);
        this.expensive = expensive;
    }

  
    
    // creat a settre and gettter

    public int getExpensive() {
        return expensive;
    }

    public void setExpensive(int expensive) {
        this.expensive = expensive;
    }

    public int getNameOfSupervisor() {
        return nameOfSupervisor;
    }

    public void setNameOfSupervisor(int nameOfSupervisor) {
        this.nameOfSupervisor = nameOfSupervisor;
    }
    
    
 @Override
   public void print() 
    {
  System.out.println("expensive =  "+ expensive + " nameOfSupervisor =" + nameOfSupervisor );
    }// end of the method 
   
   
    @Override
  public double calculatSalary()
    {
       return this.expensive*0.5*getBaseSalary()+getBaseSalary();
    }// end of the method 
    
    
}// end of class
