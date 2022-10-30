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
public class DoctorDirectory {



    private ArrayList<Doctor> doctors = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void encounterDoctor(int id, Encounter enc) {

        for (Doctor v : doctors) {

            if (v.getId() == id) {
                v.getEncounterHistory().addEncounter(enc);
                return;
            }
        }
        return;
    }

    public void deleteDoctor(int id) {
        for (Doctor v : doctors) {

            if (v.getId() == id) {
                doctors.remove(v);
                return;
            }
        }
    }

    public Doctor searchDoctor(int txtId) {

        for (Doctor v : doctors) {
            if (v.getId() == txtId) {
                return v;
            }
        }
        return null;

    }
}

