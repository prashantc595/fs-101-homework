package com.mk.xebia.solid.srp;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class LoginTest {

    @Test
    void test() {
    	Login login = new Login();
    	String email="username@myapp.com";
    	String password="My $ecurE P@$$w0rd";
    	
    	String expected = login.perform(email, password);
    	String actual = "Are you sure you have provided correct password?";
    	
    	assertEquals(expected, actual);
    	
    	
    }
}