package Wildcards_1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Animal1> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal1(1));
        listOfAnimal.add(new Animal1(2));

        List<Animal1> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog1());
        listOfDog.add(new Dog1());

        test(listOfAnimal);
        test(listOfDog);

    }

    private static void test(List<? extends Animal1> list) {
        for(Animal1 animal : list) {
           // System.out.println(animal);
            animal.eat();
        }

    }
}
