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
}