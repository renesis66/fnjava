package com.functional;

import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * @author scottdierbeck
 * @since 5/16/15
 */
public class Joiner
{
  public String createComaSeparatedStringOfElements(List<String> elements) {
    String csv = elements.stream()
            .map(String::toUpperCase)
            .collect(joining(","));
    return csv;
  }
}
