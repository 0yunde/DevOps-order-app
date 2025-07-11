package com.DevOpsgn;

public class DiscountRepository {
    public double getPercentage(String code) {
        if (code.equals("PROMO10")) return 0.10;
        return 0.0;
    }
}
