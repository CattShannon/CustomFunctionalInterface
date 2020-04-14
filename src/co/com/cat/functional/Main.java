package co.com.cat.functional;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FunctionalFinder<ArrayList<Person>, String, String, Person> findSomeOne;

        findSomeOne = (listPerson, name, lastName) -> {
            return listPerson.stream()
                    .filter((person) -> person.getName().equals(name))
                    .filter((person) -> person.getLastName().equals(lastName))
                    .findFirst().orElse(null);

        };

        ArrayList<Person> persons = generatePersons();

        var personFind = findSomeOne.find(persons, "Mariana", "Vidad");

        System.out.println(exist(personFind));


    }

    private static String exist(Person person) {
        return (person != null) ? ("La persona existe con nombre ")
                .concat(person.getName()).concat(" y apellido ")
                .concat(person.getLastName())
                : "La persona que trata de buscar no existe";

    }

    private static ArrayList<Person> generatePersons() {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(generatedPerson("Juan", "Albiol"));
        persons.add(generatedPerson("Mariana", "Vidad"));
        persons.add(generatedPerson("Solomeo", "Paredes"));
        persons.add(generatedPerson("Jean", "Paul"));
        persons.add(generatedPerson("Paul", "Jean"));

        return persons;
    }

    private static Person generatedPerson(String name, String lastName) {
        SupplierCustom<String, String, Person> generatePerson;

        generatePerson = (nam, lastNam) -> new Person(nam, lastNam);
        //generatedPerson = Person::new;

        return generatePerson.get(name, lastName);
    }
}
