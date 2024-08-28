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
public class Employee1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // object 1
        SaleMan s1 = new SaleMan("Mohammed", 11173685, 10000,"966553862");
        Supervisor sp1 = new Supervisor("Omer", 111456742, 1500,"966537892");
        
   
        System.out.println("E1");
        System.out.println("name= " + s1.getName()+ " ID= "+s1.getID()+" BaseSalary= "+s1.getBaseSalary()+" Tel= "+ s1.getTel());
        s1.setBouns(50);
        s1.setExtraHours(3);
        s1.calculatSalary();
        s1.print();
        System.out.println("The total of salary= " +s1.calculatSalary());
        
        
        
        System.out.println(""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + "");
        
            System.out.println("E2");
        
        System.out.println("name= " + sp1.getName()+ " ID= "+sp1.getID()+" BaseSalary= "+sp1.getBaseSalary()+" Tel= "+ sp1.getTel());
        sp1.setExpensive(1000);
        sp1.setBaseSalary(1500);
        sp1.calculatSalary();
        sp1.setNameOfSupervisor(2);
        sp1.print();
        System.out.println("The total of salary= " +sp1.calculatSalary());
        
    }
    
}
