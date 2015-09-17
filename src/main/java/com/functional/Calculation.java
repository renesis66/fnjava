package com.functional;

/**
 * @author scottdierbeck
 * @since 9/15/15
 */
@FunctionalInterface
public interface Calculation
{
  Number apply(Number n1, Number n2);
}
