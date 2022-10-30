/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.EncounterHistory;
import java.util.Date;

/**
 *
 * @author nehajoisher
 */
public class Doctor extends Person {

    private EncounterHistory encounterHistory;

    public Doctor(String firstName, String lastName, House residence, String gender, Date dob, int id, Encounter en) {
        super(firstName, lastName, residence, gender, dob, id);

        this.encounterHistory = new EncounterHistory();
        this.encounterHistory.addEncounter(en);
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory eh) {
        this.encounterHistory = eh;
    }

}
