package com.login;

public class UserLoginException extends Exception{
    enum ExceptionType
    {
        ENTERED_NULL,ENTERED_EMPTY,INVALID_FIRST_NAME,INVALID_LAST_NAME,INVALID_NUMBER,INVALID_PASS,INVALID_EMAIL;
    }
    ExceptionType ex;

    public UserLoginException(ExceptionType ex,String message) {
        super(message);
        this.ex = ex;
    }
}
