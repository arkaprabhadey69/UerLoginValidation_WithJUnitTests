package com.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogin {

    public void ShowWelcomeMessage()
    {
        System.out.println("Welcome to User Login Validation and JUnit Testing");
    }

    public static void checkNullEmpty(String name) throws UserLoginException {

        try {
            if (name.length() == 0) {
                throw new UserLoginException(UserLoginException.ExceptionType.ENTERED_EMPTY, "Empty!!Enter Something!!");
            }
        }
            catch(NullPointerException e)
        {
            throw new UserLoginException(UserLoginException.ExceptionType.ENTERED_NULL, "Null!!Enter Something!!");

        }
        }


    public static boolean FirstNameValidate(String name) throws UserLoginException
    {
        checkNullEmpty(name);
            String y = "^[A-Z]{1}(?=.*[a-z]).{2,}$";

            Pattern pattern = Pattern.compile(y);
            Matcher matcher = pattern.matcher(name);
            boolean found = false;
            while (matcher.find()) {
                System.out.println("Valid first Name");
                found = true;
            }
            if (!found) {
                throw new UserLoginException(UserLoginException.ExceptionType.INVALID_FIRST_NAME,"Invalid First Name");

            }
            return found;
        }


       // return false;

    public static boolean LastNameValidate(String name) throws UserLoginException {
        checkNullEmpty(name);
        String y = "^[A-Z]{1}(?=.*[a-z]).{2,}$";

        Pattern pattern = Pattern.compile(y);
        Matcher matcher = pattern.matcher(name);
        boolean found = false;
        while (matcher.find()) {
            System.out.println("Valid last Name");
            found = true;
        }
        if (!found) {
            throw new UserLoginException(UserLoginException.ExceptionType.INVALID_LAST_NAME,"Invalid Last Name");

        }
        return found;

    }
    public static boolean MobileValidate(String name) throws UserLoginException {
        checkNullEmpty(name);
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
            throw new UserLoginException(UserLoginException.ExceptionType.INVALID_NUMBER,"Invalid number");
        }
        return found;

    }
    public static boolean isPasswordValid(String password) throws UserLoginException {
        checkNullEmpty(password);

        String regex2 = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^\\dA-Z]).{8,}$";
        String regex1="^(?=.*?[0-9a-zA-Z])[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*$";
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher1 = pattern1.matcher(password);
        Matcher matcher2 = pattern2.matcher(password);
        boolean valid=matcher1.matches()&&matcher2.matches();
        if(!valid)
        {
            throw new UserLoginException(UserLoginException.ExceptionType.INVALID_PASS,"Invalid passwd");
        }
        return valid;
    }
    public static boolean EmailValidate(String email) throws UserLoginException {
        checkNullEmpty(email);
        String number="^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[(com)|(co)|(net)]+(?:\\.[a-z]{2,}){0,1}$";

        Pattern pattern = Pattern.compile(number);

        Matcher matcher =  pattern.matcher(email);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("Valid email");
            found = true;
        }
        if(!found){
            throw new UserLoginException(UserLoginException.ExceptionType.INVALID_EMAIL,"Invalid email");
        }
        return found;

    }
}
