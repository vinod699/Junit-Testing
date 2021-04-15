package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {

    UserValidator validator = new UserValidator();

    @Test
    public void isFirstNameValid()
    {
        boolean result=validator.validateFirstName("vinod");
        Assertions.assertEquals(true,result);

    }
    @Test
    public void isLastNameValid()
    {
        boolean result=validator.validateLastName("sai");
        Assertions.assertEquals(true,result);

    }
    @Test
    public void isEmailValid()
    {
        boolean result=validator.validateEmail("kosarajuvinod9999@gmail.com");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void isMobileValid()
    {
        boolean result=validator.validateMobile("91 6367163434");
        Assertions.assertEquals(true,result);
    }
}
