package com.example.testlifecycleapplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    public boolean isValidEmail(String email){
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
