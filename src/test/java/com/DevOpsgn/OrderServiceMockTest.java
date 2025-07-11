// src/test/java/com/devopsgang/OrderServiceMockTest.java
package com.DevOpsgn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceMockTest {
    @Test
    void testWithMockDiscount() {
        DiscountService mockDiscount = mock(DiscountService.class);
        when(mockDiscount.getRate("SALES10")).thenReturn(0.10);

        OrderService svc = new OrderService(mockDiscount);
        double total = svc.getTotal(100, "SALES10", true);

        assertEquals(110.0, total);
    }
}
