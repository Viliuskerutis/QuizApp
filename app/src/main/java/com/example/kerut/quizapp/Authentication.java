package com.example.kerut.quizapp;

import java.util.regex.Matcher;

/**
 * Created by Vilius Kerutis on 30/09/2018.
 */

class Authentication {
    Authentication() {
    }

    boolean isValidEmail(String email) {
        final java.util.regex.Pattern VALID_EMAIL_ADDRESS_REGEX =
                java.util.regex.Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$");
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }

    boolean isValidCredentials(String credentials) {
        final String CREDENTIALS_PATTERN = "^([0-9a-zA-Z]{3,25})+$";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(CREDENTIALS_PATTERN);

        Matcher matcher = pattern.matcher(credentials);
        return matcher.matches();
    }
}


