package com.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by sdierbec on 5/13/15.
 */
public class Transforming {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final List<String> uppercaseNames = new ArrayList<String>();

        // pre-Java8
        for (String name : friends) {
            uppercaseNames.add(name.toUpperCase());
        }
        System.out.println(uppercaseNames);

        // more functional
        final List<String> fnUppercaseNames = new ArrayList<String>();
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                fnUppercaseNames.add(s.toUpperCase());
            }
        });
        System.out.println(fnUppercaseNames);

        // with lambda
        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // method reference
        friends.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);
        System.out.println();

        // lengths
        friends.stream()
                .map(name -> name.length())
                .forEach(length -> System.out.print(length + " "));
        System.out.println();

        // lambda
        friends.stream()
                .map(String::length)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();
    }
}
