package com.example.kerut.quizapp;

/**
 * Created by kerut on 27/10/2017.
 */

import java.util.regex.Matcher;

/**
 * Created by kerut on 21/10/2017.
 */

public class Authentication {
    Authentication() {
    }

    public boolean isValidEmail(String email) {
        final java.util.regex.Pattern VALID_EMAIL_ADDRESS_REGEX =
                java.util.regex.Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$");
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }

    public boolean isValidCredentials(String credentials) {
        final String CREDENTIALS_PATTERN = "^([0-9a-zA-Z]{3,25})+$";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(CREDENTIALS_PATTERN);

        Matcher matcher = pattern.matcher(credentials);
        return matcher.matches();
    }
}
