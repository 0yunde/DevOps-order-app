// src/main/java/com/DevOpsgn/DiscountService.java
package com.DevOpsgn;

/** Contrato para obtener la tasa de descuento de un código. */
public interface DiscountService {
    /** Devuelve la tasa de descuento [0.0–1.0] asociada al código. */
    double getRate(String code);
}
