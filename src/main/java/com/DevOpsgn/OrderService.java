package com.DevOpsgn;

public class OrderService {

    public double getTotal(double subtotal, boolean hasDiscount, boolean shipmentExpress) {
        // 1) Validar argumento y lanzar con el mensaje que el test espera
        if (subtotal < 0) {
            throw new IllegalArgumentException("Subtotal no puede ser negativo");
        }

        // 2) Calcular descuento
        double discount = hasDiscount ? 0.1 : 0.0;

        // 3) Calcular envío
        double shipement = shipmentExpress ? 20.0 : 10.0;

        // 4) Total final
        return Math.round((subtotal * (1 - discount) + shipement) * 100.0) / 100.0;
    }
}

