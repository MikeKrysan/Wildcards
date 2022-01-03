package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test  {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);

        /*
        Object
        Animal
        Dog
         */

    }

    private static void test(List<? extends Animal> list) {   //на вход метод принимает list животных (1) (2)
        for(Animal animal : list) { //для каждого animal в этом list
            //System.out.println(animal); // мы выводим это животное
            animal.eat();
        }
    }
}


/*
1. Мы хотим вывести на экран каждое животное, которое передается на вход в качестве аргумента
2. super - все элементы класса Animal либо выше (Object). Extends - Animal + Dogs
 */