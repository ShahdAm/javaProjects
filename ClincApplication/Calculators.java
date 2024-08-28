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
public interface Calculators {
  
    // creat a method abstract 
public abstract void birthCalculator(int day,int month,int year);
public abstract void proteinIntakeCalculator(float length,int activity);
public abstract void waterConsumpionCalculator(float weight);
public abstract void bodyMassIndexCalculator(float weight,float length);
 
}// end of interface Calculators



