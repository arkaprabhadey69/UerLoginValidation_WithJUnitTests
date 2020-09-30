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
            System.out.println("Invalid first name");

        }
        return found;

    }
    public static boolean LastNameValidate(String name)
    {
        String y="^[A-Z]{1}(?=.*[a-z]).{2,}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(name);
        boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid last Name");
            found = true;
        }
        if(!found)
        {
            System.out.println("Invalid last name");

        }
        return found;

    }
    public static boolean MobileValidate(String name)
    {
        String number="^\\d{2}(\\s{1}\\d{10})$";
        Pattern pattern = Pattern.compile(number);
        Matcher matcher =  pattern.matcher(name);
        boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid Number");
            found = true;
        }
        if(!found)
        {
            System.out.println("Invalid Number");
        }
        return found;

    }
    public static boolean isPasswordValid(String password)
    {

        String regex2 = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^\\dA-Z]).{8,}$";
        String regex1="^(?=.*?[0-9a-zA-Z])[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*$";
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        if (password == null)
        {
            return false;
        }


        Matcher matcher1 = pattern1.matcher(password);
        Matcher matcher2 = pattern2.matcher(password);
        return matcher1.matches()&&matcher2.matches();
    }
    public static boolean EmailValidate(String email)
    {
        String number="^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[(com)|(co)|(net)]+(?:\\.[a-z]{2,}){0,1}$";

        Pattern pattern = Pattern.compile(number);

        Matcher matcher =  pattern.matcher(email);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("Valid email");
            found = true;
        }
        if(!found){
            System.out.println("Invalid email");
        }
        return found;

    }
}
