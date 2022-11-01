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
public class EncounterHistory {
    private ArrayList<Encounter> Encdir;    
    
    public ArrayList<Encounter> getEncdir() {
        return Encdir;
    }

    public void setEncdir(ArrayList<Encounter> Encdir) {
        this.Encdir = Encdir;
    }


    public EncounterHistory(){
        this.Encdir = new ArrayList<>();
    }    

    public Encounter addEncounter(){

    Encounter newEnc = new Encounter();
    Encdir.add(newEnc);
    return newEnc;
    
    }          
    
}
