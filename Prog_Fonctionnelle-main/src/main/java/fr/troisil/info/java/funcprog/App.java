package fr.troisil.info.java.funcprog;
import fr.troisil.info.java.funcprog.function.IncreasingAgeAndDecreasingFirstname;
import fr.troisil.info.java.funcprog.function.ObjectToPeople;

import fr.troisil.info.java.funcprog.function.PeopleByIncreasingAge;
import fr.troisil.info.java.funcprog.function.PeopleByIncreasingAgeWithComparator;
import lombok.extern.slf4j.Slf4j;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
@Slf4j
public class App {

    private final static String FILE_NAME = "src/main/resources/personnes.csv";

    public static void main( String[] args ) throws IOException {

        String fileName = FILE_NAME;
        File file = CsvReaderUtil.getResource(fileName);
        List<String> lines = CsvReaderUtil.readFile(file);

        System.out.println( "Hello World!" );

        List<People> peopleStream = ObjectToPeople.ObjectToPerson(lines);
        List<People> sortedPeople = PeopleByIncreasingAge.peopleByIncreasingAge(peopleStream);
        List<People> sortedPeopleWithComparator = PeopleByIncreasingAgeWithComparator.peopleByIncreasingAge(peopleStream);
        List<People> sortedPeopleByIncreasingAgeAndDecreasingFirstname = IncreasingAgeAndDecreasingFirstname.IncreasingAgeAndDecreasingFirstname(peopleStream);

        System.out.println( "Génération normal" );
        peopleStream.forEach(person -> System.out.println(
                "Nom : " + person.getName() + ", Prénom : " + person.getFirstname() + ", Age : " + person.getAge()
        ));

        System.out.println( " " );

        System.out.println( "Trie par age croissant" );
        sortedPeople.forEach(person -> System.out.println(
                "Nom : " + person.getName() + ", Prénom : " + person.getFirstname() + ", Age : " + person.getAge()
        ));

        System.out.println( " " );

        System.out.println( "Trie par age décroissant et prénom croissant" );
        sortedPeopleByIncreasingAgeAndDecreasingFirstname.forEach(person -> System.out.println(
                "Nom : " + person.getName() + ", Prénom : " + person.getFirstname() + ", Age : " + person.getAge()
        ));

        System.out.println( " " );

        System.out.println( "Trie par age croissant avec comparator" );
        sortedPeopleWithComparator.forEach(person -> System.out.println(
                "Nom : " + person.getName() + ", Prénom : " + person.getFirstname() + ", Age : " + person.getAge()
        ));
    }
}
