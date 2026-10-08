package com.mobilerecharge;

public class MobileRecharge {

    // Method 1: Validate a 10-digit mobile number
    public boolean isValidMobileNumber(String mobileNumber) {
        return mobileNumber != null && mobileNumber.matches("\\d{10}");
    }

    // Method 2: Calculate final recharge balance after adding processing fee
    public int calculateTotalPayable(int planAmount, int processingFee) {
        if (planAmount <= 0) {
            return 0;
        }
        return planAmount + processingFee;
    }

    // Method 3: Get validity days based on recharge plan amount
    public int getPlanValidityDays(int planAmount) {
        if (planAmount == 199) {
            return 28;
        } else if (planAmount == 499) {
            return 56;
        } else if (planAmount == 799) {
            return 84;
        }
        return 0;
    }

    // Method 4: Process recharge and return confirmation status
    public String processRecharge(String mobileNumber, int planAmount) {
        if (!isValidMobileNumber(mobileNumber)) {
            return "FAILED: Invalid Mobile Number";
        }
        if (getPlanValidityDays(planAmount) == 0) {
            return "FAILED: Invalid Plan Amount";
        }
        return "SUCCESS: Recharged Rs." + planAmount + " for " + mobileNumber;
    }

    public static void main(String[] args) {
        MobileRecharge service = new MobileRecharge();
        System.out.println(service.processRecharge("9876543210", 499));
        System.out.println("Validity: " + service.getPlanValidityDays(499) + " days");
        System.out.println("Total Payable: Rs." + service.calculateTotalPayable(499, 10));
    }
}
