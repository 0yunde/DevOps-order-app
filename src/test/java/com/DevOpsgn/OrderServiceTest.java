package com.DevOpsgn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    OrderService service = new OrderService();
    
    @Test
    void testWithoutDiscountAndNormalShipment() {
        double total = service.getTotal(100, false, false);
        assertEquals(110.0, total);
    }

    @Test
    void testWithDiscountAnExpressShipment() {
        double total = service.getTotal(100, true, true);
        assertEquals(110.0, total); // 100 - 10% + 20
    }
 
    @Test
    void testWithDiscountAndNormalShipment() {
        double total = service.getTotal(200, true, false);
        assertEquals(190.0, total);
    }
    @Test
    void testWithoutDiscountAndExpressShipment() {
    double total = service.getTotal(150, false, true);
    assertEquals(170.0, total);
    }

    @Test
    public void testNegativeSubtotal() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> service.getTotal(-100.0, true, false)
    );
    assertEquals("Subtotal no puede ser negativo", exception.getMessage());
    }

}


