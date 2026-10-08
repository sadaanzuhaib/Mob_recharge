package com.mobilerecharge;

import org.junit.Test;
import static org.junit.Assert.*;

public class MobileRechargeTest {

    @Test
    public void testCalculateTotalAmount() {
        MobileRecharge app = new MobileRecharge();
        // Test Case 1: 299 + 10 = 309
        assertEquals(999, app.calculateTotalAmount(299, 10));
    }

    @Test
    public void testGetValidityDays() {
        MobileRecharge app = new MobileRecharge();
        // Test Case 2: Plan 299 gives 28 days
        assertEquals(28, app.getValidityDays(299));
    }

    @Test
    public void testCalculateTotalDataGB() {
        MobileRecharge app = new MobileRecharge();
        // Test Case 3: 2 GB/day for 28 days = 56 GB
        assertEquals(56, app.calculateTotalDataGB(2, 28));
    }

    @Test
    public void testApplyDiscount() {
        MobileRecharge app = new MobileRecharge();
        // Test Case 4: 599 plan minus 50 discount = 549
        assertEquals(549, app.applyDiscount(599, 50));
    }

    @Test
    public void testCalculateRewardPoints() {
        MobileRecharge app = new MobileRecharge();
        // Test Case 5: 500 plan / 10 = 50 reward points
        assertEquals(50, app.calculateRewardPoints(500));
    }
}
