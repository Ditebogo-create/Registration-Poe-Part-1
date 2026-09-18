/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.registration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class loginIT {
    
    public loginIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CheckUserName method, of class login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("CheckUserName");
        String username = "Kyl_1";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.CheckUserName(username);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkPasswordComplexity method, of class login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Selen@90";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }
       
    /**
     * Test of CheckCellPhoneNumber method, of class login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("CheckCellPhoneNumber");
        String phone = "+27725861045";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.CheckCellPhoneNumber(phone);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registerUser method, of class login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "Kyl_1";
        String password = "Selen@90";
        String phone = "+27725861045";
        login instance = new login();
        String expResult = "User is successfully registered";
        String result = instance.registerUser(username, password, phone);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of loginUser method, of class login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String StoredUsername = "Kyl_1";
        String StoredPassword = "Selen@90";
        String enteredUsername = "Kyl_1";
        String enteredPassword = "Selen@90";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.loginUser(StoredUsername, StoredPassword, enteredUsername, enteredPassword);
        assertEquals(expResult, result);
       
    }
        
    /**
     * Test of returnLoginStatus method, of class login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginStatus = false;
        String firstname = "Kyle";
        String lastname = "Mandes";
        login instance = new login();
        String expResult = "Welcome"+ firstname + " " + lastname +", it is great to see you again.";

      
    }
    
}
