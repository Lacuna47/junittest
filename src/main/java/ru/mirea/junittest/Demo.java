package ru.mirea.junittest;

/**
 * Created by Lacuna on 02.03.2016.
 */
public class Demo {
    public static long Factorial(long fac) {
        long val = 1;
        for (int i = 1; i <= fac; i++) {
            val = val * i;
        }
        return val;
    }

    public static int[] Fib(int count) {
        int[] elem = new int[count];

        elem[0] = 1;
        elem[1] = 1;
        for (int i = 2; i < count; i++) {
            elem[i] = elem[i - 1] + elem[i - 2];
        }
        return elem;
    }

    public static long prois(int[] ints) {
        long val = 1;
        for (int i = 0; i < ints.length; i++)
            val = val * ints[i];
        return val;

    }
}
