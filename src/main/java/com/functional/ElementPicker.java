package com.functional;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author scottdierbeck
 * @since 5/12/15
 */
public class ElementPicker
{
  // A Function that takes a string (letter) and returns a Predicate that takes a String
  // and checks if it starts with (letter)
  final Function<String, Predicate<String>> startsWithLetter =
          (String letter) -> {
            Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
            return checkStarts;
          };
          //(String letter) -> (String name) -> name.startsWith(letter);

  private static Predicate<String> checkIfStartsWith(final String letter) {
    return name -> name.startsWith(letter);
  }

  public List<String> getNamesStartingWith(List<String> friends, String letter)
  {
    List matchingNames =
        friends.stream()
            .filter(checkIfStartsWith(letter))
            .collect(Collectors.toList());
    return matchingNames;
  }

  public Optional<String> pickName(final List<String> names, final String startingLetter)
  {
    final Optional<String> foundName =
            names.stream()
            .filter(name -> name.startsWith(startingLetter))
            .findFirst();

    return foundName;
  }
}
