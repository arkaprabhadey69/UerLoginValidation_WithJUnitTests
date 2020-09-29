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


}