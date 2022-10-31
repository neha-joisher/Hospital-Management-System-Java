/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Credentials;
import java.util.ArrayList;

/**
 *
 * @author neha
 */
public class CredentialDirectory{
    private ArrayList<Credentials> credential;    
    
    public CredentialDirectory(){
        this.credential = new ArrayList<Credentials>();
    }        

    public ArrayList<Credentials> getCredential() {
        return credential;
    }

    public void setCredential(ArrayList<Credentials> credential) {
        this.credential = credential;
    }

    public Credentials addNewCredentials(){

    Credentials newcred = new Credentials();
    credential.add(newcred); 
    return newcred;
    
    }       

    public ArrayList<Credentials> searchCredentials(String username,String password, String role)
    {
        ArrayList<Credentials> searchCredentials = new ArrayList();
        for(Credentials credentials1: credential)
        {
            if(credentials1.getUsername().equals(username) && credentials1.getPassword().equals(password) && credentials1.getRole().equals(role))
            {
           
                searchCredentials.add(credentials1);
               
            }
        }
        return searchCredentials;
    }    

    public boolean checkSysAdminCred(String username,String password, String role){
                 
        if(username.equals("admin") && password.equals("admin") && role.equals("System Administrator")){
            return true;
        }
        else{
            return false;
        }
            
    }
    
    public boolean checkCommAdminCred(String username,String password, String role)
    {
       
        ArrayList<Credentials> searchCredentials = new ArrayList();
       
        
        for(Credentials credentials1: credential)
        {
            
            if(credentials1.getUsername().equals(username) && credentials1.getPassword().equals(password) && credentials1.getRole().equals(role))
            {
               
                searchCredentials.add(credentials1);
               
            }
        }
        if(searchCredentials.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean checkHospAdminCred(String username,String password, String role)
    {
        ArrayList<Credentials> searchCredentials = new ArrayList();
        for(Credentials credentials1: credential)
        {
           
            if(credentials1.getUsername().equals(username) && credentials1.getPassword().equals(password) && credentials1.getRole().equals(role))
            {
                
                searchCredentials.add(credentials1);
               
            }
        }
        if(searchCredentials.isEmpty()){
            return false;
        }else{
            return true;
        }
    }    
    
}
