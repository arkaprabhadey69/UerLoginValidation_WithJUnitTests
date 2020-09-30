package com.login;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginTest {
    UserLogin user= new UserLogin();
    @Test
    public void if_name_empty_return_false()  {
        try
        {
            String firstname ="";
            boolean valid = user.FirstNameValidate(firstname);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.ENTERED_EMPTY,e.ex);
        }

    }
    @Test
    public void if_name_null_false_return_false()
    {
        try {
            String firstname = null;
            boolean valid = user.FirstNameValidate(firstname);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.ENTERED_NULL,e.ex);
        }

    }
    @Test
    public void if_count_of_char_less_than_three_return_false()
    {
        try {
            String firstname = "Ar";
            boolean valid = user.FirstNameValidate(firstname);
            Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginException.ExceptionType.INVALID_FIRST_NAME,e.ex);
        }

    }
    @Test
    public void if_no_caps_return_false()
    {
        try {
            String firstname = "arkaprabha";
            boolean valid = user.FirstNameValidate(firstname);
            Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginException.ExceptionType.INVALID_FIRST_NAME,e.ex);
        }

    }
    @Test
    public void pattern_matches_return_true()
    {
        try {
            String firstname = "Arkaprabha";
            boolean valid = user.FirstNameValidate(firstname);
            Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginException.ExceptionType.INVALID_FIRST_NAME,e.ex);
        }

    }
   @Test
   public void if_last_name_empty_return_false()  {
        try
        {
            String firstname ="";
            boolean valid = user.LastNameValidate(firstname);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.ENTERED_EMPTY,e.ex);
        }

    }

    @Test
    public void if_last_name_null_return_false()
    {
        try {
            String firstname = null;
            boolean valid = user.LastNameValidate(firstname);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.ENTERED_NULL,e.ex);
        }

    }
    @Test
     public void if_last_name_no_caps_return_false()
    {
        try {
            String firstname = "dey";
            boolean valid = user.LastNameValidate(firstname);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginException.ExceptionType.INVALID_LAST_NAME,e.ex);
        }

    }

    @Test
    public void if_last_name_less_than_three_return_false()
    {
        try {
            String firstname = "de";
            boolean valid = user.LastNameValidate(firstname);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginException.ExceptionType.INVALID_LAST_NAME,e.ex);
        }

    }
    @Test
     public void if_last_name_matches_pattern_return_true()
    {
        try {
            String firstname = "Dey";
            boolean valid = user.LastNameValidate(firstname);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginException.ExceptionType.INVALID_LAST_NAME,e.ex);
        }

    }

    @Test
    public void if_number_null_given_return_false()
    {
        try {
            String number = null;
            boolean valid = user.MobileValidate(number);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.ENTERED_NULL,e.ex);
        }

    }
    @Test
    public void if_number_empty_given_return_false()
    {
        try {
            String number = "";
            boolean valid = user.MobileValidate(number);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.ENTERED_EMPTY,e.ex);
        }

    }
    @Test
   public void if_number_without_country_code_given_return_false()
    {
        try {
            String number = "8961377968";
            boolean valid = user.MobileValidate(number);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }
    @Test
   public void if_number_greater_than_ten_given_return_false()
    {
        try {
            String number = "91 89613779805";
            boolean valid = user.MobileValidate(number);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }
    @Test
    public void if_country_code_greater_than_three_null_given_return_false()
    {
        try {
            String number = "911 8961377980";
            boolean valid = user.MobileValidate(number);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }
    @Test
    public void if_number_matches_return_true()
    {
        try {
            String number = "91 8961377980";
            boolean valid = user.MobileValidate(number);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }

    @Test
    public void if_password_empty_return_false()
    {
        try {
            String passwd = "";
            boolean valid = user.isPasswordValid(passwd);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.ENTERED_EMPTY,e.ex);
        }


    }

    @Test
    public void if_password_null_return_false()
    {
       try {
            String passwd = null;
            boolean valid = user.isPasswordValid(passwd);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.ENTERED_NULL,e.ex);
        }

    }

    @Test
    public void if_password_has_no_cap_return_false()
    {
       try {
            String passwd = "india123@";
            boolean valid = user.isPasswordValid(passwd);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.INVALID_PASS,e.ex);
        }
    }

    @Test
    public void if_password_does_not_have_at_least_one_number_return_false()
    {
       try {
            String passwd = "India@werty";
            boolean valid = user.isPasswordValid(passwd);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.INVALID_PASS,e.ex);
        }

    }

    @Test
    public void if_password_has_more_than_one_special_symbol_return_false()
    {
       try {
            String passwd = "India123@@";
            boolean valid = user.isPasswordValid(passwd);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.INVALID_PASS,e.ex);
        }


    }

    @Test
    public void if_password_does_have_at_least_eight_chars_return_false()
    {
        try {
            String passwd = "In123@";
            boolean valid = user.isPasswordValid(passwd);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.INVALID_PASS,e.ex);
        }

    }

    @Test
    public void if_password_satisfies_all_conditions_return_true()
    {
       try {
            String passwd = "India123@";
            boolean valid = user.isPasswordValid(passwd);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.INVALID_PASS,e.ex);
        }

    }

    @Test
    public void if_email_is_null_return_false()
    {
     try {
            String email= null;
            boolean valid = user.EmailValidate(email);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
           System.out.println(e.ex+" "+e.getMessage());
           Assert.assertEquals(UserLoginException.ExceptionType.ENTERED_NULL,e.ex);
        }


    }
    @Test
    public void if_email_is_empty_return_false()
    {
        try {
            String email= "";
            boolean valid = user.EmailValidate(email);
            //Assert.assertEquals(true, valid);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginException.ExceptionType.ENTERED_EMPTY,e.ex);
        }


    }

}