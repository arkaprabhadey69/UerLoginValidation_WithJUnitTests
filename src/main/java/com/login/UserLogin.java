package com.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogin {

    public void ShowWelcomeMessage()
    {
        System.out.println("Welcome to User Login Validation and JUnit Testing");
    }
    public static boolean FirstNameValidate(String name)
    {
        String y="^[A-Z]{1}(?=.*[a-z]).{2,}$";

        Pattern pattern = Pattern.compile(y);


        Matcher matcher =  pattern.matcher(name);

        boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid first Name");
            found = true;
        }
        if(!found)
        {
            System.out.println("Invalid last name");

        }
        return found;

    }
}
