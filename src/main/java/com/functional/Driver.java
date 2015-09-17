package com.functional;

/**
 *
 */
public class Driver {
    public static void main(String[] args) {
        int n1 = 32;
        int n2 = 2;

        Computation sum = (x, y) -> x + y;
        Computation difference = (x, y) -> x - y;
        Computation product = (x, y) -> x * y;
        Computation quotient = (x, y) -> x / y;


        System.out.println("The sum of " + n1 + " and " + n2 + " is : " + sum.compute(n1, n2));
        System.out.println("The difference between " + n1 + " and " + n2 + " is : " + difference.compute(n1, n2));
        System.out.println("The product of " + n1 + " and " + n2 + " is : " + product.compute(n1, n2));
        System.out.println("The quotient of " + n1 + " and " + n2 + " is : " + quotient.compute(n1, n2));
    }

}
