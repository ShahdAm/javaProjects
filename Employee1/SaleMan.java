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
public class SaleMan extends Employee {
    
    // creat a instance field
    private double bouns;
    private double extraHours;
    private Supervisor spvr;
    public static int nameOfSaleMan;

    
    // creat a constructor

    public SaleMan(String name, int ID, double baseSalary, String Tel) {
        super(name, ID, baseSalary, Tel);
    }
    

    
    public SaleMan(double bouns, double extraHours, Supervisor spvr, String name, int ID, double baseSalary, String Tel) {
        super(name, ID, baseSalary, Tel);
        this.bouns = bouns;
        this.extraHours = extraHours;
        this.spvr = spvr;
    }
  
    
    
    // creat a setter and getter

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(double extraHours) {
        this.extraHours = extraHours;
    }

    public Supervisor getSpvr() {
        return spvr;
    }

    public void setSpvr(Supervisor spvr) {
        this.spvr = spvr;
    }

    public int getNameOfSaleMan() {
        return nameOfSaleMan;
    }

    public void setNameOfSaleMan(int nameOfSaleMan) {
        this.nameOfSaleMan = nameOfSaleMan;
    }
    
    @Override
   public void print() 
    {
        System.out.println("bouns =   "+ bouns+"  extraHours= "+ extraHours);
    }// end of the method 
   

    @Override
  public double calculatSalary()
    {
        this.bouns = extraHours*50;
       return bouns+getNameOfSaleMan();
    }// end of the method 
    
    
    
    
    
    
}// end of the class SaleMan 
