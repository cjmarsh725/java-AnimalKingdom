package com.lambdaschool;

import java.util.ArrayList;

public class Main {

    public static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester)
    {
        for (Animal a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a.getName() + " - " + a.getYear());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        // Mammals
        animals.add(new Mammal("Panda", 1869));
        animals.add(new Mammal("Zebra", 1778));
        animals.add(new Mammal("Koala", 1816));
        animals.add(new Mammal("Sloth", 1804));
        animals.add(new Mammal("Armadillo", 1758));
        animals.add(new Mammal("Raccoon", 1758));
        animals.add(new Mammal("Bigfoot", 2021));
        // Birds
        animals.add(new Bird("Pigeon", 1837));
        animals.add(new Bird("Peacock", 1821));
        animals.add(new Bird("Toucan", 1758));
        animals.add(new Bird("Parrot", 1824));
        animals.add(new Bird("Swan", 1758));
        // Fish
        animals.add(new Fish("Salmon", 1758));
        animals.add(new Fish("Catfish", 1817));
        animals.add(new Fish("Perch", 1758));

        System.out.println("List all the animals in descending order by year named:");
        animals.sort((a1, a2) -> a2.getYear() - a1.getYear());
        animals.forEach(a -> System.out.println(a.getName() + " - " + a.getYear()));
        System.out.println("\nList all the animals alphabetically:");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animals.forEach(a -> System.out.println(a.getName() + " - " + a.getYear()));
        System.out.println("\nList all the animals order by how they move:");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animals.forEach(a -> System.out.println(a.getName() + " - " + a.getYear()));
        System.out.println("\nList only those animals the breath with lungs:");
        printAnimals(animals, a -> a.breathe().equals("Lungs"));
        System.out.println("\nList only those animals that breath with lungs and were named in 1758:");
        printAnimals(animals, a -> a.breathe().equals("Lungs") && a.getYear() == 1758);
        System.out.println("\nList only those animals that lay eggs and breath with lungs:");
        printAnimals(animals, a -> a.breathe().equals("Lungs") && a.reproduce() == "Eggs");
        System.out.println("\nList alphabetically only those animals that were named in 1758:");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animals, a -> a.getYear() == 1758);
    }
}
