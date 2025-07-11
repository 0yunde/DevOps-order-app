package com.DevOpsgn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceMockTest {
    DiscountService mockDiscount = mock(DiscountService.class);
    OrderService service = new OrderService(mockDiscount);

    @Test
    void testWithMockDiscount() {
        when(mockDiscount.getRate("SALES10")).thenReturn(0.10);
        double total = service.getTotal(100, "SALES10", false);
        assertEquals(100.0, total);
    }

    // … demás tests …
}
