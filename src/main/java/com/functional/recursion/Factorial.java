package com.functional.recursion;


import static com.functional.recursion.TailCalls.call;
import static com.functional.recursion.TailCalls.done;

/**
 *
 */
public class Factorial {

    public static void main(String[] args) {
        try {
            System.out.println(eagerFactorialRec(5));
        } catch (Exception e) {
            System.out.println("Exception thrown.");
        }

        System.out.println(factorialTailRec(5));
    }

    /**
     * Non-tail recursion example.  This will blow the stack
     * with larger inputs.
     * @param number
     * @return
     */
    public static long eagerFactorialRec(long number) {
        if (number == 1) {
            return number;
        } else {
            return number * eagerFactorialRec(number - 1);
        }
    }

    public static int factorialTailRec(final int number) {
        return factorialTailRec(1, number).invoke();
    }
    /**
     * Tail recursion example.
     * @param factorial
     * @return
     */
    public static TailCall<Integer> factorialTailRec(final int factorial, final int number) {
        if (number == 1) {
            return done(factorial);
        } else {
            return call(() -> factorialTailRec(factorial * number, number - 1));
        }
    }
}
