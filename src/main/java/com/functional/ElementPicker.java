package com.functional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author scottdierbeck
 * @since 5/12/15
 */
public class ElementPicker
{
  public List<String> getNamesStartingWith(List<String> friends, String n)
  {
    List matchingNames =
        friends.stream()
            .filter(name -> name.startsWith(n))
            .collect(Collectors.toList());
    return matchingNames;
  }
}
