package com.example.kerut.quizapp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AuthenticationTest {

    @Test
    public void isValidEmailValid() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidEmail("kerutisvilius@gmail.com");
        Assert.assertTrue(valid);
    }

    @Test
    public void isValidEmailNotValid() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidEmail("kerutisvilius?gmail.com");
        Assert.assertFalse(valid);
    }

    @Test
    public void isValidEmailNotValidEnd() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidEmail("kerutisvilius@gmail!?com");
        Assert.assertFalse(valid);
    }

    @Test
    public void isValidEmail4NotValidMiddle() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidEmail("kerutisviliusgmail?com");
        Assert.assertFalse(valid);
    }

    @Test
    public void isValidCredentialsNotValid() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidCredentials("ab");
        Assert.assertFalse(valid);
    }

    @Test
    public void isValidCredentialsValid() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidCredentials("abc");
        Assert.assertTrue(valid);
    }

    @Test
    public void isValidCredentialsNotValidSymbol() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidCredentials("ab!");
        Assert.assertFalse(valid);
    }

    @Test
    public void isValidCredentialsValidLength() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidCredentials("qwertyuiopasdfghjklzxcvbn");
        Assert.assertTrue(valid);
    }

    @Test
    public void isValidCredentialsNotValidLength() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidCredentials("qwertyuiopasdfghjklzxcvbnm");
        Assert.assertTrue(valid);
    }

    @Test
    public void isValidCredentialsNotValidSymbolLength() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidCredentials("qwertyuio?asdfghjklzxcvbn");
        Assert.assertFalse(valid);
    }
}