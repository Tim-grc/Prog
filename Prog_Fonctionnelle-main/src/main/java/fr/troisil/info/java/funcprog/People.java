package fr.troisil.info.java.funcprog;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class People {

    private String name;
    private String firstname;
    private int age;

    public int getAge() {
        return age;
    }
}
