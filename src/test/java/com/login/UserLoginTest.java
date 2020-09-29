package com.login;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginTest {
    UserLogin user= new UserLogin();
    @Test
    public void if_name_matches_pattern_return_true()
    {
        String firstname="Arkaprabha";
        boolean valid= user.FirstNameValidate(firstname);
        Assert.assertEquals(true,valid);

    }
    @Test
    public void if_first_letter_small_return_false()
    {
        String firstname="arkaprabha";
        boolean valid= user.FirstNameValidate(firstname);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_count_of_char_less_than_three_return_false()
    {
        String firstname="Ar";
        boolean valid= user.FirstNameValidate(firstname);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_last_name_matches_pattern_return_true()
    {
        String lastname="Dey";
        boolean valid= user.LastNameValidate(lastname);
        Assert.assertEquals(true,valid);

    }
    @Test
    public void if_first_letter_of_last_name_small_return_false()
    {
        String lastname="dey";
        boolean valid= user.LastNameValidate(lastname);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_count_of_char_of_last_name_less_than_three_return_false()
    {
        String lastname="De";
        boolean valid= user.LastNameValidate(lastname);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_mobile_pattern_matches_return_true()
    {
        String mobile="91 8961377964";
        boolean valid= user.MobileValidate(mobile);
        Assert.assertEquals(true,valid);

    }
    @Test
    public void if_no_country_code_given_return_false()
    {
        String mobile="8961377964";
        boolean valid= user.MobileValidate(mobile);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_no_space_after_country_code_given_return_false()
    {
        String mobile="918961377964";
        boolean valid= user.MobileValidate(mobile);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_more_than_two_letters_country_code_given_return_false()
    {
        String mobile="917 8961377964";
        boolean valid= user.MobileValidate(mobile);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_more_than_ten_digit_number_given_return_false()
    {
        String mobile="91 78961377964";
        boolean valid= user.MobileValidate(mobile);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_more_than_one_space_after_country_code_given_return_false()
    {
        String mobile="91  8961377964";
        boolean valid= user.MobileValidate(mobile);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_password_less_than_eight_chars_return_false()
    {
        String password="Ind1@";
        boolean valid= user.isPasswordValid(password);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_password_greater_than_equal_to_eight_chars_return_true()
    {
        String password="India123@";
        boolean valid= user.isPasswordValid(password);
        Assert.assertEquals(true,valid);

    }
    @Test
    public void if_password_has_at_least_one_cap_return_true()
    {
        String password="India12356@";
        boolean valid= user.isPasswordValid(password);
        Assert.assertEquals(true,valid);

    }
    @Test
    public void if_password_does_not_have_at_least_one_cap_return_false()
    {
        String password="india12356@";
        boolean valid= user.isPasswordValid(password);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_password_does_not_have_at_least_number_return_false()
    {
        String password="Indialmao@";
        boolean valid= user.isPasswordValid(password);
        Assert.assertEquals(false,valid);

    }
    @Test
    public void if_password_does_have_at_least_number_return_true()
    {
        String password="Arkapra1@";
        boolean valid= user.isPasswordValid(password);
        Assert.assertEquals(true,valid);

    }

}