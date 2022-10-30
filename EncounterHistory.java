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

    private ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
        encounterHistory = new ArrayList<>();
    }

    public void addEncounter(Encounter encounter) {
        encounterHistory.add(encounter);
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

}

