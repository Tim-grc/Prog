package fr.troisil.info.java.funcprog.function;

import fr.troisil.info.java.funcprog.People;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjectToPeople {

    public static List<People> ObjectToPerson(List<String> lines){

        List<People> peopleStream = lines.stream()
                .map(person -> person.split(";"))
                .map(personalCharacteristics -> new People(personalCharacteristics[0], personalCharacteristics[1], Integer.parseInt(personalCharacteristics[2])))
                .collect(Collectors.toList());

        return peopleStream;
    };
}
