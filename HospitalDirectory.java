/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nehajoisher
 */
public class HospitalDirectory extends City{
    private ArrayList<Hospital> hospdir;

    public ArrayList<Hospital> getHospdir() {
        return hospdir;
    }

    public void setHospdir(ArrayList<Hospital> hospdir) {
        this.hospdir = hospdir;
    }
    
    public HospitalDirectory() {
        this.hospdir = new ArrayList<>();
    }
    
    public Hospital addNewHosp(){
        Hospital newHosp = new Hospital();
        hospdir.add(newHosp);
        return newHosp;
    }      
}
