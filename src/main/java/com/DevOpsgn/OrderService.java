package com.DevOpsgn;

public class OrderService {
    private final DiscountService discountService;

    public OrderService(DiscountService discountService) {
        this.discountService = discountService;
    }

    /**
     * Calcula el total de un pedido:
     *  – Lanza IllegalArgumentException si subtotal < 0
     *  – Aplica el descuento obtenido de discountService.getRate(code)
     *  – Añade 20.0 si hasExpressShipment, o 10.0 si no
     */
    public double getTotal(double subtotal, String discountCode, boolean hasExpressShipment) {
        if (subtotal < 0) {
            throw new IllegalArgumentException("Subtotal no puede ser negativo");
        }

        double discount = discountService.getRate(discountCode);
        double shipment = hasExpressShipment ? 20.0 : 10.0;
        return subtotal * (1 - discount) + shipment;
    }
}
