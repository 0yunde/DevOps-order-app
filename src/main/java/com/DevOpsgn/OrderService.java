// src/main/java/com/devopsgang/OrderService.java
package com.DevOpsgn;

public class OrderService {
    private final DiscountService discountService;

    public OrderService(DiscountService discountService) {
        this.discountService = discountService;
    }

    public double getTotal(double subtotal, String code, boolean express) {
        if (subtotal < 0) {
            throw new IllegalArgumentException("Subtotal no puede ser negativo");
        }
        double rate     = discountService.getRate(code);
        double shipping = express ? 20.0 : 10.0;
        return subtotal * (1 - rate) + shipping;
    }
}
