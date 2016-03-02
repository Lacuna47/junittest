package ru.mirea.junittest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lacuna on 02.03.2016.
 */
public class DemoTest {

    @Test
    public void testFib() throws Exception {
        int count = 3;
        int[] fib = Demo.Fib(count);
        assertEquals(count, fib.length);
        assertArrayEquals(new int[]{1, 1, 2}, fib);

        long fac = Demo.Factorial(4);
        assertEquals(24, fac);
    }
}