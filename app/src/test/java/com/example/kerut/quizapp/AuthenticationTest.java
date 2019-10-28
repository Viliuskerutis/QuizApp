package com.example.kerut.quizapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AuthenticationTest {

    @RunWith(Parameterized.class)
    public static class ParameterizedTestValidEmails {

        @Parameterized.Parameter(value = 0)
        public String email;

        @Parameterized.Parameters
        public static Collection<String> initParameters() {
            return Arrays.asList("kerutisvilius@gmail.com" , "linas.adolfus@yahoo.com", "nikas.nikolengen@info.ru");
        }

        @Test
        public void sample_parseValue() {
            Authentication authentication = new Authentication();
            assertTrue(authentication.isValidEmail(email));
        }
    }

    @RunWith(Parameterized.class)
    public static class ParameterizedTestWrongEmails {

        @Parameterized.Parameter(value = 0)
        public String email;

        @Parameterized.Parameters
        public static Collection<String> initParameters() {
            return Arrays.asList("kerutisviliusgmail.com" , "linas.adolfus@yahoo!?com", "nikas?nikolengen@info.ru");
        }

        @Test
        public void sample_parseValue() {
            Authentication authentication = new Authentication();
            assertFalse(authentication.isValidEmail(email));
        }
    }

    @Test
    public void isValidEmailValid() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidEmail("kerutisvilius@gmail.com");
        assertTrue(valid);
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
        assertTrue(valid);
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
        assertTrue(valid);
    }

    @Test
    public void isValidCredentialsNotValidLength() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidCredentials("qwertyuiopasdfghjklzxcvbnm");
        assertTrue(valid);
    }

    @Test
    public void isValidCredentialsNotValidSymbolLength() {
        Authentication authentication = new Authentication();
        boolean valid = authentication.isValidCredentials("qwertyuio?asdfghjklzxcvbn");
        Assert.assertFalse(valid);
    }
}