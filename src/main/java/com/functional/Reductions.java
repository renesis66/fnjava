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
        //Optional<String> longestName = friends.stream().max(Comparator.comparingInt(name -> name.length()));
        Optional<String> longestName = friends.stream().reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2);
        return longestName.orElse("");
    }

    public String pickShortestName(List<String> friends) {
        //Optional<String> shortestName = friends.stream().min(Comparator.comparingInt(name -> name.length()));
        Optional<String> shortestName = friends.stream().reduce((name1, name2) -> name1.length() < name2.length() ? name1 : name2);
        return shortestName.orElse("");
    }
}
