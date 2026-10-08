package com.mobilerecharge;

import org.junit.Test;
import static org.junit.Assert.*;

public class MobileRechargeTest {

    @Test
    public void testValidMobileNumber() {
        MobileRecharge service = new MobileRecharge();
        assertTrue(service.isValidMobileNumber("9876543210"));
        assertFalse(service.isValidMobileNumber("12345"));
    }

    @Test
    public void testCalculateTotalPayable() {
        MobileRecharge service = new MobileRecharge();
        assertEquals(509, service.calculateTotalPayable(499, 10));
    }

    @Test
    public void testGetPlanValidityDays() {
        MobileRecharge service = new MobileRecharge();
        assertEquals(28, service.getPlanValidityDays(199));
        assertEquals(56, service.getPlanValidityDays(499));
        assertEquals(84, service.getPlanValidityDays(799));
    }

    @Test
    public void testProcessRechargeSuccess() {
        MobileRecharge service = new MobileRecharge();
        String result = service.processRecharge("9876543210", 499);
        assertEquals("SUCCESS: Recharged Rs.499 for 9876543210", result);
    }
}
