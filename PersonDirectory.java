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
public class PersonDirectory{
    private ArrayList<Person> allpeople;    
    private House hse;

    public ArrayList<Person> getAllpeople() {
        return allpeople;
    }

    public void setAllpeople(ArrayList<Person> allpeople) {
        this.allpeople = allpeople;
    }
    
    public void deletePerson(Person ms) {
        allpeople.remove(ms);
    }    
    public PersonDirectory(){    
        this.allpeople = new ArrayList<Person>();    
    }
    
    public Person addNewPerson(){
        Person newperson = new Person();
        allpeople.add(newperson);
        return newperson;
    }          
    public ArrayList<Person> searchperson(String city1)
    {
        ArrayList<Person> searchperson = new ArrayList();
        for(Person city: allpeople)
        {
            if(city.getName().toLowerCase().equals(city1.toLowerCase()))
            {
           
                searchperson.add(city);
               
            }
        }
        return searchperson;
    }    
    
}
