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
        boolean result = userRegistration.registerLastName();
        Assert.assertEquals(result,true);
    }
}
