// src/main/java/com/devopsgang/DiscountService.java
package com.DevOpsgn;

public class DiscountService {
    public double getRate(String code) {
        if ("SALES10".equals(code)) return 0.10;
        return 0.0;
    }
}
