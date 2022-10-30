package model;
import model.Patient;
import model.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonDirectory {
    
    private ArrayList<Person> persons;

    public PersonDirectory() {
        persons = new ArrayList<>();
    }

    public Person addPerson(){
      Person newp =new Person();
      persons.add(newp);
      return newp;
    }
    
    
    public void removePerson(Person person){
        persons.add(person);
    }


    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public Person searchUser(int txtId) {

        for (Person v : persons) {
    
            if (v.getId() == txtId ) {
              
                return v;
            }
        }
        return null;
    }

    public void deletePerson(int id) {
       
        
       for (Person p : persons) {
            
            if (p.getId() == id ) {
                persons.remove(p);
                return;
            }
        }
    }
}
