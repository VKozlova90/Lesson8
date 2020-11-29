package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Ann", "Rout", new Address ("London", "Avenu", 8));
        Person person2 = new Person("Stef", "Smit", new Address("Boston", "Avenu", 1));
        Person person3 = new Person("Tom", "Hardy", new Address("NYork", "Avenu", 5));
        Person person4 = new Person(null, "Girov", new Address("London", "Avenu", 3));
        Person person5 = new Person("Ann", null, new Address("Minsk", "Avenu", 13));
        Person person6 = new Person("Olga", "Stepanova", null);

        ArrayList<Person> list = new ArrayList<>();
        list.add (person1);
        list.add (person2);
        list.add (person3);
        list.add (person4);
        list.add (person5);
        list.add (person6);

        for (Person person : list)
            System.out.println(person);

        System.out.println();

        List<String> res = list
                .stream()
                .filter (Person -> Person.getName()!=null && Person.getLastName()!=null && Person.getAddress()!=null)
                .sorted((n1, n2) -> n1.getAddress().getNumber() - n2.getAddress().getNumber())
                .map(str -> str.toString())
                .collect(Collectors.toList());

        System.out.println(res);


    }
}