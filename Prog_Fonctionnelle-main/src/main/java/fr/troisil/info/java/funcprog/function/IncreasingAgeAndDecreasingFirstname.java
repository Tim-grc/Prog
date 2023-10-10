package fr.troisil.info.java.funcprog.function;

import fr.troisil.info.java.funcprog.People;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IncreasingAgeAndDecreasingFirstname {

    public static List<People> IncreasingAgeAndDecreasingFirstname(List<People> people){

        List<People> sortedPeople = people.stream()
                .sorted(
                        Comparator.comparingInt(People::getAge).reversed()
                                .thenComparing(Comparator.comparing(People::getFirstname))
                )
                .collect(Collectors.toList());

        return sortedPeople;
    };
}
