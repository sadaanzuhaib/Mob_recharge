package com.mobilerecharge;

public class MobileRecharge {

    // Method 1: Calculate total recharge amount (Plan + Tax/Fee)
    public int calculateTotalAmount(int planAmount, int tax) {
        return planAmount + tax;
    }

    // Method 2: Return validity days for a given plan
    public int getValidityDays(int planAmount) {
        if (planAmount == 299) {
            return 28;
        } else if (planAmount == 599) {
            return 84;
        } else if (planAmount == 2999) {
            return 365;
        }
        return 0;
    }

    // Method 3: Calculate total data in GB (Daily GB * Validity Days)
    public int calculateTotalDataGB(int dailyDataGB, int days) {
        return dailyDataGB * days;
    }

    // Method 4: Apply promotional discount coupon to plan amount
    public int applyDiscount(int planAmount, int discount) {
        return planAmount - discount;
    }

    // Method 5: Calculate cashback reward points (10% of plan amount)
    public int calculateRewardPoints(int planAmount) {
        return planAmount / 10;
    }
}
