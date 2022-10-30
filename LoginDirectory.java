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
public class LoginDirectory {
    
    private ArrayList<Login> loginDirectory;
    
    public LoginDirectory(){
    this.loginDirectory=new ArrayList<Login>();
    }

    public ArrayList<Login> getLoginDirectory() {
        return loginDirectory;
    }

    public void setLoginDirectory(ArrayList<Login> loginDirectory) {
        this.loginDirectory = loginDirectory;
    }
    
    public Login addnewlogin(){
        Login newLogin=new Login();
        loginDirectory.add(newLogin);
        return newLogin;
    }
    
    
    
}
