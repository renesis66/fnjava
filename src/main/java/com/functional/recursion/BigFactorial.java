package com.functional.recursion;

import java.math.BigInteger;

import static com.functional.recursion.TailCalls.call;
import static com.functional.recursion.TailCalls.done;

/**
 *
 */
public class BigFactorial {
    private static final BigInteger FIVE = new BigInteger("5");

    public static void main(String[] args) {
        System.out.println(factorial(FIVE));
        System.out.println(factorial(new BigInteger("20")));
    }

    private static TailCall<BigInteger> factorialTailRec(final BigInteger factorial,
                                                         final BigInteger number) {
        if (number.equals(BigInteger.ONE)) {
            return done(factorial);
        } else {
            return call(() -> factorialTailRec(multiply(factorial,
                    number), decrement(number)));
        }
    }

    private static BigInteger factorial(final BigInteger number) {

        return factorialTailRec(BigInteger.ONE, number).invoke();
    }

    /**
     * decrement given number by one.
     * @param number to decrement.
     * @return the result of given number minus one.
     */
    public static BigInteger decrement(final BigInteger number) {
        return number.subtract(BigInteger.ONE);
    }

    /**
     * multiply first number and second number
     * @param first number to multiply
     * @param second number to multiply
     * @return the result of multiplying first and second numbers.
     */
    public static BigInteger multiply(final BigInteger first,
                                      final BigInteger second) {
        return first.multiply(second);
    }


}
