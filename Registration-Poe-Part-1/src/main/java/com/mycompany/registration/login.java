/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class login {

    public login() {
        
    }
    
    // Username Validation
    public boolean CheckUserName(String username){
        return username.contains("_") && username.length() <= 5;
    }
      
    //Password Validation
    public boolean checkPasswordComplexity(String password) {
        
        String capital = ".*[A-Z].*";
        String special = ".*[!@#$%^&*(),.?\":{}|<>].*";
        String small = ".*[a-z].*";
        String digit = ".*\\d.*";
        
        return password.length() >= 8 
                &&
                password.matches(capital) 
                &&
                password.matches(special)
                &&
                password.matches(small)
                &&
                password.matches(digit); }
    
    // Phone Validation
    public boolean CheckCellPhoneNumber(String phone) {
        if (phone.length() <= 12
                &&
       phone.startsWith("+27")) {
        
        int fourthDigit = Character.getNumericValue(phone.charAt(3));
        
         return fourthDigit >= 6 && fourthDigit <= 8; 
    }
     
    return false; }

// Register User
public String registerUser(
        String username,
        String password,
        String phone) {
    
    if (CheckUserName(username)
            &&
    checkPasswordComplexity(password) 
            &&
    CheckCellPhoneNumber(phone)) {
        
        return"User is successfully registered";
    }
        return"User registration failed";
}

// Login Validation
public boolean loginUser(
        String StoredUsername,
        String StoredPassword,
        String enteredUsername,
        String enteredPassword) {
    
    return (StoredUsername.equals(enteredUsername)
            &&
            StoredPassword.equals(enteredPassword));
}

// Login status
public String returnLoginStatus(
        boolean loginStatus,
        String firstname,
        String lastname) {
    
    if (loginStatus) {
        return "Welcome"
                + firstname + " "
                + lastname
                +", it is great to see you again.";
    }
    
    return "Username or Password incorrect,please try again.";
}
}


    
    
    
    
    
    
    
    
            
            
            
            
            
            
            
            
            
            
            
    
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
            
 
 
    
    

    
    
    
