package fr.troisil.info.java.funcprog.function;

import fr.troisil.info.java.funcprog.People;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleByIncreasingAgeWithComparator {

    public static List<People> peopleByIncreasingAge(List<People> people){

        List<People> sortedPeople = people.stream()
                .sorted(Comparator.comparingInt(People::getAge))
                .collect(Collectors.toList());

        return sortedPeople;
    };
}
