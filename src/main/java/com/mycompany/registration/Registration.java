/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Registration {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String Username;
        String Firstname;
        String lastName;
        String Password;
        String cellphone;
        System.out.println("-------Registration-----------");
        System.out.print("Enter the Username:");
       String username = scanner.nextLine();
         
        System.out.print("Enter the first name: ");
        String firstname = scanner.nextLine();
        
        System.out.print("Enter the lastname: ");
        String lastname = scanner.nextLine();
        
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        
        System.out.print("Enter the cellphone number: ");
        cellphone = scanner.nextLine();
    
        
        login login = new login();
        
        boolean validUsername = login.CheckUserName(username);
        boolean validPassword = login.checkPasswordComplexity(password);
        boolean validPhone = login.CheckCellPhoneNumber(cellphone);
        
        if(validUsername) {
            System.out.println("Username successfully captured"); }
        else {
            System.out.println("Username is not correctly formatted please ensure that your username contains an underscore and is notmore than fie characters in length");
        }
        
        if (validPassword) {
            System.out.println("Password is not correctly formatted please ensure password contains at least eight characters,a capital letter,a number,and a special character");
        }
        
        if(validPhone) {
        System.out.println("Phone number successfully captured");
    }
        else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code");
                }
        
        if(validUsername && validPassword && validPhone) {
            System.out.println("Registration successful");
            System.out.println("");            
            System.out.println("-------LOGIN-----------");
            System.out.print("Enter Username: ");
            
            String enteredUsername = scanner.nextLine();
            System.out.print("Enter Password: ");
            String enteredPassword = scanner.nextLine();
            
            boolean loginStatus = login.loginUser(username,password, enteredUsername, enteredPassword);
            
            System.out.println(login.returnLoginStatus(loginStatus,firstname,lastname));
            
            scanner.close();
        }
    }
}
    
            
        
  

            
            
            
            
                   
     
    
                  
                    
            
        
        
        
        
        
        
        
        
        
        
        
        
        
                            
            
       
      
                
    

