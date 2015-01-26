/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary.model;

/**
 *
 * @author Octabits
 */
public class User {
    
    private String username;
    private String password;
    private String email;
    
    public User(String _username, String _password){
        
        this.username = _username;
        this.password = _password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String _username) {
        this.username = _username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String _password) {
        this.password = _password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String _email) {
        this.email = _email;
    }
}
