package com.tenzo.projJava.crushcourse.kharchenko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Person {
    private String name;
    private LocalDate birthDate;

    private DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Person() {
    }

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return formater.format(birthDate);
    }

    private void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int age() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public Person input() {
        try {
            System.out.print("Enter person name: ");
            setName(reader.readLine());
            System.out.print("Enter person date of birthday like dd.mm.yyyy: ");
            setBirthDate(LocalDate.parse(reader.readLine(), formater));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Person(name, birthDate);
    }

    public void output() {
        System.out.printf("Person %s, was born at %s at now he`s %d years old.", getName(), getBirthDate(), age());
    }

    public void changeName() {
        try {
            boolean chek = true;
            System.out.print("\nDo you want to cheng name? [Y/n]: ");
            while(chek){
                String answer = reader.readLine();
                if (answer.toLowerCase().equals("y")) {
                    System.out.print("Enter new name: ");
                    setName(reader.readLine());
                    output();
                    return;
                } else if (answer.toLowerCase().equals("n")){
                    return;
                }
                else {
                    System.out.print("Try again [Y/n]: ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
