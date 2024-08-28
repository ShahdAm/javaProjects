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
public abstract class DoctorData extends SEdoctor{
    // Define data clumping by combining related fields

    private String name;
    private String specialization;
    private int experience;

    public DoctorData(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public DoctorData[] getDoctors() {
        return doctors;
    }

    public void setDoctors(DoctorData[] doctors) {
        this.doctors = doctors;
    }


    
    
    public abstract String getDoctorProfile();


}

    
