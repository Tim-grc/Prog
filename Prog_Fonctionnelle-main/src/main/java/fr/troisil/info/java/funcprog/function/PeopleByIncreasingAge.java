package fr.troisil.info.java.funcprog.function;

import fr.troisil.info.java.funcprog.People;

import java.util.List;
import java.util.stream.Collectors;

public class PeopleByIncreasingAge {

    public static List<People> peopleByIncreasingAge(List<People> people){

        List<People> sortedPeople = people.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .collect(Collectors.toList());

        return sortedPeople;
    };
}
