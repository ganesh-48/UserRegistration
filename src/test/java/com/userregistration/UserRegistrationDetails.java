package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationDetails {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        boolean result = userRegistration.registerFirstName("Ram");
        Assert.assertEquals(result, true);
    }

    @Test
    public void giveLastName_whenProper_shouldReturnTrue() {
        boolean result = userRegistration.registerLastName("Sharma");
        Assert.assertEquals(result,true);
    }

    @Test
    public void giveEmail_whenProper_shouldResturnTrue() {
        boolean result = userRegistration.registraterEmail("xyz@gmail.com");
        Assert.assertEquals(result,true);
    }

    @Test
    public void giveMobileNumber_whenProper_shouldReturnTrue() {
        boolean result = userRegistration.registraterMobileNumber("+91 1234567899");
        Assert.assertEquals(result,true);
    }
}
