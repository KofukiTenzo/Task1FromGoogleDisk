package com.tenzo.projJava.crushcourse.kharchenko;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        Collections.addAll(persons, new Person(), new Person(), new Person(), new Person(), new Person());
        for (int i = 0; i < persons.size(); i++) {
            persons.get(i).input();
            persons.get(i).output();
            persons.get(i).changeName();
            System.out.println("\n");
        }
    }
}
