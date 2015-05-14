package com.functional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Created by sdierbec on 5/14/15.
 */
public class Reductions {
    public String pickLongestName(List<String> friends) {
        Optional<String> longestName = friends.stream().max(Comparator.comparingInt(name -> name.length()));

        return longestName.orElse("");
    }

    public String pickShortestName(List<String> friends) {
        Optional<String> shortestName = friends.stream().min(Comparator.comparingInt(name -> name.length()));
        return shortestName.orElse("");
    }
}
