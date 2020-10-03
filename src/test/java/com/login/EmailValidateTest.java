package com.login;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class EmailValidateTest {

    public String email;

    public EmailValidateTest(String email) {
        this.email = email;
    }

    @Parameters
    public static Collection input() {

        return Arrays.asList(new Object[]{"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
                "abc-100@abc.net","abc111@abc.com","abc.100@abc.com.au",
                "abc@1.com","abc@gmail.com.com","abc+100@gmail.com",
                "abc","abc@.com.my","abc123@gmail.a",
                "abc()*@gmail.com","abc@%*.com",".abc@abc.com",
                "abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a",
                "abc123@.com","abc123@.com.com","abc-100@yahoo.com","abc@gmail.com.aa.au"});
    }
    @Test
    public void given_correct_Email_must_return_true()  {
        UserLogin u= new UserLogin();
        try {
            boolean result = u.email.check(this.email);
            Assert.assertTrue(result);
        }
        catch (UserLoginException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginException.ExceptionType.INVALID_EMAIL,e.ex);
        }
    }
}