/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sedoctor;

/**
 *
 * @author ood32
 */
public class Gynecologist extends DoctorData{
       public Gynecologist(String name) {
        super(name, "Cardiologist", 10);
    }

    @Override
    public String getDoctorProfile() {
        return "Doctor Name: " + getName() + "\nSpecialization: " + getSpecialization() + "\nExperience: " + getExperience() + " years";
    }
}
