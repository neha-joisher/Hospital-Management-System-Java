/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Encounter;
import model.Patient;
import model.Person;
import java.util.ArrayList;

/**
 *
 * @author nehajoisher
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalDirectory;
    
    
    public HospitalDirectory(){
        this.hospitalDirectory=new ArrayList<Hospital>  ();
        
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public Hospital addnewHospital(){
         Hospital h=new Hospital();
         hospitalDirectory.add(h);
         return h; 
    }

    public void deleteHospital(Hospital selectedhosp) {
        hospitalDirectory.remove(selectedhosp);
        
   
    }
    
    
    
}