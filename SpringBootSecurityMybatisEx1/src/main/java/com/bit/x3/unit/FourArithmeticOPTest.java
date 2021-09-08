package com.bit.x3.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FourArithmeticOPTest {
    private FourArithmeticOP cal = new FourArithmeticOP();
    private int result;

    @Test
    public void testAdd() {
        result = cal.addition(10, 20);
        assertEquals(30, result, 5);
        /**
         * assertEquals(a, b, c); a: 예상값, b:결과값, c: 오차범위
         */
    }

    @Test
    public void testSubtraction() {
        result = cal.subtraction(10, 20);
        assertEquals(30, result, 5);
    }
}
